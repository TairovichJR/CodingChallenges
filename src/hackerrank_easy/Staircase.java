package hackerrank_easy;

/**
 * Created by tairovich_jr on Sep 14, 2020
 */
public class Staircase {

	public static void main(String[] args) {
		staircase(6);
	}

	// Complete the staircase function below.
	static void staircase(int n) {

		if (n < 0 || n >100) {
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			String s = "";
			int count = n - i; // 6
			for (int j = 0; j < n; j++) {
				if (count <= j)
					s += "#";
				else
					s += " ";

			}
			System.out.println(s);

		}
	}
}
