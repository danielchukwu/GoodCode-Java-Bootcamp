package CC;

public class CC13 {
   // a.
   public static void printNumbers1(int num) {
      for (int i = 1; i <= num; i++) {
         System.out.print(i + ", ");
      }
      System.out.println("\n");
   }
   public static void printHelloWorld() {
      for (int i = 1; i <= 10; i++) {
         System.out.println(i + " Hello World");
      }
   }
   public static void printNumbers2Reversed(int num) {
      System.out.println("");
      for (int i = num; i >= 1; i--) {
         System.out.print(i + ", ");
      }
   }
   // b.
   public static void findAllEvenAndPrint(int range) {
      for (int i = 1; i <= range; i++) {
         if (i % 2 == 0){
            System.out.println("Even");
         } else {
            System.out.println(i);
         }
      }
   }
   // c.
   public static String fizzBuzz(int value) {
      if (value % 3 == 0 && value % 5 == 0){ return "FizzBuzz"; } 
      else if (value % 3 == 0){ return "Fizz"; } 
      else if (value % 5 == 0){ return "Buzz"; }
      else { return "None"; }
   }

   public static void main(String[] args) {
      // CODING CHALLENGE 14 (Module 10: Tutorial 1 - 12)
      // a. Difficulty: Easy
      printNumbers1(50);
      printHelloWorld();
      printNumbers2Reversed(5);

      // b. Difficulty: Medium
      findAllEvenAndPrint(100);
      System.out.println("\nWritten by Daniel.");

      // c. Difficulty: Hard (optional)
      for (int i = 1; i <= 100; i++) {
         String result = fizzBuzz(i);
         if (result.equals("None")){
            System.out.println(i);
         } else {
            System.out.println(result);
         }
      }

   }
}

// 14. CODING CHALLENGE (Module 10: Tutorial 1 - 12)

// a. Difficulty: Easy
// Create a function that uses a for loop and 
// - prints 1, 2, 3, 4, 5, ..., 48, 49, 50,
// - prints 'Hello, World' 10 times
// - prints 5, 4, 3, 2, 1

// b. Difficulty: Medium
// Create a function that loops from 1 to 100 and prints Even where ever it encounters an even number.
// >> 1
// >> Even
// >> 3
// >> Even
// >> ...
// >> 99
// >> Even

// c. Difficulty: Hard (optional)
// Create a function that loops from 1 to 100 and 
// - prints fizzbuzz whenever it encounters a number perfectly divisible by 3 and 5 
// - prints fizz whenever it encounters a number perfectly divisible by 3
// - prints buzz whenever it encounters a number perfectly divisible by 5
// E.g
// >> 1
// >> 2
// >> fizz
// >> 4
// >> buzz
// >> fizz
// >> ...
// >> 14
// >> fizzbuzz

// Bonus
// what are the two types of loops?
// Ans: for loop and;
//      while loop

// When are for loops used as well as while loops?
// Ans: for loop: when you know in advance how many times a code needs to run
//      While loop: when you are not certain how many times a code needs to run