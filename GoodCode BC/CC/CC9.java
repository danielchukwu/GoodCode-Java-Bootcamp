package CC;

public class CC9 {
   public static void main(String[] args) {

      // CODING CHALLENGE 9
      // a. Difficulty: Easy/Medium
      
      int score = 0;
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter Your Matric Number:");
      String matricNo = scan.nextLine();

      System.out.println("\nEnter Password (Default is Bingham@123):");
      String password = scan.nextLine();


      // Question1
      System.out.println("\n1. In the series cobra kai, what is the name of Mr Larusso's Daughter?");
      System.out.println("\t a) Madeline \n\t b) Joyce \n\t c) Sam \n\t d) Jane");
      System.out.print("Ans: ");
      String answer1 = scan.nextLine();
      score = answer1.equals("c") ? score + 2 : score;  // short if else statement
      
      
      // Question2
      System.out.println("\n2. Which country has the most skillful footballers?");
      System.out.println("\t a) France \n\t b) Brazil \n\t c) Germany \n\t d) Spain");
      System.out.print("Ans: ");
      String answer2 = scan.nextLine();
      score = answer2.equals("b") ? score + 2 : score;  // short if else statement (ternary operators)
      
      
      // Question3
      System.out.println("\n3. What year did lectures commence in bingham?");
      System.out.println("\t a) 2003 \n\t b) 2002 \n\t c) 2005 \n\t d) 2006");
      System.out.print("Ans: ");
      System.out.print("Ans: ");
      String answer3 = scan.nextLine();
      score = answer3.equals("d") ? score + 2 : score;  // short if else statement (ternary operators)
      
      
      // Question4
      System.out.println("\n4. Which month was Christiano Ronaldo given birth to in?");
      System.out.println("\t a) February \n\t b) May \n\t c) September \n\t d) April");
      System.out.print("Ans: ");
      String answer4 = scan.nextLine();
      score = answer4.equals("a") ? score + 2 : score;  // short if else statement (ternary operators)
      
      
      // Question5
      System.out.println("\n5. When did Nigeria win their last World Cup?");
      System.out.println("\t a) 1893 \n\t b) 1978 \n\t c) 1983 \n\t d) Never");
      System.out.print("Ans: ");
      String answer5 = scan.nextLine();
      score = answer5.equals("d") ? score + 2 : score;  // short if else statement

      
      // Close Scanner
      scan.close();
      
      
      // Final Score Section
      System.out.println("\nYour Final Score Is " + score + "/10. ");

      String message;
      if (score < 5){
         message = "I know for a fact that you can do better than that. Carry over.";
      } else {
         message = "I love it. Keep it up.";
      }
      System.out.println(message);       // DONE: ✅
      


      //b. Difficulty: Hard
      Scanner sc = new Scanner(System.in);

      // Name
      System.out.println("\nWhat is your name?");
      String yourName = sc.next();
      
      // School
      System.out.println("\nWhich school did you graduate from?");
      String yourSchool = sc.next();
      
      // School First Year
      System.out.println("\nWhich year did you start Bingham University?");
      int firstYear = sc.nextInt();
      
      // School Last Year
      System.out.println("\nWhen did you graduate from Bingham University?");
      int lastYear = sc.nextInt();
      
      // Job Position (valid types: frontend, backend, or full-stack)
      System.out.println("\nWhich position would you like if given a job?");
      String jobPosition = sc.next().toLowerCase();
      
      // Gpa
      System.out.println("\nWhat is your GPA?");
      double yourGpa = sc.nextDouble();

      // Close scanner
      sc.close();


      // Check if job position is valid (frontend, backend, full-stack)
      boolean isValidJobPosition;
      switch (jobPosition) {
         case ("frontend"):   isValidJobPosition=true; break;
         case ("backend"):    isValidJobPosition=true; break;
         case ("full-stack"): isValidJobPosition=true; break;
         default:             isValidJobPosition=false; break;
      }
      
      // If jobPosition is valid and gpa is >= 3.0 then give job position
      String companyName = "Amazon";
      String mail = "";
      int salary;
      if ((isValidJobPosition) && jobPosition.equals("frontend") && yourGpa >= 3.0) {
         salary = 4000;
         mail = "Congratulations " + yourName + ", You've landed a job offer at " + companyName + " as a " + jobPosition + " Engineer.";

      } else if ((isValidJobPosition) && jobPosition.equals("backend") && yourGpa >= 3.5) {
         salary = 6000;
         mail = "Congratulations " + yourName + ", You've landed a job offer at " + companyName + " as a " + jobPosition + " Engineer.";

      } else if ((isValidJobPosition) && jobPosition.equals("full-stack") && yourGpa >= 4.0) {
         if (yourGpa > 4.5){salary=11000;}
         else {salary=8000;}

         mail = "Congratulations " + yourName + ", You've landed a job offer at " + companyName + " as a " + jobPosition + " Engineer.";
      } else {
         salary = 0;
         mail = "Sorry your gpa of " + yourGpa + " isn't going to cut it for a " + jobPosition + " job offer, try agin later!";
      }

      // Print final result
      System.out.println("\n" + mail);
      System.out.print("Your Pay: $");
      System.out.println(salary);         // DONE: ✅

   }
}