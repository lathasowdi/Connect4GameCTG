Connect 4 is a tic-tac-toe with gravity played on a board with 6 rows and 7 columns. 
As the name implies, the goal is to get 4 in a row ( this can be vertically, horizontally, or diagonally). 
Checkers are dropped at the top of a column and fall until they reach the bottom or land on another checker.
Class Board is to initializeBoard, display and get Board,set the corresponding player piece,to getNextAvailableSlot and to verify isColumnFull and isBoardFull.
Class GameComponent is abstract and extended by Class Board.
Class Game is for intializing a Board,playing the game (swapping Player1 and Player2), checking for winner vertically, horizontally, diagonally(both left and right).
Class Connect4  contains Main method and it is for playing the Game.

   
   
