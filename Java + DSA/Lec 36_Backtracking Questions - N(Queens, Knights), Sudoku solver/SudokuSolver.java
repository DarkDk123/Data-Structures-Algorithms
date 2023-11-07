/**
 * 
 * Q. Sudoku Solver : Leetcode hard Question.
 * 
 *  "How to identify a backtracking problem??"
 *    
 *    Whenever you're given a problem where recursion takes place and you can't afford a wrong placement/call
 *    & you've to undo your changes, that's a Backtracking Problem. 
 * 
 *    OR When a choice can affect all future values, use backtracking to undo it on chance.
 */

class SudokuSolver {
    public static void main(String[] args) {
       char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        sudokuSolver(board, 0, 0);
        System.out.println("The Answer board is :  \n");
        display(board);
    }

    public static boolean sudokuSolver(char[][] board, int r, int c){
        // Row over? we did it!
        if (r == board.length){
            return true;
        }

        // Column over? Next row now!
        if(c==board.length){
            return sudokuSolver(board, r+1, 0);
        }
        
        // If column isn't empty!
        if(board[r][c] != '.'){
            return sudokuSolver(board, r, c+1);
        }

        boolean ans = false;
        for(int i=1; i<=9; i++){
            char sub = (char)(i+48); // Adding 48 to get ASCII value.
            if(posValid(r, c, board, sub)){
                board[r][c] = sub;
                ans = sudokuSolver(board, r, c+1);
                if (ans) return ans;
                if(!ans) board[r][c] = '.'; // Backtrack
            }
        }

        // we did something wrong! let's go back
        return ans;
    }

    // Method to check valid position.
    private static boolean posValid(int r, int c, char[][] board, char sub){

        // First, check in same row.
        // Along it, check in the same col also.
        for(int i=0; i<9; i++){
            if (board[r][i] == sub) return false;
            if(board[i][c] == sub) return false;
        }

        // Check in the same sub-box / grid.
        for(int row = r-(r%3); row <= r+(2-(r%3)); row++){
            for(int col = c-(c%3); col <= c+(2-(c%3)); col++){
                if(board[row][col] == sub) return false;
            }
        }

        // It's a good position
        return true;
    }

    // Display method !
    private static void display(char[][] board){
        for(char[] row : board){
            for(char val : row){
                System.out.print("|_" + val + "_");
            }
            System.out.print("|\n");
        }
    }
}