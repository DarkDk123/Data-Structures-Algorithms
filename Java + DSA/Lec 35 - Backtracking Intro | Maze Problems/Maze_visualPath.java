
import java.util.*;

public class Maze_visualPath{
    public static void main(String[] args) {
        boolean[][] obstacles = {
                                    {true, true, true},
                                    {true, true, true},
                                    {true, true, true},
                                    
                                };

        int[][] pathMatrix = new int[obstacles.length][obstacles[0].length];
        
        maze_2(0, 0, "", obstacles, pathMatrix, 1);

    }


    // Just Printing Ways with Visual Paths.
    public static void maze_2(int x, int y, String ans, boolean[][] obstacles, int[][] pathMatrix,int pathStep) {
        if(x<0 || x>=obstacles.length || y<0 || y>=obstacles[0].length || !obstacles[x][y]) return; // False | Now way out!!

        if (x == obstacles.length-1 && y == obstacles[0].length-1) {
            pathMatrix[x][y] = pathStep;
            System.out.println("\nPath : " + ans);
            for(int[] row : pathMatrix){
                System.out.println(Arrays.toString(row));
            }
        }
        
        
        // Cell visited | Assigning False.
        obstacles[x][y] = false;

        // Mapping Path to Array.
        pathMatrix[x][y] = pathStep;


        // Going in all the ways available | Diagonal, Reverse-Diagonal, Up, Down, Left, Right.
        maze_2(x+1, y+1, ans + "X", obstacles, pathMatrix, pathStep + 1); // Diagonal.

        maze_2(x + 1, y, ans + "D", obstacles, pathMatrix, pathStep + 1); // Down.

        maze_2(x, y + 1, ans + "R", obstacles, pathMatrix, pathStep + 1); // Right.

        maze_2(x-1, y-1, ans + "*", obstacles, pathMatrix, pathStep + 1); // Reverse Diagonal. | Applicable to more than 3 rows only.

        maze_2(x-1, y, ans + "U", obstacles, pathMatrix, pathStep + 1); // Up.

        maze_2(x, y-1, ans+"L", obstacles, pathMatrix, pathStep + 1); // Left

        // Reversing the changes made.
        pathMatrix[x][y] = 0; // revert path changes.
        obstacles[x][y] = true; // Backtracking.

        return;
    }
}
