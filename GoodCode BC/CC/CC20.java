package CC;

import java.util.Arrays;
import java.util.Scanner;

public class CC20 {
   // a.
   public static int[] fillArrayWithRandomNumbers(int[] array1) {
      for (int i=0; i<array1.length; i++){
         double result = Math.random() * 100;
         array1[i] = (int) result;
      }
      return array1;
   }

   // b.
   public static int[][] fillUpTwoDimensionalArray(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            double result = Math.random() * 100;    // generate random number
            arr[i][j] = (int) result;               // convert double to (int)
         }
      }
      return arr;
   }
   // Print out 2-dimensional Array 
   public static void printTwoDimensionalArray(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.println(Arrays.toString(arr[i]));
      }
      System.out.println();
   }

   // c.
   // Print out 2-dimensional Array 
   public static void printTwoDimensionalArrayDatabase(String[][] arr) {
      System.out.println();
      System.out.println("       username |  password   |     email       |    bio      |");
      for (int i = 0; i < arr.length; i++) {
         System.out.println("User"+ (i+1) +": " + Arrays.toString(arr[i]));
      }
   }

   public static void main(String[] args) {
      // 20. CODING CHALLENGE (Module 12: Tutorial 21 - 26)
      // a. Difficulty: Easy
      int[] array1 = new int[10]; 
      System.out.println(Arrays.toString(array1));
      array1 = fillArrayWithRandomNumbers(array1);
      System.out.println(Arrays.toString(array1));


      // b. Difficulty: Medium
      int[][] arr = new int[3][4];
      printTwoDimensionalArray(arr);             // print 2-dimensional array
      arr = fillUpTwoDimensionalArray(arr);      // populate arr with random numbers
      printTwoDimensionalArray(arr);             // print 2-dimensional array


      // c. Difficulty: Hard
      Scanner scan = new Scanner(System.in);
      String[][] userTable = new String[3][4];
      
      printTwoDimensionalArrayDatabase(userTable);
      for (int i = 0; i < userTable.length; i++) {
         System.out.println("\nUser " + (i+1));

         // Recieve user input
         System.out.print("Enter username: ");
         String username = scan.nextLine();
         System.out.print("Enter password: ");
         String password = scan.nextLine();
         System.out.print("Enter email: ");
         String email = scan.nextLine();
         System.out.print("Enter bio: ");
         String bio = scan.nextLine();

         // Insert all recieved data into table
         userTable[i][0] = username;
         userTable[i][1] = password;
         userTable[i][2] = email;
         userTable[i][3] = bio;
      }
      printTwoDimensionalArrayDatabase(userTable);
   }
}
