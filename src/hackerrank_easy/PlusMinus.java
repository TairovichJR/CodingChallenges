package hackerrank_easy;

import java.util.Arrays;

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

}
