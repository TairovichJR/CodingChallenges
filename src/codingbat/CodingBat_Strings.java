package codingbat;

import java.util.Arrays;


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

	public static String withoutString(String base, String remove) {

		int i = 0;
		while (i < base.length()) {
			if (base.substring(i).toLowerCase().startsWith(remove.toLowerCase())) {
				base = base.replace(base.substring(i, i + remove.length()), "");
			}
			i++;
		}
		return base;
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

	public static int countYZ(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'y' || c == 'Y' || c == 'Z' || c == 'z') {
				if (i == str.length() - 1) {
					count++;
				} else if (!Character.isLetter(str.charAt(i + 1))) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean equalIsNot(String str) {

		int isCount = 0;
		int notCount = 0;

		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				isCount++;
			} else if (str.substring(i, i + 3).equals("not")) {
				notCount++;
			}
		}

		if (str.length() >= 2 && str.substring(str.length() - 2).equals("is")) {
			isCount++;
		}

		return isCount == notCount;
	}

	public static boolean gHappy(String str) {

		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i - 1) == 'g') {
					flag = true;
				} else if (i != str.length() - 1 && str.charAt(i + 1) == 'g') {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

	public static int countTriple(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			char c = str.charAt(i);
			if (c == str.charAt(i + 1) && c == str.charAt(i + 2)) {
				count++;
			}
		}
		return count;
	}

	public static int sumDigits(String str) {
		int sum = Arrays.stream(str.split("")).filter(i -> (!i.isEmpty() && Character.isDigit(i.charAt(0))))
				.map(i -> Integer.parseInt(i)).mapToInt(Integer::intValue).sum();

		return sum;
	}

	public static String sameEnds(String string) {
		String result = "";
		for (int i = 0; i < string.length() / 2; i++) {
			String begin = string.substring(0, i + 1);
			String end = string.substring(string.length() - i - 1);
			if (begin.equals(end))
				result = begin;
		}
		return result;
	}

	public static String mirrorEnds(String string) {
		String result = "";
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			String begin = string.substring(0, i + 1);
			String endReversed = buffer.append(string.substring(string.length() - i - 1)).reverse().toString();
			buffer.delete(0, endReversed.length() + 1);
			if (begin.equals(endReversed))
				result = begin;
		}
		return result;
	}

	public static int maxBlock(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}
		int count = 1;
		int maxLeng = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			if (c == str.charAt(i + 1)) {

				count++;
				if (maxLeng <= count) {
					maxLeng = count;
				}
			} else {
				count = 1;
			}
		}
		return maxLeng;
	}

	public static int sumNumbers(String str) {
		int sum = 0;
		String number = "0";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				number += String.valueOf(str.charAt(i));
			else {
				sum = sum + Integer.parseInt(number);
				number = "0";
			}
			if (i == str.length() - 1)
				sum = sum + Integer.parseInt(number);
		}
		return sum;
	}

	public static String notReplace(String str) {

		if (str.equals("is")) {
			return str + " not";
		}else if(str.length() < 2 || str.isEmpty()) {
			return "";
		}
		str = "."+str; 
		String result = str;
		for (int i = 0; i < str.length()-2; i++) {
			String is = str.substring(i, i+2);
			if (is.equals("is") && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))) 
				result = str.substring(0, i+2) + " not" + str.substring(i+2);
		}
		
		if (result.endsWith("is") &&  !Character.isLetter(result.charAt(result.length()-3))) 
			result = result.substring(0, result.length()) + " not" + result.substring(result.length());
		
		return result.replace(".", "");
	}
	

}






