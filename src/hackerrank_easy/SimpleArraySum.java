package hackerrank_easy;

import java.util.Arrays;

public class SimpleArraySum {

	static int simpleArraySum(int[] ar) {
		int sum = 0;
		for (int i : ar) {
			sum += i;
		}
		
		Arrays.stream(ar).sum();
		
		return sum;
	}
	
	static int simpleArraySum2(int[] ar) {
		
		return Arrays.stream(ar).sum();
	}
}
