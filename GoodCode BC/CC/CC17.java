package CC;

import java.util.Scanner;

public class CC17 {
   public static void main(String[] args) {
      // 17. CODING CHALLENGE (Module 12: Tutorial 1 - 7)
      // a. Difficulty: Easy
      int[] nums = {1, 2, 3, 4, 5};
      double[] decimalNums = {1.2, 3.1, 4.5, 5.3, 9.9};
      char[] alphabets = {'d', 'a', 'n', 'i', 'e', 'l'};
      String[] teams = {"Grizzlies", "Pistons", "GSW", "Bucks", "Bulls", "Lakers"};
      
      System.out.println("Number: " + nums[4]);
      System.out.println("Decimal: " + decimalNums[2]);
      System.out.println("Character: " + alphabets[0]);
      System.out.println("Team: " + teams[5]);


      // b. Difficulty: Medium
      String[] players = {"rashford", "pulisic", "kane", "vinicius", "lewandowski", "muller", "neymar", "salah", "gabriel", "halland"};

      // In Order
      System.out.println("\nIn Order\n");
      for(int i=0; i < players.length; i++){
         System.out.println(players[i]);
      }
      // In Reverse Order
      System.out.println("\nIn Reverse Order\n");
      for(int i=players.length-1; i >=0 ; i--){
         System.out.println(players[i]);
      }

      
      // c. Difficulty: Hard
      Scanner scan = new Scanner(System.in);
      String[] products = {"milk", "milo", "bread", "cabin", "sugar", "cornflakes", "golden morn", "soap", "tooth paste", "cream"};
      int[] productPrices = { 1200, 1200, 600, 550, 450, 1100, 1100, 400, 350, 850};
      boolean done = false;
      int totalCost = 0;

      System.out.println("\nWelcome to Daniels Store");

      while (done == false) {
         // Ask user for the product they would like to buy
         if (totalCost == 0){ System.out.println("\nWhat would you like to buy?"); } 
         else               { System.out.println("\nWhat else would you like to buy?  (Enter 'done' to stop)"); }
         String productName = scan.nextLine();
         int productPrice = 0;

         // Check if user entered done to stop the program
         if (productName.equals("done")){ 
            System.out.println("\nTotal Cost = N" + totalCost);
            System.out.println("\nThank you for shopping at Daniel's Store");
            done = true;
            break;
         }

         // find the product in products array and 
         // set the price of the product
         for (int i=0; i < products.length; i++){
            if (products[i].equals(productName)){
               productPrice = productPrices[i];
               break;
            }
         }

         // Check if productPrice is valid (if it's not 0)
         // if so add productPrice to users totalCost
         if (productPrice != 0){
            System.out.println("Cost: " + productPrice);
            totalCost += productPrice;
         } else {
            System.out.println("\nSorry we don't have " + productName + ".");
         }
      }
      scan.close();
   }
}
