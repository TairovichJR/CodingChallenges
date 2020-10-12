package codingbat;

import java.util.Arrays;

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
				if (found1 && found2) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static boolean modThree(int[] nums) {

		int countEven = 0;
		int countOdd = 0;
		// 2, 4, 2, 5
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) {
				countEven++;
			}
			if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0) {
				countOdd++;
			}

			if (countEven == 2 || countOdd == 2) {
				return true;
			}
		}
		return false;
	}

	public static boolean twoTwo(int[] nums) {

		if (nums.length < 1 || !(Arrays.stream(nums).anyMatch(i -> i == 2)))
			return true;

		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == 2) {
				if (nums[i - 1] == 2 || (i < nums.length - 1 && nums[i + 1] == 2)) {
					found = true;
				} else
					found = false;
			}
		}
		return found;
	}

	public static boolean sameEnds(int[] nums, int len) {
//		  int[] begin = new int[len];
//		  for (int i = 0; i < begin.length; i++) {
//			begin[i] = nums[i];
//		  }
//		  int index = nums.length - begin.length;
//		  boolean flag = true;
//		  for (int i = index; i < nums.length; i++) {
//			 if(begin[i - index] != nums[i]) {
//				 flag = false;
//			 }
//		}
//		  return flag;
		boolean flag = true;
		// [5, 6, 45, 99, 13, 5, 6], 2
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[(nums.length - len + i)]) {
				flag = false;
			}
		}

		return flag;
	}

	public static boolean tripleUp(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			// 1, 4, 5, 6, 2
			if (i > 0 && nums[i] - nums[i - 1] == 1) {
				if (nums[i + 1] - nums[i] == 1) {
					count++;
				}
				if (count == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public static int[] fizzArray3(int start, int end) {

		int n[] = new int[end - start];
		for (int i = 0; i < n.length; i++, start++)
			n[i] = start;
		return n;
	}

	public static int[] shiftLeft(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}
		
		return nums;
	}

	public static int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i> 0 && nums[i] % 10 != 0 && nums[i-1] % 10 == 0 ) 
				nums[i] = nums[i-1];
		}
		return nums;
	}

	public static int[] pre4(int[] nums) {
		int index = Arrays.asList( 
				Arrays.stream(nums)
					.boxed()
					.toArray(Integer[]::new))
					.indexOf(4);
		if (index != -1 ) {
			int[] n = new int[index];
			for (int i = 0; i < n.length; i++) {
				n[i] = nums[i];
			}
			return n;
		}
		return new int[] {};
	}

	public static int[] post4(int[] nums) {
		int index = Arrays.asList( 
				Arrays.stream(nums)
					.boxed()
					.toArray(Integer[]::new))
					.lastIndexOf(4);
		if (index != -1 ) {
			int[] n = new int[nums.length - index-1];
			for (int i = 0; i < n.length; i++) 
				n[i] = nums[index+1+i];
			return n;
		}
		return new int[] {};
	}

}





