/**
 * Q. Finding the Smallest Letter Greater than Target in an Ascending Sorted
 * Character array.
 */
public class Q3_LetterSearch {
    public static void main(String[] args) {
        // Main Functioning
        char[] array = {'d', 'e','j', 'k', 's', 'x', 'z'};
        char target = 'd';

        int result = solution(target, array);
        System.out.println((result!=-1?"Found at Index: "+result:"Not Found!!"));

    }

    static int solution(char target, char[] array){
        // If Array is Empty.
        if (array.length==0) return -1;
        
        // Initializing start & end.
        int start = 0, end = array.length-1;

        // If target is Greater than the biggest element of the Array.
        if (target>=array[end]) return start;

        // If (target)<Biggest ele. of array)
        while (start<=end){
            int mid = start + (end-start)/2;
            
            // if target>= array's mid.
            if (array[mid]<=target) start = mid+1;
            else end = mid-1;
        }

        // Returning 'start' as the answer.
        return start;
    }
}