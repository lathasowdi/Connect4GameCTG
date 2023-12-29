package be.connect3;

/**
 * Class representing the game board in Connect4.
 */
public class Board extends GameComponent {
    private String[][] board;

    /**
     * Constructor for the Board class.
     */
    public Board() {
        board = new String[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " - ";
            }
        }
    }

    @Override
    public void display() {
        System.out.println(" ");
        System.out.println("    CONNECT3     ");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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

    @Override
    public boolean isColumnFull(int column) {
        return (board[0][column - 1].equals(" £ ") || board[0][column - 1].equals(" $ "));
    }

    @Override
    public int getNextAvailableSlot(int column) {
        int position = 2;
        while (position >= 0 && (board[position][column].equals(" £ ") || board[position][column].equals(" $ "))) {
            position--;
        }
        return position;
    }

    @Override
    public boolean isBoardFull() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                if (!board[i][j].equals(" £ ") && !board[i][j].equals(" $ ")) {
                    return false;
                }
            }
        }
        return true;
    }
}