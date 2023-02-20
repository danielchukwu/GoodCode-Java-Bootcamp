import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      System.out.println("Hello World!");

      try {
         // loadData("Greetings.txt");
         loadURL("https://www.google.com/images");
      } catch (MalformedURLException e) {
         System.out.println(e.getMessage());
      }
   }

   public static void loadData(String name) throws FileNotFoundException {
      FileInputStream fs = new FileInputStream(name);
      Scanner scan = new Scanner(fs);
      while(scan.hasNextLine()){
         System.out.println(scan.nextLine());
      }
      scan.close();
   }
   
   public static void loadURL(String link) throws MalformedURLException {
      URL url = new URL(link);
      System.out.println(url.getProtocol());
      System.out.println(url.getHost());
      System.out.println(url.getPath());
   }
}
