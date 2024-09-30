package StringsChap10;

public class DescriptionUngradedStrings {

//	1) 
//
//	Write a class with a method to find and return the largest value in an array of Strings (that is, the String that is last in lexicographic order), and a driver method that calls your method using a hard-coded array of Strings and prints out the return value.
//
//	Review the sample code for finding the largest value in an array, which can be found in lecture 1.  Use String's compareTo() method in place of the mathematical comparison to write code to find and print the largest value (that is, the one that is last in lexicographic order) in an array of Strings. 
//
//	 
//
//	2)
//
//	Write a method with this signature:
//
//	public String replaceSubstring(String oldString, int subStart, int subEnd, String stringToInsert)
//
//	that takes OldString, replaces the characters starting with start and ending with end - 1 with stringToInsert.  For example, if you call your method with the arguments "Godzilla is king!", 12, 16, "delicious", the method will return the String "Godzilla is delicious!".  For this exercise, you do not need to validate the indices; for example, if the subStart parameter is -1, the method will crash.
//
//	Hint: take the substring from character 0 to character subStart, concatenate stringToInsert to it, then concatenate the substring from subEnd to the end of the original String.
//
//	Write a main() that tests your method with the original String "Destroy all Monsters!", the stringToInsert "tomatoes", and several different combinations of subStart and subEnd. 
}
