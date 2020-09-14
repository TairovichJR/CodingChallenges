package hackerrank_easy;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> res = new ArrayList<Integer>();
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < 3; i++) {
			if (a.get(i) > b.get(i))
				countA++;
			else if (a.get(i) < b.get(i))
				countB++;
		}
		res.add(countA);
		res.add(countB);
		return res;
	}
}
