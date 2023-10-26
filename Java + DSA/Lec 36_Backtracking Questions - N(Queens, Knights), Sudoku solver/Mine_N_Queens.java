/**
 * Q. Put "n" Queens in a n*n matrix, so that no Queen can reach the other one in it's 1 move.
 * 
 *     Queens can move only like in chase. | Vertically, Horizontally & Diagonally.
 * 
 *     I did to Find only the First answer that comes.
 */

public class Mine_N_Queens {
    public static void main(String[] args) {
        putQueen(0, 0, new boolean[4][4]);
    }

    // Recursive Approach for each row & column.
    public static boolean putQueen(int r, int c, boolean[][] board){
        // Out of the Board.
        if(r==board.length){
            displayBoard(board);
            return true;
        }
        
        if (c==board.length){
            return false;
        }

        // Check if it is safe to place it;
        if (posValid(r, c, board)){
            board[r][c] = true;
            
            // Now check for below rows
            if (putQueen(r+1, 0, board)) return true;
            board[r][c] = false;
        }

        return putQueen(r, c+1, board);

    }
    public static boolean posValid(int r, int c, boolean[][] board){
        // Check above !!
        for(int row=0; row<r; row++){
            if (board[row][c]) return false;
        }

        // Check left Diagonal !!
        for(int i=1; i<=Math.min(r, c); i++){
            if(board[r-i][c-i]) return false;
        }
        
        // Check right diagonal
        for(int i=1; i<=Math.min(r, board.length - c - i); i++){
            if(board[r-i][c+i]) return false;
        }
        
        return true;
    }

    public static void displayBoard(boolean[][] board){
        for(boolean[] row : board){
            for(boolean val : row){
                System.out.print(((val)?"Q":"-") + ", ");
            }
            System.out.println();
        }
        System.out.print("\n\n");
    }
}
