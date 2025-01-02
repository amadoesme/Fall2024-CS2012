package textfileio2;

//from the book
import java.io.*;

public class D_ReadFileStats {
	public static void main(String[] args) {
	    	
	    	//array of file names
	        String[] files = {"jabberwocky.txt", "mindkiller.txt"};
	        
	        //loops through each file
	        for (String fileName : files) {
	            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	                int charCount = 0; //counter for characters
	                int wordCount = 0; //counter for words
	                int lineCount = 0; //counter for lines
	                String line;
	                while ((line = reader.readLine()) != null) {
	                    lineCount++; //increments line counter
	                    charCount += line.length(); //adds length to the line of the character counter
	                    wordCount += line.split("\\s+").length; //splits the line into words and add to the word counter
	                }
	                
	                //prints everything from the file
	                System.out.println("File: " + fileName);
	                System.out.println("Characters: " + charCount);
	                System.out.println("Words: " + wordCount);
	                System.out.println("Lines: " + lineCount);
	            } 
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
