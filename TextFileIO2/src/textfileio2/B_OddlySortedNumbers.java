package textfileio2;

//from the book
import java.io.*;
import java.util.*;

public class B_OddlySortedNumbers {
	public static void main(String[] args) {
	    	
	    	//storing the numbers from the file
	        List<Integer> numbers = new ArrayList<>();
	        
	        //bufferreader to read from the file
	        try (BufferedReader reader = new BufferedReader(new FileReader("randomNumbersList.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) { //read each line from the file
	                numbers.add(Integer.parseInt(line)); //parse the line as an integer and add to the list
	            }
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	
	        //sorting the numbers based on the reverse of their digits
	        numbers.sort(Comparator.comparingInt(num -> Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())));
	        System.out.println("Sorted numbers based on the reverse of their digits: " + numbers); //output in console
	        
	        //writting the sorted numbers to a file
	        try (FileWriter writer = new FileWriter("oddlySortedNumbers.txt")) {
	            for (int number : numbers) {
	                writer.write(number + "\n"); //each number goes to the file, each on a new line
	            }
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
