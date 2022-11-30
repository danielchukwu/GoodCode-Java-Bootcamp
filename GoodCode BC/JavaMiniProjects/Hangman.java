package JavaMiniProjects;

import java.util.Scanner;

public class Hangman {
   static Scanner scan = new Scanner(System.in);

   // Print Hangman Art
   public static void printHangman(int lives){
      System.out.println();
      switch(lives) {
         case(0):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
            case(1):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t 0   |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
            case(2):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t 0   |");
            System.out.println("\t/    |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
            case(3):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t 0   |");
            System.out.println("\t/|   |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
            case(4):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t 0   |");
            System.out.println("\t/|\\  |");
            System.out.println("\t     |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
         case(5):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t 0   |");
            System.out.println("\t/|\\  |");
            System.out.println("\t/    |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
            case(6):
            System.out.println("\t +---+");
            System.out.println("\t |   |");
            System.out.println("\t |   |");
            System.out.println("\t 0   |");
            System.out.println("\t/|\\  |");
            System.out.println("\t/ \\  |");
            System.out.println("\t     |");
            System.out.println("   ==========");
            break;
         default:
            System.out.println("Lives did not match 0, 1, 2, 3, 4, 5 or 6");
      }
   }
   public static void main(String[] args) {
      
      String[] wordsArray = {"cat", "blue", "gone", "wish", "quite", "loud", "carole", "whale", "bread", "sense"};

      // Generate a random word from wordsArray
      double indexDouble= (Math.random() * 10);
      int index = (int) indexDouble;
      String hiddenWord = wordsArray[index];

      // Generate  hidden word array
      // - for us to latter loop around
      char[] hiddenWordArray = hiddenWord.toCharArray();
      System.out.println("A random word has been chosen.");

       // Create an empty array of the generated random words length
      int arrayLength = (int) (hiddenWordArray.length);
      Character[] guessArray = new Character[arrayLength];

      // Fill empty array with underscore
      for (int i = 0; i < guessArray.length; i++) {
         guessArray[i] = '_';
      }

      // lives
      int lives = 0;
      
      printHangman(lives);
      while (lives < 6){
         
         printGuessArray(guessArray);

         System.out.print("\n\nGuess: ");
         char letter = scan.next().charAt(0);
         boolean isCorrectGuess = letterIsInHiddenWord(letter, hiddenWordArray, guessArray);

         if (isCorrectGuess) {
            // check if user has won
            boolean hasWon = userHasWon(guessArray);
            if (hasWon){
               System.out.println("\nYOU WIN!.");
               break;
            }
         } else {
            lives++;
         }

         printHangman(lives);
      }

      if (lives == 6) {
         System.out.println("YOU LOST!");
      }
   }

   // Print array to be guessed
   public static void printGuessArray(Character[] guessArray) {
      System.out.print("\nword: ");
      for (int i = 0; i < guessArray.length; i++) {
         System.out.print(guessArray[i] + " ");
      }
   }

   // Check if letter is in the hiddenWord
   public static boolean letterIsInHiddenWord(char letter, char[] hiddenWordArray, Character[] guessArray) {
      for (int i = 0; i < hiddenWordArray.length; i++) {
         if (letter == hiddenWordArray[i]){
            if (guessArray[i] != hiddenWordArray[i]){
               guessArray[i] = hiddenWordArray[i];
               return true;
            } else {
               return false;
            }
         }
      }
      return false;
   }

   // Check if user has won
   public static boolean userHasWon(Character[] guessArray) {
      for (int i = 0; i < guessArray.length; i++) {
         if (guessArray[i] == '_'){
            // user hasn't won. because their are still '_' (empty guesses)
            return false;
         }
      }
      return true;
   }
}


// 22. CODING CHALLENGE (Module 14: Tutorial 1 && Module 15: Tutorial 1)

// Main Project
// Create a game of Hangman using all that you've learnt so far.
   
//    Guess: h

//     +---+
//     |   |
//     0   |
//    /|\  |
//    /    |
//         |
//   ==========

//   word: _ h _ _ 


//   Guess: u

//     +---+
//     |   |
//     0   |
//    /|\  |
//    / \  |
//         |
//   ==========

//   word: _ h _ _ 


//   YOU LOST!       // Good Job. YOU WON!
