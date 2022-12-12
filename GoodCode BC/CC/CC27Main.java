package CC;

public class CC27Main {
   public static void main(String[] args) {
      // A list of Car objects
      CC27Car[] cars = {
         new CC27Car("Mercedes", 15000, 2016, "black", new String[] {"tires", "stirring wheels"}),
         new CC27Car("Bmw", 18000, 2015, "white", new String[] {"jack", "stirring wheels"}),
         new CC27Car("Toyota", 11000, 2018, "red", new String[] {"tires"})
      };

      // Dealership object created
      CC27Dealership dealership = new CC27Dealership(cars);
      
      // Search for a Bmw
      dealership.search("Bmw", 11000);
      
      // Sell Car mercedes
      dealership.sellCar("mercedes", 15000);
      
      // Print out the dealership
      System.out.println(dealership);
   }
}

// 27. CODING CHALLENGE (Module 16: Tutorial 41 - 47) (Extension of Coding Challenge 26)
// a. 
// Update the dealership constructor to not just only accept any length of cars objects passed into the constructor and also initialize it (avoiding the reference trap)
// b. 
// Add a search method to the dealership class. 
// (Extra info: The method should take a car make and user budget and if it finds any car in the dealership with the exact make and a user budget less than or equal to the cars price, then return the cars index else return a 404 if not found)
// c. 
// Add a sell method to the dealership class. 
// (Extra info: The method should also take a car make and price and if the car specified is found, it should be sold and its index should be set to null in the dealership)
// d. 
// Add a toString method to the dealership class that prints all the cars in the dealership.
