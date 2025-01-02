package textfileio2;

import java.io.*;
import java.util.*;

public class C_WriteNumberListStats {

    public static void main(String[] args) {

        //storing the numbers from the file
        List<Integer> numbers = new ArrayList<>();
        
        //bufferedReader to read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\amado\\OneDrive\\Documents\\randomNumbersList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) { //reads each line in the file
                numbers.add(Integer.parseInt(line)); //parse the lines as an integer and add to the list
            }
            System.out.println("Read numbers from file: " + numbers);
        } 
        catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }

        //calculates the grand total of all numbers
        int grandTotal = numbers.stream().mapToInt(Integer::intValue).sum();
        int[] columnTotals = new int[4];  //array to store the totals of each digit column
        int countOf17 = 0; //counter for number 17

        //loops through each number
        for (int number : numbers) {
            String numStr = String.valueOf(number); //converts number to string
            if (numStr.length() == 4) { //ensure the number is 4 digits long
                for (int i = 0; i < 4; i++) {
                    columnTotals[i] += Character.getNumericValue(numStr.charAt(i));
                }
                if (numStr.contains("17")) { //checks if the number contains 17
                    countOf17++;
                }
            } else {
                System.err.println("Skipping number with incorrect length: " + numStr);
            }
        }

        //calculates the average value of numbers
        double average = grandTotal / (double) numbers.size();

        //print statistics to console
        System.out.println("Grand total = " + grandTotal);
        System.out.println("1st column total = " + columnTotals);
        System.out.println("2nd column total = " + columnTotals);
        System.out.println("3rd column total = " + columnTotals);
        System.out.println("4th column total = " + columnTotals);
        System.out.println("Average = " + average);
        System.out.println("Count of 17's = " + countOf17);

        //FileWriter to write the statistics to a new file
        try (FileWriter writer = new FileWriter("C:\\Users\\amado\\OneDrive\\Documents\\randomNumbersStats.txt")) {
            writer.write("Grand total = " + grandTotal + "\n");
            writer.write("1st column total = " + columnTotals + "\n");
            writer.write("2nd column total = " + columnTotals + "\n");
            writer.write("3rd column total = " + columnTotals + "\n");
            writer.write("4th column total = " + columnTotals + "\n");
            writer.write("Average = " + average + "\n");
            writer.write("Count of 17's = " + countOf17 + "\n");
            System.out.println("Finished writing statistics to randomNumbersStats.txt");
        } 
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
