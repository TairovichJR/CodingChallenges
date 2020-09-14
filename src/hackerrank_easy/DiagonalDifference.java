package hackerrank_easy;

import java.util.List;

public class DiagonalDifference {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		int primSum = 0, secSum = 0;
		for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
			List<Integer> list = arr.get(i);
			int prim = list.get(i);
			int sec = list.get(j);

			primSum += prim;
			secSum += sec;

		}
		return (Math.abs(primSum - secSum));
	}

}
