package be.ctg.Connect4.connect4;

import java.util.Scanner;

/**
 * Class representing a human player in Connect4.
 */
public class HumanPlayer extends Player {

    private int playerNumber;

    /**
     * Constructor for the HumanPlayer class.
     *
     * @param playerNumber The player number.
     */
    public HumanPlayer(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    @Override
    public int getPlayerNumber() {
        return playerNumber;
    }


    @Override
    public void play(Board board) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Player " + playerNumber + " - Please select which column to place your piece (1-7):");
            String input = sc.nextLine();
            if (isValidInput(input) && !board.isColumnFull(Integer.parseInt(input))) {
                int column = Integer.parseInt(input);
                int row = board.getNextAvailableSlot(column - 1); // Adjust for zero-based index
                String piece = " £ ";
                board.setPiece(row, column - 1, piece); // Adjust for zero-based index
                board.display();
                break;
            } else {
                System.out.println("Invalid input or column full, please try again.");
            }
        }
    }


}
