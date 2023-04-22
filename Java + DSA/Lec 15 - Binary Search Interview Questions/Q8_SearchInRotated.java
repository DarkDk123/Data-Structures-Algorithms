/**
 * Q. Find an Element in a Rotated Sorted Array.
 * 
 * 'A Rotated array is a sorted array which is rotated from a pivot point
 *  i.e. sorted Array = [1, 2, 3, 4, 5, 6, 7, 8] is pivoted from element 4
 *  the rotated array will be [5, 6, 7, 8, 1, 2, 3, 4]'
 */
public class Q8_SearchInRotated {
    public static void main(String[] args) {

        // Main Functioning
        int[] rotatedArray = {4, 5, 6, 7, 8, 9, 10, 0};
        int result = solution(7, rotatedArray);
        System.out.println(result);

    }

    // Method to Find Element in Rotated Array
    static int solution(int target, int[] rotatedArray){
        if (rotatedArray.length==0) return -1;
        // Determining Peak
        int peakEle = PeakInRotated(rotatedArray);
        int leftSearch = SearchBinary(target, rotatedArray, 0, peakEle);
         
        return (leftSearch!=-1)?leftSearch:SearchBinary(target, rotatedArray, peakEle+1, rotatedArray.length-1);

    }



    
    // Method to Find Peak Index in a Rotated Array.
    static int PeakInRotated(int[] rotatedArray){
        if (rotatedArray.length==1) return 0;
        int start = 0;
        int end = rotatedArray.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            
            if ( mid<rotatedArray.length-1 && (rotatedArray[mid]>rotatedArray[mid+1])) return mid;
            else if(rotatedArray[mid]>=rotatedArray[0]) start = mid+1;
            else end=mid-1;

        }

        return -1;

    }
    // Binary Search using While Loop.
    static int SearchBinary(int key, int[] array, int start, int end) {

        // loop won't start if array is Empty i.e. (0<-1=false)
        while (start <= end) {
           
            int mid = start + (end-start)/2;//(start + end) / 2;
            if (key == array[mid])
                return mid;
            else if (key > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
