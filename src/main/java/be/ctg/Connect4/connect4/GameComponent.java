package be.ctg.Connect4.connect4;

/**
 * Abstract class representing a game component, such as the game board.
 */
public abstract class GameComponent {
    /**
     * Displays the current state of the game component.
     */
    protected abstract void display();

    /**
     * Checks if a column in the game component is full.
     *
     * @param column The column to check.
     * @return True if the column is full, false otherwise.
     */
    abstract boolean isColumnFull(int column);

    /**
     * Gets the next available slot in a column.
     *
     * @param column The column to check.
     * @return The next available slot in the column.
     */
    abstract int getNextAvailableSlot(int column);

    /**
     * Checks if the game component is full.
     *
     * @return True if the game component is full, false otherwise.
     */
    public abstract boolean isBoardFull();

    public abstract String[][] getBoard();

    /**
     * Sets a piece on the game component.
     *
     * @param row    The row to set the piece in.
     * @param column The column to set the piece in.
     * @param piece  The piece to set.
     */
    protected abstract void setPiece(int row, int column, String piece);
}
