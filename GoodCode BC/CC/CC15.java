package CC;

import java.util.Scanner;

public class CC15 {
   public static void main(String[] args) {
      // 15. CODING CHALLENGE (Module 10: Tutorial 13 - 19)
      
      // a. Difficulty: Easy (i)
      System.out.println("\n15. CODING CHALLENGE (Module 10: Tutorial 13 - 19)");
      System.out.println("\na. Easy: i");
      int count = 30;
      while (count >= 0){
         if (count == 0){
            System.out.print("STOP. \n");
            break;
         } 
         System.out.print(count + ", ");
         count--;
      }


      // a. Difficulty: Easy (ii)
      System.out.println("\na. Easy: ii");
      for (int i=0; i <= 9; i++){
         for (int j=0; j <= 9; j++){
            System.out.println(i + " " + j);
         }
      }

      // a. Difficulty: Easy (iii)
      System.out.println("\na. Easy: iii");
      int counter = 1;
      while (counter <= 20){
         if (counter % 11 == 0) {
            break;
         } else if (counter % 2 != 0){
            counter++;
            continue;
         }
         System.out.print(counter + ", ");
         counter++;
      }
      
      
      // b. Difficulty: Medium
      System.out.println("\n\nb. Medium");
      System.out.println("\nWelcome to Instagram\n");
      
      String correctUsername = "daniel";
      String correctPassword = "password123";
      boolean logUserIn = false;
      
      Scanner scan = new Scanner(System.in);
      while (logUserIn != true){
         System.out.print("Enter Username: ");
         String usernameInput = scan.nextLine();
         System.out.print("Enter Password: ");
         String passwordInput = scan.nextLine();

         if (usernameInput.equals(correctUsername) && passwordInput.equals(correctPassword)){
            System.out.println("Feedback: Username & Password Is Correct.\n");
            logUserIn = true;
         } else {
            System.out.println("Feedback: Incorrect name or password. Try again!\n");
         }
      }
      
      System.out.println("You've successfully logged into Instagram.\n");
      scan.close();
      
      
      
      // c. Difficulty: Hard
      System.out.println("\n\nc. Hard");
      System.out.println("\nWelcome to guess the number game:");
      double secretNumber = Math.random() * 10;  // generate random secrete number
      System.out.println("\nA Random SECRETE NUMBER has been generated between 0 - 9: ?");
      System.out.println("You Have Only 3 Lives/Tries.");
      secretNumber = (int) secretNumber;  // convert double to (int)

      Scanner sc = new Scanner(System.in);
      int yourGuess;
      int yourLives = 3;
      boolean youWin = false;

      while (yourLives > 0){
         System.out.print("\nMake a Guess: ");
         yourGuess = sc.nextInt();
         // If you guess number right. You Win
         if (yourGuess == secretNumber){
            youWin = true;
            break;
         } else if (yourGuess > secretNumber) {
            System.out.println("Feedback: " + yourGuess + " is greater than the secret Number");
         } else if (yourGuess < secretNumber) {
            System.out.println("Feedback: " + yourGuess + " is less than the secret Number");
         }
      }

      if (youWin == true){
         System.out.println("Good Job, You Win. The correct guess is actually " + secretNumber);
      } else {
         System.out.println("Sorry, You Loose. The correct guess is actually " + secretNumber);
      }
      System.out.println("\nWritten by Daniel.\n");
   }
}



// 15. CODING CHALLENGE (Module 10: Tutorial 13 - 19)

// a. Difficulty: Easy 🍔
// i. Using a while loop create a program that prints 30, 29, 28, 27, ... 4, 3, 2, 1, STOP.

// ii. Using nested for loops, write a program that prints the below
// >> 0 0
// >> 0 1
// >> 0 2
// >> ...
// >> 0 9
// >> 1 0
// >> 1 1
// >> ...
// >> 9 7
// >> 9 8
// >> 9 9

// iii. Write a program that uses a while loop to print 1 to 20, But skips printing any odd numbers (e.g 1, 3, 5) and also stops the while loop if a number divisible by 11 is encountered. (Tip: requires break & continue)
// >> 2, 4, 6, 8, 10,



// b. Difficulty: Medium ⚒️
// Create a user login program that allows a user to enter thier username and password and if it's correct they successfully login, else they are prompted to try again 
// Welcome to Instagram

// username: dan
// password: password123
// Feedback: Username & Password Is Correct.

// username: daniel
// password: password123
// Feedback: Logging user in

// You've successfully logged into Instagram



// c. Difficulty Hard 🪨
// Create a guess the random number video game where there is a random number generated and you have only 3 tries to guess
// the number generated

// Welcome to guess the number game:

// A Random SECRETE NUMBER has been generated between 0 - 9: ?
// You Have Only 3 Lives/Tries.

// Make a Guess: 3
// Feedback: 3 is less than the secret Number

// Make a Guess: 8
// Feedback: 8 is greater than the secret Number

// Make a Guess: 5
// Feedback: 5 is greater than the secret Number

// Sorry, You Loose. The correct guess is actually 4    // if correct, print "Good Job, You Win. The correct guess is actually 4