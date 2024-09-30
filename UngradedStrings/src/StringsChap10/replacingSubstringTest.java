package StringsChap10;

public class replacingSubstringTest {

	public static void main(String[] args) {
		
		//original string 'destroy all monsters!' and replacing with 'tomatoes'
		String originalString = "Destroy all Monsters!";
		String stringToInsert = "Tomatoes";
		
		//creating an instance of the replacing string class to call the method
		replacingSubstring replace = new replacingSubstring();
		
		//replacing monsters with tomatoes
		String firstChange = replace.replaceSubstring(originalString, 12, 20, stringToInsert);
		System.out.println(firstChange);
		
		//replacing destroy with tomatoes
		String secondChange = replace.replaceSubstring(originalString, 0, 7, stringToInsert);
		System.out.println(secondChange);
		
		//replacing all with tomatoes
		String thirdChange = replace.replaceSubstring(originalString, 8, 11, stringToInsert);
		System.out.println(thirdChange);

	}

}
