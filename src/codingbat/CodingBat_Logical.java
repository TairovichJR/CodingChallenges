package codingbat;

import java.lang.invoke.VarHandle;
import java.util.*;
import java.util.stream.Collectors;

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

	public static String[] groupTotals(String[] strArr){

		Map<String,Integer> map = new HashMap<>();
		for (int i = 0; i < strArr.length; i++) {
			String[] pair = strArr[i].trim().split(":");
			String key = pair[0].trim();
			Integer value = Integer.parseInt(pair[1].trim());
			if (map.containsKey(key)){
				Integer newVal = map.get(key) + value;
				map.put(key, newVal);
			}else{
				map.put(key,value);
			}
		}
		List<String> list = new ArrayList<>();
		map.entrySet().stream().filter(entry -> !entry.getValue().equals(0))
		.forEach( entry -> {
			String group = entry.getKey() + ":" + entry.getValue();
			list.add(  group );
		});
		return list.stream().toArray(String[]::new);
	}


	public static void main(String[] args) {

		System.out.println(Arrays.toString(groupTotals(new String[]{"X:-1", "Y:1", "X:-4", "B:3", "X:5"})));
		System.out.println(Arrays.toString(groupTotals(new String[]{"B:-1", "A:1", "B:3", "A:5"})));
	}
}
