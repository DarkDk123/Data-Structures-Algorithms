import java.util.HashSet;


/**
 * Q7 Find weather the number number is Happy or Not !!
 * LeetCode : "https://leetcode.com/problems/happy-number/"
 */
public class Q7_HappyNumber {

    // Solution 1: 
    public boolean isHappy(int n) {
    HashSet<Integer> inLoop = new HashSet<Integer>();
    int squareSum,remain;

	while (!inLoop.contains(n)) {
        inLoop.add(n);
		squareSum = 0;
		while (n > 0) {
		    remain = n%10;
			squareSum += remain*remain;
			n /= 10;
		}
		
        if (squareSum == 1)
			return true;
		
		n = squareSum;

	}
	return false;
    
}
    

    // Solution 2: In context of LL.
    // Using Slow and Fast Pointers
    public boolean isHappy2(int n) {
        if (getSum(n) == 1) {
            return true;
        }

        int slow, fast;
        slow = fast = n;

        while (slow != 1 && fast != 1) {
            slow = getSum(slow);
            fast = getSum(getSum(fast));

            if (slow == fast) {
                return false;
            }
        }

        return true;
    }

    // Get sum of squares of digits.
    private int getSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }
}