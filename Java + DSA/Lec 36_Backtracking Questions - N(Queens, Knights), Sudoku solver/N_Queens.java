
/**
 * Q.1 Given "n" Queens, we have to put these n Queens on a "n*n" board (matrix) in such a way
 *     that they do not cross each other in one move.
 *      
 *     The Queen can move vertically, horizontally & diagonally just like in real chase.
 */

public class N_Queens{
    public static void main(String[] args) {
        System.out.println(putQueen(0, 4, new boolean[4][4]));
    }

    public static int putQueen(int r, int n, boolean[][] board){
        // Out of the Board.
        if(r==n){
            displayBoard(board);
            return 1;
        }
        
        int count = 0;
        // Try to place at every column
        for(int col = 0; col<n; col++){
            // Check if it is safe to place it;
            if (checkValid(r, col, n, board)){
                board[r][col] = true;
                // Now check for below rows
                count += putQueen(r+1, n, board);
                board[r][col] = false;
            }
        }

        return count;

    }

    private static boolean checkValid(int r, int c, int n, boolean[][] matrix){
        // Check Up vertically.
        int row = r , col = c;
        while(r>=0){
            if (matrix[r][c]) return false;
            r--;
        }

        // Check back diagonally
        r = row; c = col;
        while(c>=0 && r>=0){
            if(matrix[r][c]) return false;
            c--;r--;
        }

        // Check forward diagonally
        r = row; c = col;
        while(r>=0 && c<n){
            if (matrix[r][c]) return false;
            r--;c++;
        }

        return true;
    }

    private static void displayBoard(boolean[][] board){
        for(boolean[] row : board){
            for(boolean val : row){
                System.out.print((val)?"Q":"-" + ", ");
            }

            System.out.println();
        }
        System.out.println("\n");
    }


}