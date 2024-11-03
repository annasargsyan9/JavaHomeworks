package TicTacToeGame;

public class Board {

    private char[][] gameBoard;

    public Board() {
        gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    public Board(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Board(Board that) {
        this.gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(that.gameBoard[i], 0, this.gameBoard[i], 0, 3);
        }
    }

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

    public boolean submitMove(String move, char player) {
        int row = move.charAt(0) - '0';
        int col = move.charAt(1) - '0';
        if (gameBoard[row][col] == ' ') {
            gameBoard[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (char[] row : gameBoard) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }

    public boolean isBoardEmpty() {
        for (char[] row : gameBoard) {
            for (char cell : row) {
                if (cell != ' ') return false;
            }
        }
        return true;
    }

    public boolean isWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player) return true;
            if (gameBoard[0][i] == player && gameBoard[1][i] == player && gameBoard[2][i] == player) return true;
        }
        return (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) ||
                (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player);
    }

    public boolean isTie(char playerX, char playerO) {
        return isBoardFull() && !isWinner(playerX) && !isWinner(playerO);
    }
}
