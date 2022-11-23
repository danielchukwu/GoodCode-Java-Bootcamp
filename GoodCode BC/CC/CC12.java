package CC;

public class CC11 {

   // a.
   public static int getNumber(){
      return 5;
   }
   public static String getText(){
      return "Hello World.";
   }
   public static boolean getBoolean(){
      return true;
   }
   
   // b.
   // Add two numbers function
   public static double addTwoNumbers(double a, double b) {
      double solution = a + b;
      return solution;
   }
   // Subtract two numbers function
   public static double subTwoNumbers(double a, double b) {
      double solution = a - b;
      return solution;
   }

   // c.
   /**
    * Function name: fahrenheitCelsiusConverter
    *
    * @param value           (double)
    * @param conversionType  (double)
    * @return                (double)
    *
    * Inside the Function:
    * 1. Converts fahrenheit to Celsius when the second argument equals 'f'
    * 2. Converts Celsius to fahrenheit when the second argument equals 'c'
    */
   public static double fahrenheitCelsiusConverter(double value, char conversionType) {
      switch (conversionType){
         case ('f'):
            // (32°F − 32) × 5/9 = 0°C
            double fahrenheitToCelsius = (value - 32) * 5/9;
            return fahrenheitToCelsius;
         case ('c'):
            // (0°C × 9/5) + 32 = 32°F
            double celsiusToFahrenheit = (value * 9/5) + 32;
            return celsiusToFahrenheit;
         default:
            return 0.0;
      }
   }

   public static void main(String[] args) {
      // CODING CHALLENGE 12

      // a. Difficulty: Easy
      int num = getNumber();
      String text = getText();
      boolean bool = getBoolean();
      System.out.println("Num: " + num + "\nText: " + text + "\nBool: " + bool);

      // b. Difficulty: Medium
      double addNum = addTwoNumbers(10, 14.5);
      double subNum = subTwoNumbers(4, -5.5);
      System.out.println("addNum Result = " + addNum + "\nsubNum Result = " + subNum);

      // c. Difficulty: Hard (optional)

      double result1 = fahrenheitCelsiusConverter(32, 'f');
      double result2 = fahrenheitCelsiusConverter(0, 'c');
      System.out.println(32 + "°F To Celsius = " + result1 + "°C");
      System.out.println(0  + "°C To Fahrenheit = " + result2 + "°F");      
      
      System.out.println("\nWritten by Daniel");
   }
}

// 12. CODING CHALLENGE (Module 8: Tutorial 6 - 10)

// a. Difficulty: Easy
// Create a function that returns the an integer value
// Create a function that returns a string value
// Create a function that returns a boolean value

// b. Difficulty: Medium
// Create a function that 
// - adds two numbers and returns the result
// - subtracts two numbers and returns the result

// c. Difficulty: Hard (optional)
// Create a function that converts fahrenheit to Celsius or Celsius to fahrenheit and then returns the result
// add a docString to these function (Attempt only if you watched yesterdays tutorial and you fully understand docStrings/docComments)