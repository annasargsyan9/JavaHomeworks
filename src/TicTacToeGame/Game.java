package TicTacToeGame;

public class Game {

    private Player playerX;
    private Player playerO;
    private Board board;

    public Game() {
        this.board = new Board();
        this.playerX = new Player('X');
        this.playerO = new Player('O');
    }

    public Game(Board board) {
        this.board = board;
        this.playerX = new Player('X');
        this.playerO = new Player('O');
    }

    public Game(Board board, Player playerX, Player playerO) {
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;
    }

    public String playGame() {
        char currentPlayerMarker = 'X';
        while (true) {
            board.printBoard();
            Player currentPlayer = (currentPlayerMarker == 'X') ? playerX : playerO;
            String move = currentPlayer.getMove(board);
            if (!board.submitMove(move, currentPlayerMarker)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            if (board.isWinner(currentPlayerMarker)) {
                board.printBoard();
                return currentPlayerMarker + " wins!";
            }
            if (board.isTie(playerX.getMarker(), playerO.getMarker())) {
                board.printBoard();
                return "Tie";
            }
            currentPlayerMarker = (currentPlayerMarker == 'X') ? 'O' : 'X';
        }
    }
}
