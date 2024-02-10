import java.util.Stack;

/**
 * It's a Leet code hard question.
 * 
 * ** How to know what to use!! **
 * We know when working with sequences/answer till here.
 * When we need items in sequences, we use Stack or Queue.
 * 
 * Here, we need to store answer till here, from start, hence strong probability
 * that we need a Stack to store last answer.w
 */

// Easy using Stack.

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
}