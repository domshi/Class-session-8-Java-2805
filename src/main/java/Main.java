import java.io.*;
import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    
    File test = new File ("src/main/java/test.txt");
    System.out.println("Exists? " + test.exists());
    System.out.println("Length? " + test.length());
    System.out.println("Readable? " + test.canRead());
    System.out.println("Directory? " + test.isDirectory());
    System.out.println("Path? " + test.getPath());
    System.out.println("Absolute path? " + test.getAbsolutePath());


    
    try {
      PrintWriter output = new PrintWriter(test);
      output.println("Hello, womp");
      output.println("Sweet potato pie");
      output.close();
    }
      
    catch (FileNotFoundException e) {
    e.printStackTrace();
    System.out.println("File not found");
      
    }
    try {
    Scanner input = new Scanner(test);
      String s = input.nextLine();
      System.out.println(s);
      String t = input.next();
      System.out.println(t);
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    }

    
  }

}