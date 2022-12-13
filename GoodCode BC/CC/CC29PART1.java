package CC;
public class CC29PART1 {
   public static void main(String[] args) {
      String option = "";

      int random = (int) (Math.random() * 3) + 1;

      switch (random) {
         case 1: option = "hit"; break;
         case 2: option = "stay"; break;
         case 3: option = "fold"; break;
         default: option = "This option should never get called";
      }

      if (!option.equals("hit") && !option.equals("stay")) {
         System.out.println("fold");
      } else {
         System.out.println(option);
      }
   }
}

// 29. CODING CHALLENGE (Module 18: Tutorial 1 - 10)

// a. Difficulty: Easy
// The below code has a bug or two, using the Debugger tool fix all the bugs in the code.
// The code should randomly print either "hit", "stay", or "fold" but right now if ran it only prints fold
// NOTE: Use the Debugger To fix this
