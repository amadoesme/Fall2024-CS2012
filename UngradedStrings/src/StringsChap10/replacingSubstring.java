package StringsChap10;

public class replacingSubstring {
	
	public String replaceSubstring(String oldString, int subStart, int subEnd, String stringToInsert) {
		
		//taking the string to start
		String beggining = oldString.substring(0, subStart);
		
		//taking the string to end
		String ending = oldString.substring(subEnd);
		
		//concatinating the parts with stringToInsert in between
		return beggining + stringToInsert + ending;	
	}
}
