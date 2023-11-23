import java.util.Random;

public class SnakeAndLadderGame {

    private int playerPosition;

    // Use Case 1 : initialize position of player with 0.
    public SnakeAndLadderGame() {
        this.playerPosition = 0;
    }

    // Use Case 2: Roll the die to get a number between 1 to 6.
    private int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder game!!");

        // Use Case 1: Snake and Ladder game played with a single player at start
        // position 0
        SnakeAndLadderGame game = new SnakeAndLadderGame();
    }
}