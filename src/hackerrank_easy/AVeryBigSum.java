package hackerrank_easy;

import java.util.Arrays;

public class AVeryBigSum {

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		long sum = 0;
		for (long l : ar) {
			sum += l;
		}
		return sum;
	}

	static long aVeryBigSum2(long[] ar) {
		return Arrays.stream(ar).sum();
	}
}