package CC;
import java.util.Arrays;

// a.
public class CC26Car {
   private String make;
   private double price;
   private int year;
   private String color;
   private String[] parts;

   // b.
   // Constructor
   public CC26Car (String make, double price, int year, String color, String[] parts) { 
      this.make =  make;
      this.price = price;
      this.year  = year;
      this.color = color;
      this.parts = Arrays.copyOf(parts, parts.length);
   }
   
   // Copy Constructor
   public CC26Car (CC26Car car) {
      this.make =  car.make;
      this.price = car.price;
      this.year  = car.year;
      this.color = car.color;
      this.parts = Arrays.copyOf(car.parts, car.parts.length);
   }

   // Getters
   public String getMake() { return make; }
   public double getPrice() { return price; }
   public int getYear() { return year; }
   public String getColor() { return color; }
   public String[] getParts() { return Arrays.copyOf(parts, parts.length); }
   
   // Setters
   public void setMake(String make) { this.make = make; }
   public void setPrice(double price) { this.price = price; }
   public void setYear(int year) { this.year = year; }
   public void setColor(String color) { this.color = color; }
   public void setParts(String[] parts) { this.parts = Arrays.copyOf(parts, parts.length); }

   // toString method that helps us print out the 
   // attributes of an object of this array
   public String toString() {
      return "\nCar [make=" + make + ", price=" + price + ", year=" + year + ", color=" + color + ", parts="
            + Arrays.toString(parts) + "]";
   }
}
