package CC;
import java.util.Scanner;
public class CC28Main {
   public static void main(String[] args) {
      System.out.println("***********************************************************");
      System.out.println("                  WELCOME TO JAVA DRINKS");
      System.out.println("***********************************************************");
      
      Scanner scan = new Scanner(System.in);
      
      CC28Item[][] items = {
         {new CC28Item("Coke", 200, 3), new CC28Item("Fanta", 200, 1), new CC28Item("Mirinda", 200, 5)},
         {new CC28Item("Water", 200, 9), new CC28Item("Fearless", 300, 3), new CC28Item("Lacasera", 150, 7)},
         {new CC28Item("Chivita", 800, 2), new CC28Item("Biggy", 200, 6), new CC28Item("Pepsi", 180, 2)},
      };
      
      CC28Machine machine = new CC28Machine(items);
      while (true){
         System.out.print(machine);
         System.out.print("***********************************************************\n");
         System.out.print("Pick a row: ");
         int row = scan.nextInt();
         System.out.print("Pick a column: ");
         int col = scan.nextInt();

         boolean dispensed = machine.dispense(row, col);

         if (dispensed){
            System.out.print("\nEnjoy your drink! Press 1 to make another purchase: ");
         } else {
            System.out.print("\nSorry we are out of this item. Press 1 to make another purchase: ");
         }

         if (scan.nextInt() != 1){ break; }
      }
   }
}
// 28. CODING CHALLENGE (Module 17: Tutorial 1 - 5)

// a. Create a Vending Machine program (Tip: As we did in today's tutorial video)
