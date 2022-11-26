package CC;
import java.util.Arrays;

public class CC18 {
   // a. 
   public static double findLargestNumber(double[] array1) {
      double largestNum = 0;
      for (int i=0; i < array1.length; i++){
         if (array1[i] > largestNum){
            largestNum = array1[i];
         }
      }
      return largestNum;
   }

   // b
   public static void replaceRonaldoWithMessi(String[] playersArray) {
      int replacedCount = 0;
      System.out.println("\n" + Arrays.toString(playersArray));

      for (int i=0; i < playersArray.length; i++){
         if (playersArray[i].equals("ronaldo")){
            playersArray[i] = "messi";
            replacedCount++;    // Or replacedCount += 1
         }
      }
      System.out.println("Replaced Ronaldo With Messi: " + replacedCount + " times");
      System.out.println(Arrays.toString(playersArray));
   }

   // c
   public static String[] addArrays(String[] array1, String[] array2 ) {
      int newArraySize = array1.length + array2.length;    // 3 + 4 = 7
      String[] array3 = new String[newArraySize];          // {null, null, null, null, null, null, null}
      int j = 0;                                           // Array3 index count
      // Add Array1 to Array3
      for (int i=0; i<array1.length; i++){
         array3[j] = array1[i];
         j++;
      }
      // Add Array2 to Array3
      for (int i=0; i<array2.length; i++){
         array3[j] = array2[i];
         j++;
      }
      return array3;
   }

   public static void main(String[] args) {
      // 18. CODING CHALLENGE (Module 12: Tutorial 8 - 15)
      // a. Difficulty: Easy
      double[] arr1 = {4.23, 1.17, 7.73, 3.38, 11.05, 9.09, 7.45, 6.99, 14.23, 13.40, 10.00};
      double largestNum = findLargestNumber(arr1);
      System.out.println("arr1 = " + Arrays.toString(arr1));
      System.out.println("The largest Number is " + largestNum);

      // b. Difficulty: Medium (updating arrays)
      String[] playersArray = {"neymar", "aubamayang", "ronaldo", "bernando", "Son", "coutinho", "ronaldo", "verati", "ronaldo"};
      replaceRonaldoWithMessi(playersArray);

      // c. Difficulty: Hard (Extending Arrays) (optional)
      String[] array1 = {"apple", "banana", "orange"};                 // array1
      String[] array2 = {"guava", "paw paw", "pears", "water melon"};  // array2
      String[] array3 = addArrays(array1, array2);                     // call function
      System.out.println("array1 = " + Arrays.toString(array1));
      System.out.println("array2 = " + Arrays.toString(array2));
      System.out.println("\narray3 = " + Arrays.toString(array3));
   }
}


// 18. CODING CHALLENGE (Module 12: Tutorial 8 - 15)

// a. Difficulty: Easy
// Create a function that takes an array of numbers as an argument and then loops through it and finds the largest number.
// >> array1 = [4.23, 1.17, 7.73, 3.38, 11.05, 9.09, 7.45, 6.99, 14.23, 13.40, 10.00]
// >> The largest Number is 14.23

// b. Difficulty: Medium (updating arrays)
// Create a function that loops through an array of players and wherever it sees ronaldo it should replace with messi
// >> ["neymar", "aubamayang", "ronaldo", "bernando", "Son", "coutinho", "ronaldo", "verati", "ronaldo"]
// >> Replaced Ronaldo With Messi: 3 times
// >> ["neymar", "aubamayang", "messi", "bernando", "Son", "coutinho", "messi", "verati", "messi"]

// c. Difficulty: Hard (Extending Array) (optional)
// Create a function that copies all the items from array1 and array2 to array3 and returns array3. (Tip: for loop required)
// >> array1 = ["apple", "banana", "orange"]
// >> array2 = ["guava", "paw paw", "pears", "water melon"]

// >> array3 = ["apple", "banana", "orange", "guava", "paw paw", "pears", "water melon"]