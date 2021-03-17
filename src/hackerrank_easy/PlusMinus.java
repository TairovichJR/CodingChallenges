package hackerrank_easy;
import java.util.Arrays;
import java.util.stream.LongStream;

public class PlusMinus {

    static void plusMinus(int[] arr) {

        final int sumPositive = (int) Arrays.stream(arr).filter(i -> i > 0).count();
        final int sumZeros =(int) Arrays.stream(arr).filter(i -> i == 0).count();
        final int sumNegative = (int) Arrays.stream(arr).filter(i -> i < 0).count();
        final int arrLength = arr.length;
        System.out.println(  String.format("%.6f", (double) sumPositive/arrLength )   );
        System.out.println(  String.format("%.6f", (double) sumNegative/arrLength )   );
        System.out.println(  String.format("%.6f", (double) sumZeros/arrLength )   );

    }


    static void miniMaxSum(int[] arr) {

        int[] sorted = Arrays.stream(arr).sorted().toArray();
        long minSum = LongStream.range(0, sorted.length-1).mapToObj(i -> Long.valueOf(sorted[ (int)i])).reduce(Long.valueOf(0), (a, b) -> a + b);
        long maxSum = LongStream.range(1, sorted.length).mapToObj(i -> Long.valueOf(sorted[ (int)i])).reduce(Long.valueOf(0), (a, b) -> a + b);
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

        miniMaxSum(new int[]{256741038, 623958417, 467905213, 714532089, 938071625});
    }

}
