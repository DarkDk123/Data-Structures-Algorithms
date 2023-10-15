/** 
 * Finding all the ways to target in a Maze when some Obstacles are still present in the maze.
 */

import java.util.*;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] obstacles = {
                                    {true, true, true},
                                    {true, false, true},
                                    {true, true, true}
                                };

        System.out.println("Available ways : " + maze_2(0, 0, "", obstacles));
    }

    public static List<String> maze_2(int x, int y, String ans, boolean[][] obstacles) {
        if(!obstacles[x][y]) return new ArrayList<>();// False | Now way out!!

        if (x == obstacles.length-1 && y == obstacles[0].length-1) {
            List<String> answers = new ArrayList<String>();
            answers.add(ans);
            return answers;
        }
        
        List<String> answers = new ArrayList<String>();

        if (x<obstacles.length-1 && y<obstacles.length-1){
            answers.addAll(maze_2(x+1, y+1, ans + "X", obstacles));
        }

        if (x<obstacles.length-1) answers.addAll(maze_2(x + 1, y, ans + "D", obstacles));

        if (y<obstacles.length-1) answers.addAll(maze_2(x, y + 1, ans + "R", obstacles));
        
        return answers;
    }
}
