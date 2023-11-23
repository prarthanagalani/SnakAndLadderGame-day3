public class SnakeAndLadderGame {

    private int playerPosition;

    // Use Case 1 : initialize position of player with 0.
    public SnakeAndLadderGame() {
        this.playerPosition = 0;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder game!!");

        // Use Case 1: Snake and Ladder game played with a single player at start
        // position 0
        SnakeAndLadderGame game = new SnakeAndLadderGame();
    }
}