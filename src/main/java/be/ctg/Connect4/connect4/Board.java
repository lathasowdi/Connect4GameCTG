package be.ctg.Connect4.connect4;

/**
 * Class representing the game board in Connect4.
 */
public class Board extends GameComponent {
    private String[][] board;


    /**
     * Constructor for the Board class.
     *  board with 6 rows and 7 columns
     */
    public Board() {
        board = new String[6][7];
        initializeBoard();
    }
    /**
     * initializeBoard
     */
    private void initializeBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = " - ";
            }
        }
    }
    /**
     * Displaying the board.
     */
    @Override
    public void display() {
        System.out.println(" ");
        System.out.println("    CONNECT4     ");
        System.out.println(" ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public String[][] getBoard() {
        return board;
    }



    @Override
    public void setPiece(int row, int column, String piece) {
        board[row][column] = piece;
    }


    /**
     * This method returns a boolean value true when the given column number is full.
     */

    @Override
    public boolean isColumnFull(int column) {
        return (board[0][column - 1].equals(" £ ") || board[0][column - 1].equals(" $ "));
    }

    /**
     * This method is to get Next Available Slot (column) in the board.
     */
    @Override
    public int getNextAvailableSlot(int column) {
        int position = 5;
        while (position >= 0 && (board[position][column].equals(" £ ") || board[position][column].equals(" $ "))) {
            position--;
        }
        return position;
    }

    /**
     * This method is for checking Board is full.
     */
    @Override
    public boolean isBoardFull() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 7; j++) {
                if (!board[i][j].equals(" £ ") && !board[i][j].equals(" $ ")) {
                    return false;
                }
            }
        }
        return true;
    }
}