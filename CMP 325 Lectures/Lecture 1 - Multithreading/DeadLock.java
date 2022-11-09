// SEMANTICS: This program is a deadlock simulation program where you have two processes/threads that want to accesses 
//            a particular thread & they are holding each other back

public class DeadLock {

   // Resources
   static Object resource1 = new Object();
   static Object resource2 = new Object();

   // Thread 1
   public static class Thread1 extends Thread {
      @Override
      public void run() {
            System.out.println("Thread 1 takes resource 1");
            synchronized (resource1){
               try {
                  Thread.sleep(500);
               }catch (InterruptedException interruptedException){
                  interruptedException.printStackTrace();
               }
               System.out.println("Thread 1 needs 2");
               synchronized (resource2) {
                  System.out.println("Thread 1 takes resource 1 and 2");
               }
            }
      }
   }

   // Thread 2
   public static class Thread2 extends Thread {
      @Override
      public void run() {
            System.out.println("Thread 2 takes resource 2");
            // Synchronized: This tells the Thread we are extending to hold this resource
            synchronized (resource2) {     
               try {
                  Thread.sleep(500);
               } catch (InterruptedException interruptedException) {
                  interruptedException.printStackTrace();
               }
                  System.out.println("Thread 2 needs 1");
                  // Synchronized: This tells the Thread we are extending to hold this resource
                  synchronized (resource1) {  
                  System.out.println("Thread 2 takes resource 1 and 2");
               }
            }
      }
   }

   // Entry Point: Code Execution Starts here
   public static void main(String [] args){
      Thread1 thread1 = new Thread1();
      Thread2 thread2 = new Thread2();
      thread1.start();
      thread2.start();
   }

}
