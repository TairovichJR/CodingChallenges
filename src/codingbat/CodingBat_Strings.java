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
			} else {
				result = result + "+";
				i++;
			}
		}
		return result;
	}

	public static String wordEnds(String str, String word) {
//		String result = "";
//		if (str.startsWith(word) && str.length() > word.length())
//			result += str.charAt(word.length());
//
//		for (int i = 0; i < str.length()-word.length(); i++) {
//			if (i>0 && str.substring(i, i+word.length()).equals(word)) 			
//				result += str.charAt(i-1) + ""+str.charAt(i+word.length());
//		}
//		
//		if (str.endsWith(word) && str.length() > word.length()) 
//			result += str.charAt(str.length()-word.length()-1);
//		
//		return result;
		int slen = str.length();
		int wlen = word.length();
		String fin = "";
		for (int i = 0; i < slen - wlen + 1; i++) {
			String tmp = str.substring(i, i + wlen);
			if (i > 0 && tmp.equals(word))
				fin += str.substring(i - 1, i);
			if (i < slen - wlen && tmp.equals(word))
				fin += str.substring(i + wlen, i + wlen + 1);
		}
		return fin;
	}

	public static void main(String[] args) {
		System.out.println(wordEnds("XY123XY1", "XY"));
	}
}
