public class Stack {
   // To create a stack we basically use an array and then we applying the constraints to this class, constraints that make a stack a stack
   int[] array;
   int top;
   int capacity;          // will hold the capacity of the array

   Stack(int size) {
      array = new int[size];
      capacity = size;
      top = -1;
   }

   boolean isEmpty() {
      return top == -1;          // if top == -1 => True, if top != -1 => False
   }

   boolean isFull() {
      return top == capacity - 1;
   }

   void push(int item) {
      if (isFull()){
         System.out.println("Stack Overflow");
         System.exit(1);
      }
      System.out.println("Inserting Item...");
      array[++top] = item;
   }

   int pop() {
      if (isEmpty()){
         System.out.println("Stack Underflow");
         System.exit(1);
      }
      System.out.println("Removing Item...");
      return array[top--];
   }

   void printStack() {
      for (int i = 0; i <= top; i++) {
         System.out.println(array[i]);
      }
   }
}

// Class Work
// In your main class
// Create an instance of the stack class. Add 5 items to the stack and pop 2 items from the stack