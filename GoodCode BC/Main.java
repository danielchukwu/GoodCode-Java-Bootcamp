import CC.CC26Car;
import CC.CC26Dealership;

public class Main {
   public static void main(String[] args) {
      // A list of Car objects
      CC26Car[] cars = {
         new CC26Car("Mercedes", 15000, 2016, "black", new String[] {"tires", "stirring wheels"}),
         new CC26Car("Bmw", 18000, 2015, "white", new String[] {"jack", "stirring wheels"}),
         new CC26Car("Toyota", 11000, 2018, "red", new String[] {"tires"})
      };

      // Dealership object created
      CC26Dealership dealership = new CC26Dealership();

      // Add the list of cars object into our dealership object
      for (int i = 0; i < cars.length; i++) {
         dealership.setCars(cars[i], i);
      }
      
      // print out the 1st and 3rd car in our dealership
      System.out.println(dealership.getCar(0));;
      System.out.println(dealership.getCar(2));;
   }
}

// 26. CODING CHALLENGE (Module 16: Tutorial 31 - 40)
// a.
// Create a car class with the following attributes (Make, Price, Year, Color, Parts (an Array of car parts))
// b.
// Add a constructor, a copy constructor, setters and getters, a toString method
// c. 
// Create a dealership class that manages the Car class you created above, add setters and getters to the dealership class
