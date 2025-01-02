package textfileio2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class A_WriteRandomNumbers {
    public static void main(String[] args) {
        
        //random object
        Random rand = new Random();
        
        //creating the file
        try (FileWriter writer = new FileWriter("randomNumbersList.txt")) {
            for (int i = 0; i < 100; i++) { //loop for 100 random numbers
                int number = 1000 + rand.nextInt(9000); //random number between 1000 and 9999
                writer.write(number + "\n");
                System.out.println("Writing number: " + number); //output into the console
            }
            System.out.println("Finished writing 100 random numbers to randomNumbersList.txt");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
