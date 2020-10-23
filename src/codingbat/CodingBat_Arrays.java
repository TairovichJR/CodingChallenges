package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}

		return nums;
	}

	public static int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] % 10 != 0 && nums[i - 1] % 10 == 0)
				nums[i] = nums[i - 1];
		}
		return nums;
	}

	public static int[] pre4(int[] nums) {
		int index = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)).indexOf(4);
		if (index != -1) {
			int[] n = new int[index];
			for (int i = 0; i < n.length; i++) {
				n[i] = nums[i];
			}
			return n;
		}
		return new int[] {};
	}

	public static int[] post4(int[] nums) {
		int index = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)).lastIndexOf(4);
		if (index != -1) {
			int[] n = new int[nums.length - index - 1];
			for (int i = 0; i < n.length; i++)
				n[i] = nums[index + 1 + i];
			return n;
		}
		return new int[] {};
	}

	public static int[] notAlone(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i] == val) {

				int oneBefore = nums[i - 1];
				int oneAfter = nums[i + 1];
				if (oneBefore != oneAfter && oneBefore != val && oneAfter != val) {
					int max = Math.max(nums[i - 1], nums[i + 1]);
					nums[i] = max;
				}
			}
		}
		return nums;
	}

	public static int[] zeroFront(int[] nums) {

//		if (nums.length < 1) return new int[] {};
//		boolean flag = true;
//		while (flag) {
//			int count = 0;
//			for (int i = 0; i < nums.length-1; i++) {
//				if (nums[i] != 0 && nums[i+1] == 0) {
//					int nonZero = nums[i];
//					nums[i] = nums[i+1];
//					nums[i+1] = nonZero;
//				}else 
//					count++;
//			}
//			if (count == nums.length-1) flag = false;
//		}
//		return nums;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;
			}
		}
		return nums;
	}

	public static int[] withoutTen(int[] nums) {
		if (nums.length < 1)
			return nums;

		nums = Arrays.stream(nums).map(i -> i == 10 ? 0 : i).toArray();
		boolean flag = true;
		while (flag) {
			int count = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == 0 && nums[i + 1] != 0) {
					int zero = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = zero;
				} else
					count++;
			}
			if (count == nums.length - 1) {
				flag = false;
			}
		}
		return nums;
	}

	public static int[] zeroMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				int index = i + 1;
				int largest = nums[i];
				for (int j = index; j < nums.length; j++) {
					if (nums[j] % 2 == 1 && nums[j] > largest) {
						largest = nums[j];
					}
				}
				nums[i] = largest;
			}
		}
		return nums;
	}

	public static int[] evenOdd(int[] nums) {
		return IntStream.concat(IntStream.of(Arrays.stream(nums).filter(i -> i % 2 == 0).toArray()),
				IntStream.of(Arrays.stream(nums).filter(i -> i % 2 == 1).toArray())).toArray();
	}

	public static String[] fizzBuzz(int start, int end) {
		List<String> values = new ArrayList<>();

		for (int i = start; i < end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				values.add("FizzBuzz");
			} else if (i % 3 == 0) {
				values.add("Fizz");
			} else if (i % 5 == 0) {
				values.add("Buzz");
			} else {
				values.add(String.valueOf(i));
			}
		}

		return values.toArray(new String[values.size()]);
	}

	public static boolean no14(int[] nums) {
		boolean hasOne = false;
		boolean hasFour = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				hasOne = true;
			}
			if (nums[i] == 4) {
				hasFour = true;
			}
		}
		return !hasOne || !hasFour;
	}

	public static int maxSpan(int[] nums) {
		int max = 0;
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		for (int i = 0; i < nums.length; i++) {
			int element = nums[i];
			int index = 0;
			int count = 0;
			List<Integer> subList = list.subList(i, list.size());
			while (index < subList.size()) {
				if (element == subList.get(index)) {
					count = index + 1;
					if (max < count) {
						max = count;
					}
				}
				index++;
			}
		}
		return max;
	}

	public static int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 3) {
				if (nums[i + 1] != 4) {
					int j = i + 1;
					while (j < nums.length) {
						if (nums[j] == 4) {
							int four = nums[j];
							nums[j] = nums[i + 1];
							nums[i + 1] = four;
							j++;
							break;
						}
						j++;
					}
				}
			} else if (i > 0 && nums[i] == 4 && nums[i - 1] != 3) {
				int j = i;
				while (j < nums.length) {
					if (nums[j] != 3 && nums[j] != 4) {
						int nonFour = nums[j];
						nums[j] = nums[i];
						nums[i] = nonFour;
						j++;
						break;
					}
					j++;
				}
			}
		}
		return nums;
	}

	public static int[] fix45(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				if (nums[i + 1] == 5)
					continue;
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
						int temp = nums[i + 1];
						nums[i + 1] = nums[j];
						nums[j] = temp;
						break;
					}
				}
			}
		}
		return nums;
	}

	public static boolean canBalance(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int firstSum = Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(0, i).stream()
					.mapToInt(Integer::intValue).sum();
			int secondSum = Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(i, nums.length).stream()
					.mapToInt(Integer::intValue).sum();

			if (firstSum == secondSum)
				return true;
		}
		return false;
	}

	public static boolean linearIn(int[] outer, int[] inner) {

		return Arrays.asList(Arrays.stream(outer).boxed().toArray(Integer[]::new))
				.containsAll(Arrays.asList(Arrays.stream(inner).boxed().toArray(Integer[]::new)));
	}

	public static int[] squareUp(int n) {
		 		
		int[] ints = new int[n*n];
		 if(n == 0)  return ints;
		 for(int i = n - 1; i < ints.length; i += n) {
		        for(int j = i; j >= i - i / n; j--)
		        	ints[j] = i - j + 1;
		    }
		return ints;
	}

	public static int[] seriesUp(int n) {
		
		if (n < 1) {
			return new int[] {};
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				list.add(j);
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(seriesUp(4)));
	}
	
}







