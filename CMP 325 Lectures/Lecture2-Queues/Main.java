public class Main {
   public static void main(String[] args) {
      // Queue
      Queue queue = new Queue();
      queue.enQueue(5);
      queue.enQueue(1);
      queue.enQueue(9);
      queue.enQueue(3);
      queue.enQueue(7);
      queue.enQueue(2);
      queue.enQueue(6);
      queue.enQueue(8);
      queue.enQueue(4);

      queue.deQueue();
      queue.deQueue();
      queue.deQueue();

      queue.displayQueue();
   }
}
