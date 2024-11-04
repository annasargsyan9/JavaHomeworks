package TicTacToeGame;

public class Board {

    private char[][] gameBoard;

    // Constructor initializes an empty game board
    public Board() {
        gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    // Constructor that takes an existing game board
    public Board(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    // Copy constructor
    public Board(Board that) {
        this.gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(that.gameBoard[i], 0, this.gameBoard[i], 0, 3);
        }
    }

    // Print the current state of the game board
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + " ");
                if (j < 2) System.out.print("| ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    // Submit a move if it is valid; returns true if successful
    public boolean submitMove(String move, char player) {
        // Ensure the move string has the correct length
        if (move.length() != 2) {
            return false; // Invalid move length
        }

        // Convert characters to integers
        int row = move.charAt(0) - '0';
        int col = move.charAt(1) - '0';

        // Check for valid indices
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false; // Out of bounds
        }

        // Check if the position is empty
        if (gameBoard[row][col] == ' ') {
            gameBoard[row][col] = player;
            return true;
        }
        return false; // Position already taken
    }

    // Check if the board is full
    public boolean isBoardFull() {
        for (char[] row : gameBoard) {
            for (char cell : row) {
                if (cell == ' ') return false; // Empty cell found
            }
        }
        return true; // No empty cells
    }

    // Check if the board is empty
    public boolean isBoardEmpty() {
        for (char[] row : gameBoard) {
            for (char cell : row) {
                if (cell != ' ') return false; // Non-empty cell found
            }
        }
        return true; // All cells are empty
    }

    // Check if a player has won
    public boolean isWinner(char player) {
        for (int i = 0; i < 3; i++) {
            // Check rows and columns for a win
            if (gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player) return true;
            if (gameBoard[0][i] == player && gameBoard[1][i] == player && gameBoard[2][i] == player) return true;
        }
        // Check diagonals for a win
        return (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) ||
                (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player);
    }

    // Check for a tie
    public boolean isTie(char playerX, char playerO) {
        return isBoardFull() && !isWinner(playerX) && !isWinner(playerO);
    }
}
