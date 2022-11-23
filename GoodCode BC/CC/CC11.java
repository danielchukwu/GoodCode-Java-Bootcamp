package CC;

import java.util.Scanner;

public class CC11 {
   // a. Easy
   public static void printHelloWorld(){
      System.out.println("Hello world!");
   }

   // b. Medium
   public static void greetUser(String name){
      System.out.println("Hello " + name);
   }

   // c. Hard
   // i
   public static void calculateCircumferenceOfACircle(double r){
      double PI = 3.14159;
      double solution = 2 * PI * r;
      System.out.println("C = " + solution);
   }
   // ii
   public static void calculateAreaOfATriangle(int h, int b){
      double solution = (h * b) / 2;
      System.out.println("A = " + solution);
   }
   // iii
   public static void calculateSpeed(int distance, int time){
      double solution = distance / time;
      System.out.println("Speed = " + solution);
   }
   


   public static void main(String[] args) {

      // CODING CHALLENGE 10
      // a. Difficulty: Easy
      printHelloWorld();
      printHelloWorld();
      printHelloWorld();

      System.out.println("\nWritten by Daniel");


      // b. Difficulty: Medium
      greetUser("Daniel");
      greetUser("Ebuka");
      greetUser("Nuhu");

      System.out.println("\nWritten by Daniel");


      // c. Difficulty: Hard
      // i
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      double radius = scan.nextDouble();                              // Receive User Input
      calculateCircumferenceOfACircle(radius);                        // Function Call
      System.out.println("\nWritten by Daniel.");

      // ii
      System.out.print("Enter h: ");
      int h = scan.nextInt();
      System.out.print("Enter b: ");
      int b = scan.nextInt();
      calculateAreaOfATriangle(h, b);

      System.out.println("\nWritten by Daniel.");


      // iii
      System.out.print("Enter distance: ");
      int distance = scan.nextInt();
      System.out.print("Enter time: ");
      int time = scan.nextInt();
      calculateSpeed(distance, time);

      System.out.println("\nWritten by Daniel.");

      scan.close();
   }
}

// 11. CODING CHALLENGE (Module 8: Tutorial 1 - 5)

// a. Difficulty: Easy
// create a greetings function that when called prints the below 3 times
// >> Hello World
// >> Hello World
// >> Hello World

// b. Difficulty: Medium
// Create a greetings function that takes a name parameter and when called it prints the below
// >> Hello Daniel            // called with Daniel
// >> Hello Ebuka             // called with Ebuka
// >> Hello Nuhu              // called with Nuhu


// c. Difficulty: Hard (optional)
// Create a function that calculates the circumference of a cirle?  // C = 2πr  where π = 3.14159
// >> Enter the radius of the circle: 50
// >> C = 314.16

// Create a function that calculates the area of a triangle?  // A = (h*b)/2
// >> Enter h: 5
// >> Enter b: 10
// >> A = 25

// Create a function that calculates speed?  // Speed = distance  / time
// >> Enter distance: 165
// >> Enter time: 3
// >> Speed = 55