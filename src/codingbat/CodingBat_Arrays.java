package codingbat;

import java.rmi.Remote;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on Oct 09, 2020
 */
public class CodingBat_Arrays {

	public int sum67(int[] nums) {
		int sum = 0;
		boolean flag = true;
		// [1, 2, 6, 99, 99, 7]
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 6) {
				if (flag) {
					sum += nums[i];
				} else if (nums[i] == 7) {
					flag = true;
				}

			} else {
				flag = false;
			}
		}
		return sum;
	}

	public boolean has22(int[] nums) {

		if (nums.length < 2) {
			return false;
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				return true;

		}
		return false;
	}

	public boolean lucky13(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3)
				return false;
		}
		return true;
	}

	public boolean sum28(int[] nums) {
		return 8 == (int) Arrays.stream(nums).filter(n -> n == 2).sum();
	}

	public boolean more14(int[] nums) {
		int _1s = (int) Arrays.stream(nums).filter(n -> n == 1).count();
		int _4s = (int) Arrays.stream(nums).filter(n -> n == 4).count();
		return _1s > _4s ? true : false;
	}

	public int[] fizzArray(int n) {
		int[] ints = new int[n];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = i;
		}
		return ints;

	}

	public boolean only14(int[] nums) {

		if (nums.length == 0) {
			return true;
		}

		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 4) {
				flag = true;
			} else {
				return false;
			}
		}
		return flag;
	}

	public String[] fizzArray2(int n) {
		String[] strArr = new String[n];
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = String.valueOf(i);
		}
		return strArr;
	}

	public boolean isEverywhere(int[] nums, int val) {

		if (nums.length < 2) {
			return true;
		}

		boolean flag = false;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == val || nums[i + 1] == val) {
				flag = true;
			} else {
				return false;
			}

		}
		return flag;
	}

	public boolean either24(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		boolean _22 = false;
		boolean _44 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				_22 = true;
			} else if (nums[i] == 4 && nums[i + 1] == 4) {
				_44 = true;
			}
		}

		if (_22 == _44) {
			return false;
		}

		return true;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums2.length; i++) {
			int n1 = Math.abs(nums1[i]);
			int n2 = Math.abs(nums2[i]);
			if ((n1 != n2 && (Math.abs(n1 - n2) <= 2))) {
				count++;
			}
		}
		return count;
	}

	public static boolean has77(int[] nums) {
		int count = 0;
		int decrement = 0;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			} else if (nums[i] == 7 && nums[i + 1] != 7) {
				count++;
			} else if ((i > 0 && nums[i - 1] == 7) && nums[i] != 7 && nums[i + 1] == 7) {
				count++;
			} else if ((i > 0 && nums[i] != 7 && nums[i + 1] != 7)) {
				decrement++;
			}

			if (count - decrement == 2) {
				return true;
			}
		}

		return false;
	}

	public static boolean has12(int[] nums) {
		boolean found1 = false;
		boolean found2 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				found1 = true;
				int index = i;
				for (int j = index; j < nums.length; j++) {
					if (nums[j] == 2) {
						found2 = true;
					}
				}
				if (found1 && found2 ) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}

}
