/**
 * Now Just by modifying a bit.
 * 
 * Q. Now Skip all the 'app's from a string only when it is not 'apple'.
 */

public class SkipAppNotApple {
    public static void main(String[] args) {
        String str = "I found some app about apple not exactly app but application.";
        System.out.println(skipApp(str));
    }

    public static String skipApp(String contest) {
        if (contest.isEmpty())
            return "";

        if (contest.toLowerCase().startsWith("app") && !contest.toLowerCase().startsWith("apple")){
            return skipApp(contest.substring(3));
        }
        else {
            return contest.charAt(0) + skipApp(contest.substring(1));
        }
    }

}
