package CC;

import java.util.Scanner;

public class CC21B {
   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      // 20. CODING CHALLENGE (Module 12: Tutorial 21 - 26)
      // b. Difficulty: Hard
      // Board
      char[][] board = {
         {'_', '_', '_'},
         {'_', '_', '_'},
         {'_', '_', '_'}
      };
      printBoard(board);
      int maxPlayCount = 0;
      boolean oTurn = false;
      boolean xTurn = true;

      System.out.println("Welcome to Daniels Tic Tac Toe program. \n");
      while (maxPlayCount < 9){
         if (xTurn){
            play('X', board);
         } else if (oTurn) {
            play('O', board);
         }
         oTurn = !oTurn;
         xTurn = !xTurn;
         maxPlayCount++;

         if (maxPlayCount >= 5){
            // check if X or 0 has won
            boolean xWins = winnerExists('X', board);
            boolean oWins = winnerExists('X', board);
            if (xWins){
               System.out.println(("X has won!\n"));
               break;
            }
            if (oWins){
               System.out.println("O has won!\n");
               break;
            }
         }
      }
   }

   
   /**
    * Function Name: PrintBoard
    * @param board (char[][])
    * 
    * Inside the function
    * - Print tic tac toe board 
    * - returns nothing
    */
   public static void printBoard(char[][] board) {
      for (int i = 0; i < board.length; i++) {
         // System.out.print("[");
         for (int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j] + " ");
         }
         System.out.println("");
      }
      System.out.println("\n");
   }

   /**
    * Function name: isValidSpot
    * @param row
    * @param column
    * @param board
    * @return
    * Inside the function:
    * - This function checks if the spot the user wants to play with is valid
    */
   public static boolean isValidSpot(int row, int column, char[][] board) {
      if (board[row][column] == '_'){
         return true;
      } else {
         return false;
      }
   }

   /**
    * Function name: play
    * @param val
    * @param board
    * Inside the function
    * - play at any spot on the tic tac toe board 
    *   that has not been taken
    */
   public static void play(char val, char[][] board) {
      System.out.println("Turn: "+ val);

      while (true){
         System.out.print("   pick a row and column number: ");
         int row = scan.nextInt();
         int column = scan.nextInt();
         boolean spotIsValid = isValidSpot(row, column, board);

         // if user enters a row or column that exceeds what we
         // currently have. Ask for user to try again.
         if (row > 2  || column > 2){
            System.out.println("Row or Columns position was exceeded. Try Again. e.g(0 1 or 1 2 or max 2 2)");
            continue;
         }
         
         if (spotIsValid) {
            // You can play at that spot
            board[row][column] = val;
            printBoard(board);
            break;
         } else {
            // You can't play at that spot
            System.out.println("That spot has already been used. Try again.");
         }
      }
   }

   
   /**
    * Function name: winnerExists
    * @param val
    * @param board
    * @return (boolean)
    * Inside the function:
    * - The function checks if any a particular user has won or not
    */
   public static boolean winnerExists(char val, char[][] board) {
      // Check Row 1
      if (board[0][0] == val && board[0][1] == val && board[0][2] == val) { return true; }
      // Check Row 2
      else if (board[1][0] == val && board[1][1] == val && board[1][2] == val) { return true; }
      // Check Row 3
      else if (board[2][0] == val && board[2][1] == val && board[2][2] == val) { return true; }
      // Check Col 1
      else if (board[0][1] == val && board[1][1] == val && board[2][1] == val) { return true; }
      // Check Col 2
      else if (board[0][1] == val && board[1][1] == val && board[2][1] == val) { return true; }
      // Check Col 3
      else if (board[0][2] == val && board[1][2] == val && board[2][2] == val) { return true; }
      // Check Diagonal
      else if (board[0][0] == val && board[1][1] == val && board[2][2] == val) { return true; }
      // Check Inverse Diagonal
      else if (board[0][2] == val && board[1][1] == val && board[2][0] == val) { return true; }
      // If No Winner Was Found return false
      else { return false; }
   }
}

// b. Difficulty: Hard
// Create a game of tic tac toe (X and O)
// _ _ _ 
// _ _ _ 
// _ _ _ 

// Welcome to Daniels Tic Tac Toe program. 

// Turn: X
//    pick a row and column number: 0 0
// X _ _ 
// _ _ _ 
// _ _ _ 


// Turn: O
//    pick a row and column number: 1 0 
// X _ _ 
// O _ _ 
// _ _ _ 


// Turn: X
//    pick a row and column number: 1 1
// X _ _ 
// O X _ 
// _ _ _ 


// Turn: O
//    pick a row and column number: 2 0
// X _ _ 
// O X _ 
// O _ _ 


// Turn: X
//    pick a row and column number: 2 2
// X _ _ 
// O X _ 
// O _ X 


// X has won!