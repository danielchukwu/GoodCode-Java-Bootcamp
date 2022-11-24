package CC;

import java.util.Scanner;

public class CC16 {
   // a
   public static void print99To00() {
      for(int i=9; i>=0; i--){
         for(int j=9; j>=0; j--){
            System.out.println(i + " " + j);
         }
      }
   }

   // b
   public static double calculator(String userOption, double number) {
      switch (userOption) {
         case("sine"):        { return Math.sin(number); }
         case("log"):         { return Math.log(number); }
         case("square root"): { return Math.sqrt(number); }
         default:             { return -1.0; }   // return -1.0 if type doesn't math (sine, log, square root)
      }
   } 
   public static void main(String[] args) {
      // 16. CODING CHALLENGE (Module 10: Tutorial 20 - 23)
      // a. Difficulty: Easy
      print99To00();

      // b. Difficulty: Medium / Hard
      Scanner scan = new Scanner(System.in);
      System.out.println("\nCalculator");
      boolean dontStop = true;
      
      while (dontStop == true) {
         System.out.println("\nWhat would you like to calculate? (sine, log, square root)");
         String userOption = scan.nextLine();

         System.out.println("\nWhich Number?");
         double number = scan.nextInt();
         scan.nextLine();
         
         // Calculate
         double result = calculator(userOption, number);
         if (result == -1.0){
            // invalid userOption
            System.out.println("\nYou can only calculate for either (sine, log, square root), \nYou Entered: " + userOption);
         } else {
            // valid userOption
            System.out.println("\n"+userOption+"("+ number + ") = " + result);
         }

         // Ask user if they would like to continue using calculator
         while (true){
            System.out.println("\nWould you like to use this calculator again? (yes or no)");
            String yesOrNo = scan.nextLine();
            // If user chooses yes or no break out of nested while loop, 
            // if not continue asking user to pick yes or no
            if (yesOrNo.equals("no")){
               System.out.println("\nTurned Off Casio Calculator\n");
               dontStop = false;
               break;
            } else if (yesOrNo.equals("yes")){
               dontStop = true;
               break;
            }
            System.out.println("Invalid input!");
         }
      }
   }
}


// 16. CODING CHALLENGE (Module 10: Tutorial 20 - 23 && Module 11: Tutorial 1 - 4)

// a. Difficulty: Easy 🍔
// create a function that prints from 99 down to 00 as shown below
// >> 9 9
// >> 9 8
// >> ...
// >> 1 2
// >> 1 1
// >> ...
// >> 0 1
// >> 0 0

// b. Difficulty: Medium ⚒️ / Hard 🪨
// Create a function that finds. Ask a user what they would like to calculate (e.g sine, log, square root) and then take an
// input and calculate it, Ask if they would like to continue calculation
// - the log of an input
// - the sine of an input
// - the square root of an input    (Tip: use the Math.<something>)

// >> Calculator

// >> What would you like to calculate? (sine, log square root)
// >> sine

// >> Which Number?
// >> 40

// >> sin(40) = 0.7451131604793488

// >> Would you like to use this calculator again? (yes or no)
// >> daef
// >> invalid input!

// >> Would you like to use this calculator again? (yes or no)
// >> yes

// >> What would you like to calculate? (sine, log square root)
// >> log

// >> Which Number?
// >> 40

// >> log(40) = 3.6888794541139363 

// >> Would you like to use this calculator again? (yes or no)
// >> no

// >> Turned Off Casio Calculator
