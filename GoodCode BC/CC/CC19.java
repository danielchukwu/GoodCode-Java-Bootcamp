package CC;

import java.util.Arrays;

public class CC19 {
   //a
   public static void add2ToArray(int[] firstArray) {
      System.out.println("firstArrays = " + Arrays.toString(firstArray));
      for(int i=0; i<firstArray.length; i++){
         firstArray[i] += 2;
      }
      System.out.println("added2ToArray = " + Arrays.toString(firstArray));
   }
   
   
   // b.
   public static double fahrenheitCelsiusConverter(double value, char conversionType) {
      switch (conversionType){
         case ('f'):
            // (32°F − 32) × 5/9 = 0°C
            double fahrenheitToCelsius = (value - 32) * 5/9;
            return fahrenheitToCelsius;
         case ('c'):
            // (0°C × 9/5) + 32 = 32°F
            double celsiusToFahrenheit = (value * 9/5) + 32;
            return celsiusToFahrenheit;
         default:
            return 0.0;
      }
   }

   
   public static void main(String[] args) {
      // 19. CODING CHALLENGE (Module 12: Tutorial 16 - 20)
      // a. Difficulty: Easy
      int[] firstArray = {4, 1, 6, 2, 3, 9,7, 8, 0, 5};
      add2ToArray(firstArray);

      System.out.println("\nWritten by daniel.");


      // b. Difficulty: Medium
      double[] celsiusList = {3.50, 12.1, 40.2, -1.4, 23.0};
      System.out.println("Celsius = " + Arrays.toString(celsiusList));

      for (int i = 0; i < celsiusList.length; i++) {
         celsiusList[i] = fahrenheitCelsiusConverter(celsiusList[i], 'c');
      }
      System.out.println("fahrenheit = " + Arrays.toString(celsiusList));
      System.out.println("\nWritten by Daniel.");


      // c. Difficulty: Hard
      int[][] grades = {
         {40, 64, 33, 68},
         {91, 78, 75, 82},
         {28, 27, 32, 59},
      };

      // i.
      System.out.println("i.");
      System.out.println(grades[0][1]);
      System.out.println("  " + grades[1][2]);
      System.out.println("    " + grades[2][3]);

      // ii.
      System.out.println("\nii.");
      for (int i = 0; i < grades.length; i++) {
         for (int j = 0; j < grades[i].length; j++) {
            grades[i][j] += 5;
            System.out.print(grades[i][j] + "  ");
         }
         System.out.println();
      }
      System.out.println("\nWritten by Daniel.");
   }
}
