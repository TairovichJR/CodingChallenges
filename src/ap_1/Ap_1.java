package ap_1;
/**
 * Created by tairovich_jr on Oct 24, 2020
 */
public class Ap_1 {

	public static boolean scoresIncreasing(int[] scores) {
		boolean flag = true;
		for (int i = 0; i < scores.length-1; i++) {
			if (scores[i] <= scores[i+1]) {
				flag = true;
			}else {
				return false;
			}
			
		}
		return flag;
	}

	public static boolean scores100(int[] scores) {
		  for (int i = 0; i < scores.length-1; i++) {
			if (scores[i] == 100 && scores[i+1] == 100) {
				return true;
			}
		}
		  return false;
	}

	public static boolean scoresClump(int[] scores) {
		  
		for (int i = 0; i < scores.length-2; i++) {
			int a = scores[i];
			int b = scores[i+1];
			int c = scores[i+2];
			
			int diff1 = Math.abs( a - b);
			int diff2 = Math.abs(b - c);
			
			if ((diff1 + diff2) <= 2 ) {
				return true;
			}
		}
		return false;
	}

}
