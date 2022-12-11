package CC;

// c.
public class CC26Dealership {
   private CC26Car[] cars; 

   public CC26Dealership () {
      this.cars = new CC26Car[3];
   }
   
   public void setCars(CC26Car car, int index) {
      this.cars[index] = new CC26Car(car);
   }

   public CC26Car getCar(int index) {
      return new CC26Car(this.cars[index]);
   }

   
}

// 26. CODING CHALLENGE (Module 16: Tutorial 31 - 40)
// a.
// Create a car class with the following attributes (Make, Price, Year, Color, Parts (an Array of car parts))
// b.
// Add a constructor, a copy constructor, setters and getters, a toString method

// c. 
// Create a dealership class that manages the Car class you created above, add setters and getters to the dealership class

