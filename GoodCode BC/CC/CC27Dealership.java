package CC;

// CC 27. Continuation of CC 26
public class CC27Dealership {
   private CC27Car[] cars; 

   // CC 27
   // a.
   public CC27Dealership (CC27Car[] cars) {
      this.cars = new CC27Car[cars.length];
      for (int i = 0; i < cars.length; i++) {
         this.cars[i] = new CC27Car(cars[i]);
      }
   }
   
   // From CC 26
   public void setCars(CC27Car car, int index) {
      this.cars[index] = new CC27Car(car);
   }
   // From CC 26
   public CC27Car getCar(int index) {
      return new CC27Car(this.cars[index]);
   }

   // CC 27
   // b.
   public int search (String make, double budget) {
      // loop through cars in this dealership
      for (int i = 0; i < this.cars.length; i++) {
         if (this.cars[i] == null) { continue; }
         if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget){
            // if Car found that matches the make with user specifications
            // then return the cars index.
            System.out.println("\nWe found a car that matches your specifications. ");
            return i;
         }
      }
      // if no car was found return a 404
      System.out.println("\nSorry. We couldn't find a car that matches your specifications. ");
      return 404;
   }

   // c.
   public void sellCar (String make, double budget) {
      int i = this.search(make, budget);       // returns index of car or a 404 (not found).
      switch (i) {
         case (404):
            // car was not found
            System.out.println("Feel free to browse through our other collection.");
            System.out.println(this);
         default:
            // car was found
            CC27Car carToBeSold = this.cars[i];            // grab car to be sold
            System.out.println(carToBeSold);           // print out cars object
            this.cars[i] = null;                       // set cars index to null
      }
      
   }
   
   // d.
   public String toString() {
      String temp = "";
      for (int i = 0; i < this.cars.length; i++) {
         temp += "\n\nParking Lot: " + (i + 1);

         if (this.cars[i] == null) { 
            temp += "\nThis car has been sold";
            continue; 
         }
         temp += this.cars[i].toString();
      }
      return temp;
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
