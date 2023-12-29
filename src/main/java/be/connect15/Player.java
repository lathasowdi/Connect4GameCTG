package be.connect15;

import java.util.Objects;

/**
 * Interface representing a player in the Connect4 game.
 */
public abstract  class Player {
    //Abstract Methods


    abstract int getPlayerNumber();
    abstract void play(Board board) throws InterruptedException;

    //Non-abstract Methods
    // Check if the user input is a valid column selection
     boolean isValidInput(String input) {
        return (Objects.equals(input, "1") || Objects.equals(input, "2") || Objects.equals(input, "3") ||
                Objects.equals(input, "4") || Objects.equals(input, "5") || Objects.equals(input, "6") ||
                Objects.equals(input, "7") ||Objects.equals(input, "8") || Objects.equals(input, "9") ||
                Objects.equals(input, "10") || Objects.equals(input, "11") || Objects.equals(input, "12") ||
                Objects.equals(input, "13") || Objects.equals(input, "14")|| Objects.equals(input, "15"));
    }
}
