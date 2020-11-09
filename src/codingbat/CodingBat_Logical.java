package codingbat;

/**
 * Created by tairovich_jr on Oct 14, 2020
 */
public class CodingBat_Logical {

	public static boolean makeBricks(int small, int big, int goal) {

		if (goal > big * 5 + small)
			return false;

		if (goal % 5 > small)
			return false;

		return true;
	}

	public static int makeChocolate(int small, int big, int goal) {

		if (goal % 5 <= small && goal / 5 <= big) {
			return goal % 5;
		} else if (goal / 5 > big && small >= (goal - big * 5)) {
			return goal - big * 5;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

	}
}
