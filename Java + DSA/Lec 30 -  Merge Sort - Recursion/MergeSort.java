import java.util.Arrays;

/**
 * Q. Merge Sort Using Recursion.
 *    
 *  By Creating New Arrays. 
 *
 *  I've done it myself, i created new arrays at the base condition only, It's too close to in-place sorting.
 *  But at the End I returned new arrays, merged them & again returned new Answer Arrays, making it a
 *  non-inplace sorting algo. 
 *                      While the instructor implemented it without start & end, providing new array object
 *  at every function recall. (This ways are too memory consumable).
 *  
 */

public class MergeSort{
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 10, 98, 50, 24, 5421, 10, 12, -52, 12, -0, -54, 12, -7}; 
        System.out.println("Merged Array : " + Arrays.toString(mergeSort(arr1, 0, arr1.length-1)));
    }

    // Recursive Function for Merge Sort
    public static int[] mergeSort(int[] arr, int start, int end) {
        if (arr.length==0) return new int[]{};
        // Base condition
        if (start==end) return new int[]{arr[start]}; // Array with individual elements.

        int mid = start + (end - start)/2; // mid to divide
        int[] left = mergeSort(arr, start, mid); // Left part
        int[] right = mergeSort(arr, mid+1, end); // Right Part

        return merge(left, right); // merge & return.
    }

    // Merge two Sorted Arrays.
    public static int[] merge(int[] arr1, int[] arr2) {
        // Answer Array.
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0; // initialize pointers to compare & put.

        while (i < arr1.length || j < arr2.length) {
            
            // Both arrays remains elements | Compare them.
            if (i!=arr1.length && j!=arr2.length){
                if(arr1[i] < arr2[j]){
                    ans[k++] = arr1[i++];
                }
                
                else{
                    ans[k++] = arr2[j++];
                }
            }

            // arr1 is remaining | Add it's elements.
            else if(i!=arr1.length){
                ans[k++] = arr1[i++];
            }

            // arr2 is remaining | Add it's elements.
            else{
                ans[k++] = arr2[j++];
            }
            
        }

        return ans; // Merged Array.
    }
    

}