package hackerrank_easy;

import java.util.Arrays;


public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {

       return Arrays.stream(ar)
               .distinct()
               .map(d -> Math.toIntExact(Arrays
                       .stream(ar)
                       .filter(i -> i == d)
                       .count()))
               .filter(i -> i != 1)
               .map(i -> i / 2).sum();
    }

    public static void main(String[] args) {

        System.out.println(sockMerchant(10, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));

    }

}
