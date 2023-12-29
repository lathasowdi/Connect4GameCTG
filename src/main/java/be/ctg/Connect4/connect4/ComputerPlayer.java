package be.ctg.Connect4.connect4;

import java.util.concurrent.TimeUnit;

/**
 * Class representing a human player in Connect4.
 */
public class ComputerPlayer extends Player {
    private int playerNumber;

    /**
     * Constructor for the HumanPlayer class.
     *
     * @param playerNumber The player number.
     */
    public ComputerPlayer(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    @Override
    public int getPlayerNumber() {
        return playerNumber;
    }

    int getRandomNumber(){
        System.out.println("Computer Turn");
        int min = 1; // Minimum value of range
        int max = 7; // Maximum value of range
        // Print the min and max
        //System.out.println("Random value in int from " + min + " to " + max + ":");
        // Generate random int value from min to max
        // Printing the generated random numbers
        return(int) Math.floor(Math.random() * (max - min + 1) + min);

    }



        @Override
    public void play(Board board) throws InterruptedException {
            int computerchoice= getRandomNumber();


        while (true) {
            System.out.println("Player " + playerNumber + " - Computer selects a column to place your piece (1-7):");
            TimeUnit.SECONDS.sleep(5);


            if (isValidInput(String.valueOf(computerchoice)) && !board.isColumnFull(Integer.parseInt(String.valueOf(computerchoice)))) {
                int column = Integer.parseInt(String.valueOf(computerchoice));
                int row = board.getNextAvailableSlot(column - 1); // Adjust for zero-based index
                System.out.println(computerchoice);
                String piece =  " $ ";
                board.setPiece(row, column - 1, piece); // Adjust for zero-based index
                board.display();
                break;
            } else {
                System.out.println("Invalid input or column full, please try again.");
            }
        }
    }


}
