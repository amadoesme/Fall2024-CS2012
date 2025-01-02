package simpleWriteRead;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadData {
  public static void main(String[] args) throws Exception {
    // Create a File instance
    File file = new File("writeOneFile.txt");

    // Check if the file exists, if not create it and write some data
    if (!file.exists()) {
      try (PrintWriter output = new PrintWriter(file)) {
        output.println("John D Doe 85");
        output.println("Jane M Smith 90");
      }
    }

    // Create a Scanner for the file
    Scanner input = new Scanner(file);

    // Read data from a file
    while (input.hasNext()) {
      String firstName = input.next();
      String mi = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      System.out.println(firstName + " " + mi + " " + lastName + " " + score);
    }

    // Close the file
    input.close();
  }
}
