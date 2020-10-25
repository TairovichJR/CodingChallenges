package ap_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
				} else {
					break;
				}

			}
		}
		return evens;
	}

	public static int[] copyEndy(int[] nums, int count) {

		int[] endy = new int[count];
		for (int i = 0, index = 0; i < nums.length; i++) {
			if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
				if (index < endy.length) {
					endy[index] = nums[i];
					index++;
				} else {
					break;
				}
			}

		}
		return endy;
	}

	public static int matchUp(String[] a, String[] b) {

		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (!a[i].isEmpty() && !b[i].isEmpty()) {
				if (a[i].charAt(0) == b[i].charAt(0)) {
					count++;
				}
			}
		}
		return count;
	}

	public int scoreUp(String[] key, String[] answers) {

		int score = 0;
		for (int i = 0; i < answers.length; i++) {

			if (key[i].equals(answers[i])) {
				score += 4;
			} else if (!answers[i].equals("?")) {
				score -= 1;
			}
		}
		return score;
	}

	public String[] wordsWithout(String[] words, String target) {

		return Arrays.stream(words).filter(i -> !i.equals(target)).toArray(String[]::new);
	}

	public static int scoresSpecial(int[] a, int[] b) {
		int maxOfA = Arrays.stream(a).filter(i -> i % 10 == 0).boxed().mapToInt(i -> i).max().orElse(0);
		int maxOfB = Arrays.stream(b).filter(i -> i % 10 == 0).boxed().mapToInt(i -> i).max().orElse(0);
		return maxOfA + maxOfB;
	}

	public static int sumHeights(int[] heights, int start, int end) {

		List<Integer> list = Arrays.stream(heights).boxed().collect(Collectors.toList()).subList(start, end + 1);
		int sum = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			sum += Math.abs(list.get(i) - list.get(i + 1));
		}
		return sum;
	}

	public static int sumHeights2(int[] heights, int start, int end) {

		List<Integer> list = Arrays.stream(heights).boxed().collect(Collectors.toList()).subList(start, end + 1);
		int sum = 0;
		for (int i = 0; i < list.size() - 1; i++) {

			int digit = list.get(i) - list.get(i + 1);
			if (digit < 0) {
				digit = digit * 2;
			}
			sum += Math.abs(digit);
		}
		return sum;
	}

	public static int bigHeights(int[] heights, int start, int end) {
		List<Integer> list = Arrays.stream(heights).boxed().collect(Collectors.toList()).subList(start, end + 1);
		int count = 0;
		for (int i = 0; i < list.size() - 1; i++) {

			int digit = Math.abs(list.get(i) - list.get(i + 1));
			if (digit >= 5) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(bigHeights(new int[] { 5, 13, 6, 7, 2 }, 0, 4));
	}
}
