import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      
   }
}

// 31. CODING CHALLENGE (Module 18: Tutorial 21 - 30)
// c. Difficulty: Hard
// The below code is supposed to print 0 across the diagonal
// [_, _, _]        [O, _, X]
// [_, _, _]  --->  [_, O, _]
// [_, _, _]        [X, _, 0]

// But instead it prints
// The below code is supposed to print 0 across the diagonal
// [_, _, _]        [X, _, O]
// [_, _, _]  --->  [_, X, _]
// [_, _, _]        [O, _, X]

// public static void main(String[] args) {
//    char[][] array = new char[][] {
//       {'_', '_', '_'},
//       {'_', '_', '_'},
//       {'_', '_', '_'},
//    };

//    for (int i=0; i < array.length; i++){
//       array[i][2-i] = 'O';
//       array[2-i][2-i] = 'X';
//    }

//    printArray(array);
//    System.out.println("O WINS!");
// }