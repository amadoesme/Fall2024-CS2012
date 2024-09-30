//package Demo;
//
//import java.util.Scanner;
//
//public class ReviewExcersises {
//
//    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        double numbersInPrompt = -1;
//
//        //user has to enter a decimal between 100 and 200
//        while (numbersInPrompt < 100 || numbersInPrompt > 200) {
//            System.out.println("Enter a decimal number between 100 and 200: ");
//            
//            //making the console understand about the double input
//            if (userInput.hasNextDouble()) {
//                numbersInPrompt = userInput.nextDouble();
//            } 
//            else {
//                System.out.println("Enter a decimal number");
//                userInput.next(); 
//            }
//
//            if (numbersInPrompt < 100 || numbersInPrompt > 200) {
//                System.out.println("The number is out of range. Try again");
//            }
//        }
//        
//        //if user enters the correct number, the console will display it
//        System.out.println("The number you entered is: " + numbersInPrompt);
//        userInput.close();
//    }
//}




//#2
//package Demo;
//
//public class ReviewExcersises {
//	
//	//finds and returns the *lowest* value in an array of doubles
//	public static double findLowest(double[] array) {
//		double lowest = array[0];
//		for (double value : array) {
//			if (value < lowest) {
//				lowest = value;
//			}
//		}
//		return lowest;
//	}
//
//	//values where the console has to find the lowest value
//	public static void main(String[] args) {
//		double[] myArray = {2.5, 3.1, 9.8, 1.0, 6.1};
//
//    	//console prints the lowest value        
//		double lowestValue = findLowest(myArray);
//    	System.out.println("The lowest value in the array is: " + lowestValue);
//   }
//}


//#3
package Demo;

public class ReviewExcersises {

    //static method that replaces each String in the array with "Esmeralda"
    public static void replacinghName(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "Esmeralda";
        }
    }

    //main method to test the replaceWithName method
    public static void main(String[] args) {
        String[] array = {"Star", "Wars", "Anakin", "Obi Wan", "Padme", "Java is fun"};

        //calling replaceWithName method
        replacinghName(array);

        //printing the modified array
        for (String value : array) {
            System.out.println(value);
        }
    }
}


