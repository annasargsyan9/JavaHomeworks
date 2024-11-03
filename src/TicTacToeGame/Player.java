package TicTacToeGame;
import java.util.Scanner;

public class Player {

    private char marker;
    private boolean isBot;
    private boolean strategyRandom;

    public Player() {
        this.marker = 'X';
        this.isBot = false;
    }

    public Player(char marker) {
        this.marker = marker;
        this.isBot = false;
    }

    public Player(Player that) {
        this.marker = that.marker;
        this.isBot = that.isBot;
        this.strategyRandom = that.strategyRandom;
    }

    public char getMarker() {
        return marker;
    }

    public String getMove(Board board) {
        if (isBot) {
            return strategyRandom ? getMoveRandom(board) : getMoveSimple(board);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your move (row and column): ");
            return scanner.nextLine();
        }
    }

    private String getMoveRandom(Board board) {

        return "00";
    }

    private String getMoveSimple(Board board) {

        return "00";
    }

}
