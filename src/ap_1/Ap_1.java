package ap_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tairovich_jr on Oct 24, 2020
 */
public class Ap_1 {

	public static boolean scoresIncreasing(int[] scores) {
		boolean flag = true;
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] <= scores[i + 1]) {
				flag = true;
			} else {
				return false;
			}

		}
		return flag;
	}

	public static boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == 100 && scores[i + 1] == 100) {
				return true;
			}
		}
		return false;
	}

	public static boolean scoresClump(int[] scores) {

		for (int i = 0; i < scores.length - 2; i++) {
			int a = scores[i];
			int b = scores[i + 1];
			int c = scores[i + 2];

			int diff1 = Math.abs(a - b);
			int diff2 = Math.abs(b - c);

			if ((diff1 + diff2) <= 2) {
				return true;
			}
		}
		return false;
	}

	public static int scoresAverage(int[] scores) {

		int first = average(scores, 0, scores.length / 2);
		int second = average(scores, scores.length / 2, scores.length);

		return Math.max(first, second);
	}

	public static int average(int[] scores, int start, int end) {
		int average = 0;

		for (int i = start; i < end; i++) {
			average += scores[i];

		}
		return average / (end - start);

	}

	public static int wordsCount(String[] words, int len) {

		return (int) Arrays.stream(words).filter(i -> i.length() == len).count();

	}

	public static String[] wordsFront(String[] words, int n) {

		String[] newArr = new String[n];
		for (int i = 0; i < newArr.length; i++)
			newArr[i] = words[i];
		return newArr;
	}

	public static List wordsWithoutList(String[] words, int len) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len)
				list.add(words[i]);
		}
		return list;
	}

	public static boolean hasOne(int n) {

		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			if (digit == 1) {
				return true;
			}
		}
		return false;
	}

	public static boolean dividesSelf(int n) {
		int number = n;
		while (n > 0) {
			
			int digit = n % 10;
			n = n / 10;
			
			if (digit == 0 || number % digit != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] copyEvens(int[] nums, int count) {
	
		int[] evens = new int[count];
		for (int i = 0, evenIndex = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				if (evenIndex < evens.length) {
					evens[evenIndex] = nums[i];
					evenIndex++;
				}else {
					break;
				}
				
			}
		}
		return evens;
	}


	public static void main(String[] args) {

		System.out.println(copyEvens(new int[] {6, 1, 2, 4, 5, 8,9,1}, 3));
	}

}
