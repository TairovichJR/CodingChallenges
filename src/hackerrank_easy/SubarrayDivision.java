package hackerrank_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SubarrayDivision {

    static int birthday(List<Integer> s, int d, int m) {

        int ways = 0;
        for (int i = 0; i <= s.size()-m; i++) {
            int sum = s.subList(i, i+m).stream().mapToInt(j -> j).sum();
            if (sum == d) {
                ways++;
            }
        }
        return ways;
    }

}
