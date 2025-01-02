// Name: Esmeralda Amado
// Course: 2012 section 1 & 4
// Additional Comments: I got help in this assigment 
// but I finally learned how to use IO in coding. I 
// also added a lot of comments to learn how the 
// code works.

package ExtraIOExcercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOalphabet {

    public static void main(String[] args) {
    	
    	//file with sentences so the output works
    	File fileOutput = new File("C:\\Users\\amado\\OneDrive\\Documents\\ExtraIOExcercise.txt");
        
        //file diretory that i copied
        //"C:\Users\amado\OneDrive\Documents\ExtraIOExcercise.txt"

    	//catch and handle file reading errors (like file not found)
        try {
            Scanner scanner = new Scanner(fileOutput);
            StringBuilder content = new StringBuilder(); //adding file data into a string

            //reading the file into a single string
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
            scanner.close();

            //converting to uppercase and ignoring case sensitivity
            String text = content.toString().toUpperCase();

            //check for each letter from 'A' to 'Z'
            boolean allLettersPresent = true;
            for (int i = 65; i <= 90; i++) {  // 65 is 'A', 90 is 'Z' according to ASCII
                char letter = (char) i; //changing the ASCII value into a letter
                if (!text.contains(String.valueOf(letter))) { //checking if the current letter isn't present in the text
                    System.out.println("The text does not contain the letter: " + letter);
                    allLettersPresent = false;
                }
            }

            //printing if the sentence in the file has all 26 letters of the alphabet
            if (allLettersPresent) {
                System.out.println("The text contains all 26 letters of the alphabet.");
            } else {
                System.out.println("The text does not contain all 26 letters of the alphabet.");
            }

        //handle case if the file is not found
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

