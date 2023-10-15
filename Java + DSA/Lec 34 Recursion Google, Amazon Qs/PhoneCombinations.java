import java.util.*;

/**
 * Q. LeetCode Question: Letter Combinations of a Phone Number.
 * 
 * "The Subset Approach is used here, cause the pattern that we're selecting
 * some and ignoring
 * other letters to get required Combinations."
 * 
 * Q. Also Count the Number of Combinations.
 */

class PhoneCombinations {

    // Creating HashMap for letters.
    public static Map<Integer, String> letterData = new HashMap<Integer, String>() {
        {
            put(2, "abc");
            put(3, "def");
            put(4, "ghi");
            put(5, "jkl");
            put(6, "mno");
            put(7, "pqrs");
            put(8, "tuv");
            put(9, "wxyz");
        }
    };

    // Main Method
    public static void main(String[] args) {
        String testString = "3568";
        List<String> ans = letterCombinations(testString);
        System.out.println("Combinations : " + ans);
        System.out.println("\nThe Count of Combinations is : " + combsCount(testString, ""));
    }

    // Method to return Arraylist of final Combinations. | using same Obj reference.
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty())
            return ans;

        combs(digits, "", ans);
        return ans;
    }
    // Helping Method for above method. | Just adds in the Given List.
    public static void combs(String digits, String cmb, List<String> ans) {
        if (digits.isEmpty()) {
            ans.add(cmb);
            return;
        }
        int index = digits.charAt(0) - '0';
        String letters = letterData.get(index);
        for (char ch : letters.toCharArray()) {
            combs(digits.substring(1), cmb + ch, ans);
        }

        return;
    }

    // Method to Count The Combinations
    // We can also drive a Formula for this i.e. "3^n" , where n = length of given `digits` string.

    // Using the same recursion for count also,

    public static int combsCount(String digits, String cmb) {
        if (digits.isEmpty()) {
            return 1;
        }
        
        int count = 0;
        int index = digits.charAt(0) - '0';
        String letters = letterData.get(index);

        for (char ch : letters.toCharArray()) {
            count += combsCount(digits.substring(1), cmb + ch);
        }

        return count;
    }
}