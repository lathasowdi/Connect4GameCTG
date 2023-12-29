package be.connect3;

/**
 * Class representing the Connect4 game logic.
 */
public class Game {
    private GameComponent board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    /**
     * Constructor for the Game class.
     */
    public Game() {
        board = new Board();
        player1 = new HumanPlayer(1);
        player2 = new ComputerPlayer(2);
        currentPlayer = player1;
        board.display();
    }

    private void switchPlayerTurn() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private void showWinner() {
        System.out.println("Player " + currentPlayer.getPlayerNumber() + " Wins !!!");
    }

    /**
     * Starts and plays the Connect4 game.
     */
    public void playGame() throws InterruptedException {
        while (true) {
            currentPlayer.play((Board) board);
            if (checkForWinner()) {
                showWinner();
                break;
            } else if (board.isBoardFull()) {
                System.out.println("It is a DRAW");
                break;
            }
            switchPlayerTurn();
        }
    }

    private boolean checkForWinner() {
        return (checkVerticalWinner() || checkHorizontalWinner() || checkRightDiagonalWinner() || checkLeftDiagonalWinner());
    }

    private boolean checkVerticalWinner() {
        String[][] gameBoard = ((Board) board).getBoard();

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 1; i++) {
                if (gameBoard[i][j].equals(gameBoard[i + 1][j]) &&
                        gameBoard[i][j].equals(gameBoard[i + 2][j]) &&
                        (gameBoard[i][j].equals(" £ ") || gameBoard[i][j].equals(" $ "))) {
                    return true; // Found a vertical winner
                }
            }
        }
        return false;
    }

    private boolean checkHorizontalWinner() {
        String[][] gameBoard = ((Board) board).getBoard();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (gameBoard[i][j].equals(gameBoard[i][j + 1]) &&
                        gameBoard[i][j].equals(gameBoard[i][j + 2]) &&
                        (gameBoard[i][j].equals(" £ ") || gameBoard[i][j].equals(" $ "))) {
                    return true; // Found a horizontal winner
                }
            }
        }
        return false;
    }

    private boolean checkLeftDiagonalWinner() {
        String[][] gameBoard = ((Board) board).getBoard();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                if (gameBoard[i][j].equals(gameBoard[i + 1][j + 1]) &&
                        gameBoard[i][j].equals(gameBoard[i + 2][j + 2]) &&
                        (gameBoard[i][j].equals(" £ ") || gameBoard[i][j].equals(" $ "))) {
                    return true; // Found a left diagonal winner
                }
            }
        }
        return false;
    }

    private boolean checkRightDiagonalWinner() {
        String[][] gameBoard = ((Board) board).getBoard();

        for (int i = 1; i < 1; i++) {
            for (int j = 1; j < 1; j++) {
                if (gameBoard[0][2].equals(gameBoard[1][1]) &&
                        gameBoard[0][2].equals(gameBoard[2][0]) &&
                        (gameBoard[0][2].equals(" £ ") || gameBoard[i][j].equals(" $ "))) {
                    return true; // Found a right diagonal winner
                }
            }
        }
        return false;
    }
}