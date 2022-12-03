package CC;
public class Human {
   // a.
   String gender;
   String ethnicity;
   String name;
   int dayOfBirth;
   double height;
   boolean isChristian;

   // b.
   public Human (String gender, String ethnicity, String name, int dayOfBirth, double height, boolean isChristian) {
      this.gender = gender;
      this.ethnicity = ethnicity;
      this.name = name;
      this.dayOfBirth = dayOfBirth;
      this.height = height;
      this.isChristian = isChristian;
   }
}

// b. Difficulty: Medium ⚒️
// Create a Human Class with at least 4 variables and a constructor that helps initiate the variables when called. (Get Creative)
// Then make sure to print the below

// >> Hello there, My name is <name>
// >> Ethnicity: <ethnicity>
// >> Gender: <gender>
// >> Day Of Birth: <day>
// >> Height: <height>cm
// >> Christian: <true/false>
