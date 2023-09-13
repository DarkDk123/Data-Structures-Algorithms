/**
 * Basic Question: Remove All the 'a' from a given string using recursion.
 * 
 */

public class Basic_remove_a{
    public static void main(String args[]){
        String name = "something great append aok bat at that";
        System.out.println("Ans:" + removeA(name));
        
    }

    // With index & StringBuilder object!
    public static String removeA(String contest, StringBuilder ans, int index){
        if (index==contest.length()) return ans.toString();

        if (contest.toLowerCase().charAt(index) != 'a') ans.append(contest.charAt(index));
        return removeA(contest, ans, ++index);
    }

    // Only required String in Argument.
    public static String removeA(String contest){
        if (contest.length()==0) return "";

        String string = (contest.toLowerCase().charAt(0)!='a')?contest.substring(0, 1):"";
        return string + removeA(
            contest.substring(1));
    }
}