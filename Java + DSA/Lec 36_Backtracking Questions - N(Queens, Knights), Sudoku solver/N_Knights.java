public class N_Knights {
    public static void main(String[] args) {
        System.out.println("Total Ways are : " + putKnight(new boolean[3][3], 0, 0, 4));
    }

    // Putting Knights on the board.
    public static int putKnight(boolean[][] board, int r, int c, int k){
        
        // Knights over? or rows end? | End this recursion.
        if(k==0){
            displayBoard(board);
            return 1;
        }

        if (r==board.length){
            return 0;
        }
        
        int count = 0;
        // columns completed? let's go to next row!
        if(c==board.length){
            count += putKnight(board, r+1, 0, k);
            return count;
        }

        // Check for current position.
        if(posValid(r, c, board)){
            // Put knight
            board[r][c] = true;
            count += putKnight(board, r, c+1, k-1);
            board[r][c] = false;
        }

        // Done placing at that position
        count += putKnight(board, r, c+1, k);
        return count;
    }


    // Method to Check valid position for a Knight.
    private static boolean posValid(int r, int c, boolean[][] board){
        // Check for left and Right Moves
        if(r-1>=0){
            if(c-2>=0 && board[r-1][c-2]) return false;
            if(c+2<board.length && board[r-1][c+2]) return false;
        }

        // Check for Above moves.
        if(r-2>=0){
            if(c-1>=0 && board[r-2][c-1]) return false;
            if(c+1<board.length && board[r-2][c+1]) return false;
        }
        
        // It's safe to put here!
        return true;
    }



    // Method to display board.
    private static void displayBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean val : row) {
                System.out.print(((val) ? "K" : "-") + ", ");
            }
            System.out.println();
        }
        System.out.print("\n\n");
    }
}
