package CC;

public class CC24Animal {
   // a.
   private String species;
   private int age;
   private double height;

   public CC24Animal(String species, int age, double height) {
      this.species = species;
      this.age = age;
      this.height = height;
   }

   // getter Methods for the attributes or fields (species, age, height)
   public String getSpecies(){ return this.species; }
   public int getAge(){ return this.age; }
   public double getHeight(){ return this.height; }
   
   // Setter Methods for the attributes or fields (species, age, height)
   public void setSpecies(String species) { this.species = species; }
   public void setAge(int age) { this.age = age; }
   public void setHeight(double height) { this.height = height; }
   
   // b.
   public CC24Animal(CC24Animal source) {
      this.species = source.species;
      this.age = source.age;
      this.height = source.height;
   }
}
// 24. CODING CHALLENGE (Module 16: Tutorial 11 - 20)
// a. Difficulty: Easy
// Create a class Animal with the attributes species, age, height (and make them private), add a constructor in this class and then add setter and getter methods for the attributes?

// b. Difficulty: Medium
// Add a copy constructor to the above (question a.) Animal class