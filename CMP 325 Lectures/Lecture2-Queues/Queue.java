// package CMP 325 Lectures.Lecture 2 - Queues;

public class Queue {
   int[] array;
   int front;
   int back;
   int size = 10;

   Queue() {
      array = new int[size];
      front = -1;
      back = -1;
   }

   boolean isEmpty() {
      if (front == -1) { return true; }
      else { return false; }
   }

   boolean isFull() {
      if (front == 0 && back == size-1){ return true; }
      else { return false; }
   }

   void enQueue(int item) {
      if (isFull()) {
         System.out.println("This queue is full.");
         System.exit(1);   // program stops if this line gets called
      }
      if (front == -1) { front = 0; }
      back++;
      array[back] = item;
      System.out.println("Added an item.");
   }

   int deQueue() {
      int element;
      if (isEmpty()){
         System.out.println("This queue is empty.");
         return -1;
      } else {
         element = array[front];
         if (front >= back){
            front = -1;
            back = -1;
         } else {
            front++;
         }
         System.out.println(element + "removed ");
         return element;
      }
   }

   void displayQueue() {
      if (isEmpty()) {
         System.out.println("Empty Queue.");
      }
      for (int i = front; i <= back; i++) {
         System.out.println(array[i]);
      }
   }
}
