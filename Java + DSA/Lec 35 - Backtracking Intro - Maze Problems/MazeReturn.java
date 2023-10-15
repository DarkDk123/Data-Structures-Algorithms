/**
 * Q. Maze Problem, returning all the answers (ways) in an ArrayList.
 */

import java.util.ArrayList;

public class MazeReturn {
    public static void main(String[] args) {
        ArrayList<String> ways = mazeReturn(0, 0, 2, "");

        System.out.println("Ways : " + ways);
    }

    // Returning ArrayList.
    public static ArrayList<String> mazeReturn(int x, int y, int size, String ans) { // Here size is n-1 in an n*n matrix.

        if (x == size && y == size) {
            ArrayList<String> answers = new ArrayList<String>();
            answers.add(ans);

            return answers;
        }
        
        ArrayList<String> answers = new ArrayList<String>();

        if (x<size) answers.addAll(mazeReturn(x + 1, y, size, ans + "D"));
        if (y<size) answers.addAll(mazeReturn(x, y + 1, size, ans + "R"));

        return answers;
    }
}