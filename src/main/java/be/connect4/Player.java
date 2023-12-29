package be.connect4;

/**
 * Interface representing a player in the Connect4 game.
 */
public abstract  class Player {
    //Abstract Methods


    abstract int getPlayerNumber();
    abstract void play(Board board) throws InterruptedException;

    //Non-abstract Method check for valid input

    boolean isValidInput(String input) {
        return input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '7';
    }
}
