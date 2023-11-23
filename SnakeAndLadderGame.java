import java.util.Random;

public class SnakeAndLadderGame {

    private int playerPosition;
    private static final int WINNING_POSITION = 100;
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    // Use Case 1 : initialize position of player with 0.
    public SnakeAndLadderGame() {
        this.playerPosition = 0;
    }

    // Use Case 2: Roll the die to get a number between 1 to 6.
    private int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Use Case 3: Check for Options (No Play, Ladder, Snake).
    private int checkOption() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder game!!");

        // Use Case 1: Snake and Ladder game played with a single player at start
        // position 0
        SnakeAndLadderGame game = new SnakeAndLadderGame();
    }
}