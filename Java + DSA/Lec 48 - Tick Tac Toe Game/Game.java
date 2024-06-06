import java.util.Arrays;
import java.util.Scanner;;

/**
 * <h2> Game
 * <h3>- Main runner class for running the O-X game using
 */
public class Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names;

        // Take Names
        while (true) {
            try{
                System.out.print("Please enter Users name: like - Player O, Player X -->  ");
                names = sc.nextLine().split(",");
                if (names.length != 2) throw new Exception();
                break; // If input accepted!
            }
            catch (Exception e) {System.out.println("Please Enter valid Names");}
        }

        Board gameBoard = new Board(names[0], names[1]);

        while (!gameBoard.gameOver) {
            gameBoard.viewBoard();
            System.out.print("Enter move coordinates (1 <= x,y <= 3): x, y -->  ");
            String[] xy = sc.nextLine().split(",");
            gameBoard.nextMove(Integer.parseInt(xy[0].trim()), Integer.parseInt(xy[1].trim()));
        }

        sc.close();
    }

}

/**
 * Board Class
 * 
 * - <h2> Board Class for Overall O-X game
 */
class Board {
    private String playerOName, playerXName;
    private String[][] gameBoard = new String[3][3]; // Game Board
    boolean gameOver = false;
    private boolean isPlayerOne = true;

    /**
     * Constructor of Board class
     * @param playerOne - Name of the first player | 'O' Player
     * @param playerTwo - Name of the second player | 'X' Player
     * 
     * @return - A Board Object with corresponding methods!
     */
    public Board(String playerOne, String playerTwo) {
        System.out.println("Game Started: -->  ");
        this.playerOName = playerOne + " [O]";
        this.playerXName = playerTwo + " [X]";
    }

    public boolean nextMove(int x, int y) {
        clearConsole();
        x -= 1;
        y -= 1;
        if (0 > x || x > 2 || y < 0 || y > 2 || gameBoard[x][y] != null){
            System.out.println("\nInvalid move!!");
            return false; // Already Played
        } else {
            gameBoard[x][y] = (isPlayerOne) ? "O" : "X";
            if (checkWin(x, y)) {
                System.out.printf("--> Congratulations  %s Won ", (isPlayerOne) ? playerOName : playerXName);
                viewBoard();
                clearBoard();
                gameOver = true;
            }

            isPlayerOne = !isPlayerOne;
            return true;
        }
    }

    private void clearBoard() {
        Arrays.fill(gameBoard, null);
    }

    private boolean checkWin(int x, int y) {
        // Check current row
        if (gameBoard[x][0] != null && gameBoard[x][0].equals(gameBoard[x][1])
                && gameBoard[x][1].equals(gameBoard[x][2])) {
            return true;
        }

        // Check current column
        if (gameBoard[0][y] != null && gameBoard[0][y].equals(gameBoard[1][y])
                && gameBoard[1][y].equals(gameBoard[2][y])) {
            return true;
        }

        // Check diagonals only if needed
        if (x == y || x + y == 2) {
            // Main diagonal
            if (gameBoard[0][0] != null && gameBoard[0][0].equals(gameBoard[1][1])
                    && gameBoard[1][1].equals(gameBoard[2][2])) {
                return true;
            }

            // Anti-diagonal
            if (gameBoard[0][2] != null && gameBoard[0][2].equals(gameBoard[1][1])
                    && gameBoard[1][1].equals(gameBoard[2][0])) {
                return true;
            }
        }

        // Not won
        return false;
    }

    public void viewBoard() {
        String currentPlayer = (isPlayerOne) ? playerOName : playerXName;
        System.out.printf("Player : %s\n\n", currentPlayer);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| %s".formatted((gameBoard[i][j] == null) ? " " : gameBoard[i][j]));

            }

            System.out.println("|");

        }

    }

    // Method to clear the console
    public static void clearConsole() {
        // ANSI escape code to clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}