package StringsChap10;

public class largestValueTest {

	//driver method
	public static void main(String[] args) {
		
		//strings to find the largest array
	    String[] testArray = {"grapes", "duck", "lemonade", "star wars", "at work", "northland patrol"};
	    
	    //calling the largestString method from largestValue class and printing the largest string
	    System.out.println("Largest string: " + largestValue.largestString(testArray));
	}
}
