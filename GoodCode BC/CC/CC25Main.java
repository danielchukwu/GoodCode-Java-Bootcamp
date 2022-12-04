package CC;

import java.util.Arrays;

public class CC25Main {
   public static void main(String[] args) {
      // d.
      // Lastly create 4 Student objects and print out those objects 

      // Courses For Objects
      String[] courses100 = {"CMP 101", "MTH 105"};
      String[] courses200 = {"CMP 205", "CMP 211"};
      String[] courses300 = {"CMP 301", "CMP 313"};

      // Create Objects
      CC25Student student1 = new CC25Student("Daniel", 300, 3.9, new String[] {"CMP 309", "CMP 321"});
      CC25Student student2 = new CC25Student("Eniola", 200, 4.7, Arrays.copyOf(courses200, courses200.length));
      CC25Student student3 = new CC25Student("Anointing", 300, 4.1, Arrays.copyOf(courses300, courses300.length));
      CC25Student student4 = new CC25Student("George", 100, 3.6, Arrays.copyOf(courses100, courses100.length));

      // Print Out Objects. (Thanks to the toString() method. This is possible)
      System.out.println(student1);
      System.out.println(student2);
      System.out.println(student3);
      System.out.println(student4);
   }
}