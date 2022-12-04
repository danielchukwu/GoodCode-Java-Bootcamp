package CC;
import java.util.Arrays;
// a.
public class CC25Student {
   private String name;
   private int level;
   private double gpa;
   private String[] courses;

   public CC25Student (String name, int level, double gpa, String[] courses) { 
      this.name = name; 
      this.level = level;
      this.gpa = gpa;
      this.courses = Arrays.copyOf(courses, courses.length);
   }
   // Getters
   public String getName() { return name; }
   public int getLevel() { return level; }
   public double getGpa() { return gpa; }
   public String[] getCourses() { return Arrays.copyOf(courses, courses.length); }
   
   // Setters
   public void setName(String name) { this.name = name; }
   public void setLevel(int level) { this.level = level; }
   public void setGpa(double gpa) { this.gpa = gpa; }
   public void setCourses(String[] courses) { this.courses = Arrays.copyOf(courses, courses.length); }
   
   //b.
   public CC25Student (CC25Student source) {
      this.name = source.name; 
      this.level = source.level;
      this.gpa = source.gpa;
      this.courses = Arrays.copyOf(source.courses, source.courses.length);
   }
   
   // c.
   public String toString() {
      return "\nStudent [name=" + name + ", level=" + level + ", gpa=" + gpa + ", courses=" + Arrays.toString(courses)
            + "]";
   }
}

// 25. CODING CHALLENGE (Module 16: Tutorial 21 - 30)
// a. Difficult: Easy/Medium
// Create a class Student where one of the attributes is an array and also create a getter and setter methods for the classes attributes. 
// e.g Student class
//      - name
//      - level
//      - gpa
//      - courses    (Should be an array)
// b. 
// Add a copy constructor to the Student class that 
// c. 
// Add a toString method
// d. 
// Lastly create 4 Student objects and print out those objects 
