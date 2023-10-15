/**
 * Q. Maze Problem, returning all the answers (ways) in an ArrayList.
 * 
 *    Here, you can also move Diagonally, Now we've three ways ->
 *      
 *          1. Down, 2. Right, 3. Diagonal
 */

import java.util.ArrayList;

public class MazeDigonal {
    public static void main(String[] args) {
        ArrayList<String> ways = MazeReturnDiagonal(0, 0, 2, "");

        System.out.println("Ways : " + ways);
    }

    // Adding move - Diagonal.
    public static ArrayList<String> MazeReturnDiagonal(int x, int y, int size, String ans) { // Here size is n-1 in an n*n matrix.

        if (x == size && y == size) {
            ArrayList<String> answers = new ArrayList<String>();
            answers.add(ans);

            return answers;
        }
        
        ArrayList<String> answers = new ArrayList<String>();

        if (x<size) answers.addAll(MazeReturnDiagonal(x + 1, y, size, ans + "D"));
        if (y<size) answers.addAll(MazeReturnDiagonal(x, y + 1, size, ans + "R"));
        
        // Diagonal Move
        if (x<size && y<size) answers.addAll(MazeReturnDiagonal(x+1, y+1, size, ans+"X")); // "X" represents Diagonal move.

        return answers;
    }
}