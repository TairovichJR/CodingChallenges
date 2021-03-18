package hackerrank_easy;

import java.util.List;

public class BirthdayCakeHandles {


    public static int birthdayCakeCandles(List<Integer> candles) {

        int asInt = candles.stream().mapToInt(i -> i).max().getAsInt();
        return (int) candles.stream().filter(i -> i == asInt).count();
    }

}
