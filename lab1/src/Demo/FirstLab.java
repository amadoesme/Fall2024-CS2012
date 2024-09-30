/* Names: Esmeralda Amado
 * Course: CS2012
 * Section: 01 & 4
 * Description: making sure that I've reached the starting point 
 * for the material in this course.
 * Other comments: I ended up naming a variable i because I was 
 * reading the Liang book to remember how to use arrays. I also
 * checked with professor Cross. He helped me check errors.
 */

package Demo;

import java.util.Scanner;

public class FirstLab {

    //#1 Ten nonnegative doubles
    public static double[] createArray() {
        Scanner nonnegativeDouble = new Scanner(System.in);
        double[] array = new double[10];
        
        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.print("Enter a nonnegative double for element " + (i + 1) + ": ");
                if (nonnegativeDouble.hasNextDouble()) {
                    double value = nonnegativeDouble.nextDouble();
                    
                    if (value >= 0) {
                        array[i] = value;
                        break;
                    } else {
                        System.out.println("Please enter a nonnegative double.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid double.");
                    nonnegativeDouble.next(); 
                }
            }
        }
        nonnegativeDouble.close();
        return array;
    }

    //#2 array of doubles as its only parameter, calculates the cube of each value in the array, and prints
    public static void printCubes(double[] originalArray) {
        for (double value : originalArray) {
            double cube = Math.pow(value, 3);
            System.out.println(cube);
        }
    }

    //#3 array of doubles as its only parameter and replaces any value exceeding 13 with the value 13
    public static void capValuesAt13(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 13) {
                array[i] = 13;
            }
        }
    }

    //#4 replaces each value in the old array with value divided by 42
    public static double[] processArray(double[] originalArray) {
        double[] newArray = new double[originalArray.length];
        
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i] / 42;
        }
        return newArray;
    }

    //#5 array of doubles as its only parameter and prints out all the values
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
        }
    }

    //#6 main() should call the input method, then send the array to the print method, then run each of the other methods
    public static void main(String[] args) {
        double[] myArray = createArray();
        
        System.out.println("Original array:");
        printArray(myArray);
        
        System.out.println("\nCubed values:");
        printCubes(myArray);
        
        capValuesAt13(myArray);
        System.out.println("\nArray after capping values at 13:");
        printArray(myArray);
        
        double[] processedArray = processArray(myArray);
        System.out.println("\nOriginal array after processing:");
        printArray(myArray);
        
        System.out.println("\nProcessed array:");
        printArray(processedArray);
    }
}
