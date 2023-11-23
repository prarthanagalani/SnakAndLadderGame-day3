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

    // Use case 4: we will play game until player reaches to 100, and if player
    // reaches <0 position we will restart from 0.
    private int playGame() {
        int TotalRolls = 0;
        int newPosition = playerPosition;
        while (newPosition < WINNING_POSITION) {

            // get unmber between 1 to 6
            int dieRoll = rollDie();

            // get option between 1 to 3
            int option = checkOption();

            // move player
            switch (option) {
                case NO_PLAY:
                    // Do nothing, player stays in the same position
                    break;
                case LADDER:
                    if (newPosition + dieRoll <= WINNING_POSITION) {
                        newPosition += dieRoll;
                    }
                    break;
                case SNAKE:
                    newPosition -= dieRoll;
                    if (newPosition < 0) {
                        newPosition = 0;
                    }
                    break;
            }

            // Use Case 5: ensures that the winning position is exact 100 and not greater than 100.
            if (newPosition <= WINNING_POSITION)
                playerPosition = newPosition;

            TotalRolls++;

            // use case 6: printing the postion of player and total number of die roll after
            // each die roll
            System.out.println("Die Roll: " + dieRoll + ", Option: " + option + ", Position: " + playerPosition);
        }

        return TotalRolls;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder game!!");

        // Use Case 1: Snake and Ladder game played with a single player at start
        // position 0
        SnakeAndLadderGame game = new SnakeAndLadderGame();

        // Use Case 6: Report the number of times the dice was played to win the game
        int diceRolls = game.playGame();
        System.out.println("Number of times the dice was played to win the game: " + diceRolls);
    }
}