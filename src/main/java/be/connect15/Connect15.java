package be.connect15;

/**
 * Class representing the Connect4 game.
 */
public class Connect15 {
    /**
     * Main method to start the Connect4 game.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.playGame();
    }
}
