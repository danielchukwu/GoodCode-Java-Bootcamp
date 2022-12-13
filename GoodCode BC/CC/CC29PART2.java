package CC;
import java.util.Scanner;

public class CC29PART2 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int age = scan.nextInt();        // try 18, 16;
      System.out.println("How much do you owe in debt: ");
      double debt = scan.nextDouble();   // try 0, 30;

      String creditScore = debt > 0? "Bad" : "Good";
      boolean canApply = age >= 18;

      if (canApply && creditScore.equals("Good")) {
         System.out.println("We're processing your application");
      } else {
         System.out.println("You cannot apply");
      }
   }
}

// b. Difficulty: Medium
// Now we have some bugs on our below code. Using the debugger tool fix this bugs
// If user is not of age they shouldn't be able to apply and if the user have any debt they still shouldn't be able to apply
// But, if the user is of age to apply and has no debts, they should be able to see 
// NOTE: Use the Debugger To fix this

