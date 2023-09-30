/**
 * Q. Maze Problem | Total Ways to get to the desired position.
 * 
 *  It actually uses Recursion Only (not backtracking now).
 *  A Maze Problem using just Right & Down as moves.
 */
public class Maze{
    public static void main(String[] args) {
        System.out.println("Total " + countWays(0, 0, 2) + " Ways.\n");
        maze_2(0, 0, 2, "");
    }


    public static int countWays(int x, int y, int size){
        
        if (x==size || y==size){ // Only one way now | Found one answer!
            return 1;
        }
    
        int downCount = countWays(x+1, y, size); // Go down!
        int rightCount = countWays(x, y+1, size); // Go Right!

        return downCount+rightCount;
    }

    // My First Approach for getting all the routes.
    public static void maze(int x, int y, int size, String ans){
        
        if (x==size && y==size){
            System.out.println(ans);
            return;
        }

        // This can further be only 2 if statements! But i don't wanna remove my first approach here!
        if (x<size && y<size){
            maze(x+1, y, size, ans+"D");
            maze(x, y+1, size, ans+"R");
        }

        else if(x<size){
            maze(x+1, y, size, ans+"D");
        }
        else{
            maze(x, y+1, size, ans+"R");
        }
    }

    // Approach clicked up by seeing kunal's code for count! 
    public static void maze_2(int x, int y, int size, String ans){
        
        if (x==size || y==size){
            while(size>x++) ans+="D";
            while(size>y++) ans+="R";
            System.out.println(ans);
            return;
        }

        maze_2(x+1, y, size, ans+"D");
        maze_2(x, y+1, size, ans+"R");
    }
}