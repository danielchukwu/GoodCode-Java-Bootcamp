package CC;

public class CC24Main {

   public static void main(String[] args) {
      // 24. CODING CHALLENGE (Module 16: Tutorial 11 - 20)

      // a. Difficulty: Easy      
      CC24Animal animal1 = new CC24Animal("dog", 4, 53.4);
      System.out.println("\nAnimal 1\nspecie: " + animal1.getSpecies() + "\nage: " + animal1.getAge() + "\nheight: " + animal1.getHeight());
      
      animal1.setAge(5);
      System.out.println("New Animal Age: " + animal1.getAge());
      
      
      CC24Animal animal2 = new CC24Animal("cat", 7, 20.9);
      System.out.println("\nAnimal 2\nspecie: " + animal2.getSpecies() + "\nage: " + animal2.getAge() + "\nheight: " + animal2.getHeight());
      
      animal2.setAge(8);
      System.out.println("New Animal Age: " + animal2.getAge());
      
      
      // b. Difficulty: Medium
      CC24Animal animal3 = new CC24Animal(animal1);
      System.out.println("\nAnimal 2\nspecie: " + animal3.getSpecies() + "\nage: " + animal3.getAge() + "\nheight: " + animal3.getHeight());
   }
}



