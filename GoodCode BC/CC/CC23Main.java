package CC;

public class CC23Main {

   public static void main(String[] args) {
      // 23. CODING CHALLENGE (Module 16: Tutorial 1 - 8)
      // a. Easy
      CC23Human person1 = new CC23Human();
      person1.gender = "Male";
      person1.ethnicity = "Black";
      person1.name = "Chukwu Daniel";
      person1.dayOfBirth = 4;
      person1.height = 190.5;
      person1.isChristian = true;
      
      System.out.println("\nHello there, My name is " + person1.name + "\nEthnicity: " + person1.ethnicity + "\nGender: " + person1.gender + "\nDay Of Birth: " + person1.dayOfBirth + "\nHeight: " + person1.height + "cm\nChristian: " + person1.isChristian);


      CC23Human person2 = new CC23Human();
      person2.gender = "Female";
      person2.ethnicity = "Black";
      person2.name = "Chinaza Akpere";
      person2.dayOfBirth = 29;
      person2.height = 172.3;
      person2.isChristian = true;

      System.out.println("\nHello there, My name is " + person2.name + "\nEthnicity: " + person2.ethnicity + "\nGender: " + person2.gender + "\nDay Of Birth: " + person2.dayOfBirth + "\nHeight: " + person2.height + "cm\nChristian: " + person2.isChristian);
   }
}