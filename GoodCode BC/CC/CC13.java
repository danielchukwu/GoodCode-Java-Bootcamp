package CC;

import java.util.Scanner;

public class CC13 {
   // a.
   private static int getRandomNumber(int num) {
      double randomNumber = Math.random() * num;
      return (int) randomNumber;    // (int) converts randomNumber from (double) to (int)
   }

   // b. 
   // Log function
   private static double findLog(double value) {
      return Math.log(value);
   }
   // Sine function
   private static double findSine(double value) {
      return Math.sin(value);
   }
   // Square root function
   private static double findSquareRoot(double value) {
      return Math.sqrt(value);
   }   

   // c. 
   // Get random pick for cpu. Either rock, paper or scissors
   public static String getRandomPick() {
      int cpu_guess = (int) Math.random() * 3;   // (int) says convert Math.random() * 3 return value in (double) to (int)
      switch(cpu_guess) {
         case (0): return "rock";
         case (1): return "paper";
         case (2): return "scissors";
         default: return "";
      }
   }

   // Print the Winner
   public static void printWinner(String userPick, String cpuPick) {
      System.out.println("User Picked: " + userPick + "\nCpu Picked: " + cpuPick);
      if (userPick.equals(cpuPick)){
         System.out.println("It's a draw.");
      } else if (userPick.equals("rock") && cpuPick.equals("scissors")){
         System.out.println("Rock smashes scissors. You WIN.");
      } else if (userPick.equals("paper") && cpuPick.equals("rock")){
         System.out.println("Paper covers rock. You WIN.");
      } else if (userPick.equals("scissors") && cpuPick.equals("paper")){
         System.out.println("Scissors cuts paper into pieces. You WIN.");
      } else {
         System.out.println("Wrong pick. You LOOSE.");
      }
   }

   public static void main(String[] args) {
      // CODING CHALLENGE 13
      // a. Difficulty: Easy
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter any number: ");
      int numberInput = scan.nextInt();

      int randomNumResult = getRandomNumber(numberInput);
      System.out.println("Random Number Between 0 and " + numberInput + " is = " + randomNumResult);
      scan.close();

      // b. Difficulty: Medium
      double r1 = findLog(50);
      double r2 = findSine(90);
      double r3 = findSquareRoot(25);
      System.out.println("log50 = " + r1 + "\nsin(90) = " + r2 + "\n√25 = " + r3);

      // c. Difficulty: Hard (optional)
      System.out.println("\nWelcome to a game of Rock Paper Scissors.");
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter rock, paper or scissors: ");
      String userPick = sc.nextLine();
      String cpuPick = getRandomPick();       // function call

      printWinner(userPick, cpuPick);         // function call
      System.out.println("\nWritten By Daniel.\n");
      sc.close();
   }
}


// 13. CODING CHALLENGE (Module 8: Tutorial 11 - 16 and Module 9: Tutorial 1 - 3)

// a. Difficulty: Easy 🍔
// Create a function that returns a random number in between 0 and some number passed into the function. (Tip: use the Math.<something>)

// b. Difficulty: Medium ⚒️
// Create a function that finds 
// - the log of an input
// - the sine of an input
// - the square root of an input    (Tip: use the Math.<something>)

// c. Difficulty: Hard 🪨 (optional)
// Create a game of rock paper scissors