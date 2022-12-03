package CC;
public class Animal {
   private String species;
   private int age;
   private double height;

   public Animal(String species, int age, double height) {
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
   public Animal(Animal source) {
      this.species = source.species;
      this.age = source.age;
      this.height = source.height;
   }
}
// 24. CODING CHALLENGE (Module 16: Tutorial 11 - 20)
// b. Difficulty: Medium
// Add a copy constructor to the above (question a.) Animal class
