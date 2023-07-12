// Fibonacci Terms without Recursion or Iteration.
public class fibFormula{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibFunc(i));
        }
    }

    static int fibFunc(int n){
        // A Formula we derived using previous markdown.
        // By solving recur-Fibonacci 'linear recurrence relation'.
        
        return (int)((Math.pow((1+Math.sqrt(5))/2, n) - (Math.pow((1-Math.sqrt(5))/2, n)))/Math.sqrt(5));
        
        // We can still remove the less dominating terms & still get the same answer.
        // For Longer Answers Change "int to long" in the fibFunc return type.
    }
}