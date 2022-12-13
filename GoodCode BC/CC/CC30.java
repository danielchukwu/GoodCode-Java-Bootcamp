package CC;

public class CC30 {
   

   public static void main(String[] args) {

      // a. Difficulty: Easy
      for(int i=0; i <= 10; i++) {
         for (int j=0; j < i; j++) {
               System.out.print("*");
         }
         System.out.println("");
      }
      
      // b. Difficulty: Medium
      System.out.println("Difficulty: Medium");
      for(int i=0; i <= 10; i++) {
         for (int j=0; j < i; j++) {
            if (j+1 == i){
               System.out.println("*");
            } else {
               System.out.print(" ");
            }
         }
      }
   }
}

// 30. CODING CHALLENGE (Module 18: Tutorial 11 - 20)
// a. Difficulty: Easy
// Our program is supposed to print the below result
// *
// **
// ***
// ****
// *****
// ******
// *******
// ********
// *********
// **********
// But instead it prints
// **********************************************************

// Using the Debugger Tool fix the below code
// public static void main(String[] args) {
//     for(int i=0; i < 10; i++) {
//         for (int j=0; j < 10; j++) {
//             System.out.print("*");
//         }
//     }
// }




// b. Difficulty: Medium
// Our program is supposed to print the below result
// *
//  *
//   *
//    *
//     *
//      *
//       *
//        *
//         *
//          *

// But instead it prints
//  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  * 
//   *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
//  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
// Using the Debugger Tool fix the below code
// public static void main(String[] args) {
//     for(int i=0; i < 10; i++) {
//         for (int j=0; j < 10; j++) {
//             System.out.print(" * ");
//         }
//     }
// }

