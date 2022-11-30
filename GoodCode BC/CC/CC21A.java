package CC;

import java.util.Scanner;

public class CC21A {
   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      // 20. CODING CHALLENGE (Module 12: Tutorial 21 - 26)
      // a. Difficult: Medium/ Somewhat Hard
      String[] wordsArray = {"background", "earthlings", "category", "united", "masterful", "something", "randomize", "crazy", "swordplay", "terminals"};

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
      
      // Fails Counter
      int fails = 0;  // if fails == 5 -> GAME OVER

      // Keep looping and asking the user to guess the hidden word
      while (fails < 5){
         printGuessArray(guessArray);
         System.out.println("\nGuess a letter in the word: ");
         char letter = scan.next().charAt(0);
         boolean correct = letterIsInHiddenWord(letter, hiddenWordArray, guessArray);
         if (correct) {
            System.out.println("Correct.");
            boolean hasWon = userHasWon(guessArray);
            if (hasWon){
               System.out.println("\nYou Win.");
               break;
            }
         } else {
            fails++;
            System.out.println("Wrong. Fails: " + fails + "/5");

            if (fails == 5){
               System.out.println("\nYou lost.");
            }
         }
      }
   }

   // a.
   // Function that prints the current state of the guessed letters in the hiddenWord
   public static void printGuessArray(Character[] guessArray) {
      System.out.println();
      for (int i = 0; i < guessArray.length; i++) {
         System.out.print(guessArray[i] + " ");
      }
      
   }
   
   // Check if letter is in the hiddenWord
   public static boolean letterIsInHiddenWord(char letter, char[] hiddenWordArray, Character[] guessArray) {
      for (int i = 0; i < hiddenWordArray.length; i++) {
         if (letter == hiddenWordArray[i]){
            guessArray[i] = hiddenWordArray[i];
            return true;
         }
      }
      return false;
   }

   // Check if user has won
   public static boolean userHasWon(Character[] guessArray) {
      System.out.println("Checking Win status");
      for (int i = 0; i < guessArray.length; i++) {
         if (guessArray[i] == '_'){
            // user hasn't won. because their are still '_' (empty guesses)
            return false;
         }
      }
      return true;
   }

}
