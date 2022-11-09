// ORDER: 2nd

// WHAT DOES THIS CODE DO?
// This code uses the **implements Runnable way of creating a thread and it creates a thread that 

public class Demo implements Runnable {

   Thread myThread;

   void startThread() {
      if (myThread == null){
            System.out.println("New Thread Created...");
            myThread = new Thread(this);
            myThread.start();
      }
   }

   @Override
   public  void run(){
      for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
               myThread.sleep(1000);    // stop/pause code here for 1000 milliseconds(1000milliseconds = 1 second)
               // myThread.setPriority();
               // myThread.setName();
               // myThread.getName();
               // myThread.setDaemon(true);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
      }
   }


   public static void main(String [] args){

      Demo demo = new Demo();
      demo.startThread();
   }
}


// METHODS: Used above explanation
// sleep(): This sleeps and then continues
// wait():  This sleeps and then dies
// setDaemon():   This is how applications after being closed can still use up your system resources
//                Ex. whatsapp alert messages, instagram activities
// setPriority(): 2 threads with priority 1 and 7 want to access a particular resource at the same time, they will enter a deadlock state