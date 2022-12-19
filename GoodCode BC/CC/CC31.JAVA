public class CC31 {
   // a and b. printArray
   static void printArray(int[][] array) {
      for (int i = 0; i < array.length; i++) {
         String row = Arrays.toString(array[i]);
         System.out.println(row);
      }
   }

   // c. printArrayChar
   static void printArrayChar(char[][] array) {
      for (int i = 0; i < array.length; i++) {
         String row = Arrays.toString(array[i]);
         System.out.println(row);
      }
   }
   
   public static void main(String[] args) {
      // a. Difficulty: Easy
      int[][] matrix = {
         {1, 2, 3},
         {8, 6, 4},
         {4, 5, 6},
      };
   
      for (int i=0; i < matrix.length; i++){
         for (int j=0; j < matrix[i].length; j++) {
            if (j < i){
               matrix[i][j] = 0;
            }
         }
      }
      printArray(matrix);
      
      // b. Difficulty: Medium
      int[][] matrixx = new int[][] {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9},
      };

      int[][] transposeMatrix = new int[3][3];
   
      for (int i=0; i < matrixx.length; i++){
         for (int j=0; j < matrixx[i].length; j++) {
            transposeMatrix[i][j] = matrixx[j][i];
         }
      }
      printArray(transposeMatrix);

      // c. Difficulty: Hard
      char[][] array = new char[][] {
         {'_', '_', '_'},
         {'_', '_', '_'},
         {'_', '_', '_'},
      };
   
      for (int i=0; i < array.length; i++){
         array[2-i][2-i] = 'X';
         array[i][2-i] = 'O';
      }
   
      printArrayChar(array);
      System.out.println("O WINS!");
      
   }
}

// 31. CODING CHALLENGE (Module 18: Tutorial 21 - 30)
// The below code is supposed to convert all the numbers below the diagonal of a 2D Array to 0
// [1, 2, 3]        [1, 2, 3]
// [8, 6, 4]  --->  [0, 6, 4]
// [4, 5, 6]        [0, 0, 6]

// But instead if we run the below code it crashes. Now using a debugger tool fix up our code
// public static void main(String[] args) {
//    int[][] matrix = new int[][] {
//       {1, 2, 3},
//       {8, 6, 4},
//       {4, 5, 6},
//    };

//    for (int i=0; i < matrix.length; i++){
//       for (int j=0; j < matrix[i].length; i++) {
//          matrix[i][j] = 0;
//       }
//    }

//    printArray(matrix);
// }