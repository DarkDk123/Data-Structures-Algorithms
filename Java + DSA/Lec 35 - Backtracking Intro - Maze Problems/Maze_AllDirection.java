/** 
 * Finding all the ways to target in a Maze when some Obstacles are still present in the maze.
 * 
 *  But this time we are making our moves expand : Left, Right, Up, Down!!
 *  
 *  Mapping "False" to the already visited cells! This way we can move to Unique Cells.
 *  This helps in breaking recursion. 
 *  
 *  After backing off (Backtracking), we're reversing the changes to the actual values again.
 *  To Allow other paths to be discovered.
 * 
 *  Thought Process of backtracking: 
 *              Make a change : Use that in recursive function calls.
 *      Then    Revert the change : Get Back to Original State | Backtrack.
 */

import java.util.*;

public class Maze_AllDirection {
    public static void main(String[] args) {
        boolean[][] obstacles = {
                                    {true, true, true},
                                    {true, true, true},
                                    {true, true, true},
                                    
                                };
        
        List<String> answer = maze_2(0, 0, "", obstacles);

        System.out.println("Available ways : " + answer.size() + " | " + answer );
    }

    public static List<String> maze_2(int x, int y, String ans, boolean[][] obstacles) {
        if(x<0 || x>=obstacles.length || y<0 || y>=obstacles[0].length || !obstacles[x][y]) return new ArrayList<>();// False | Now way out!!

        if (x == obstacles.length-1 && y == obstacles[0].length-1) {
            List<String> answers = new ArrayList<String>();
            answers.add(ans);
            return answers;
        }
        
        List<String> answers = new ArrayList<String>();
        
        // Cell visited | Assigning False.
        obstacles[x][y] = false;

        // Going in all the ways available | Diagonal, Reverse-Diagonal, Up, Down, Left, Right.
        answers.addAll(maze_2(x+1, y+1, ans + "X", obstacles)); // Diagonal.

        answers.addAll(maze_2(x + 1, y, ans + "D", obstacles)); // Down.

        answers.addAll(maze_2(x, y + 1, ans + "R", obstacles)); // Right.

        answers.addAll(maze_2(x-1, y-1, ans + "*", obstacles)); // Reverse Diagonal. | Applicable to more than 3 rows only.

        answers.addAll(maze_2(x-1, y, ans + "U", obstacles)); // Up.

        answers.addAll(maze_2(x, y-1, ans+"L", obstacles)); // Left

        // Reversing the changes made.
        obstacles[x][y] = true; // Backtracking.

        return answers;
    }
}
