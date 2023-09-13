/**
 * What if we want to remove all occurrences of a String itself from a larger string?
 * 
 * Q. Program to remove all occurrences of a string from another string.
 */

public class Skip_str {
    public static void main(String[] args) {
        String str = "I want to eat Apple and applethis, is the bestapple of the appleworld, but apple isn't that great. appleApple";
        System.out.println(removeApple(str));
    }

    public static String removeApple(String contest) {
        if (contest.length() == 0) // Can call string.isEmpty()!
            return "";

        if (contest.toLowerCase().startsWith("apple")){
            return removeApple(contest.substring(5)); // Length of the String to be removed
        }
        else return contest.charAt(0) + removeApple(contest.substring(1));
    }
}
