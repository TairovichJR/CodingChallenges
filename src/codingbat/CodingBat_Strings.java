package codingbat;

/**
 * Created by tairovich_jr on Oct 14, 2020
 */
public class CodingBat_Strings {

	public static String startWord(String str, String word) {
		if (str.startsWith(word)) {
			return word;
		} else if (!str.isEmpty() && !word.isEmpty() && str.substring(1).startsWith(word.substring(1))) {
			return str.substring(0, word.length());
		}

		return "";
	}

	public static String plusOut(String str, String word) {
		String result = "";
		int i = 0;
		while (i < str.length()) {
			if (str.substring(i).startsWith(word)) {
				result = result + word;
				i = i + word.length();
			}else {
				result = result + "+";
				i++;
			}
		}
		return result;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
