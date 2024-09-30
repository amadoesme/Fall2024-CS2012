package StringsChap10;

public class largestValue {
	
	//method to find the largest string value in the array
    public static String largestString(String[] array) {
        if (array == null || array.length == 0) {
            return null; // Return null for empty or null array
        }

        //guessing first string is the largest
        String large = array[0];

        //loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(large) > 0) {
                large = array[i]; //updating largest string
            }
        }

        //returning largest string
        return large;
    }    
}
