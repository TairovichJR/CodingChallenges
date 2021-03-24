package hackerrank_easy;

import java.util.Arrays;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int[] applePositions = Arrays.stream(apples).map(i -> a + i).toArray();
        int[] orangePositions = Arrays.stream(oranges).map(i -> b + i).toArray();
        int countApples = (int)Arrays.stream(applePositions).filter(i -> ( i>=s && i <= t)).count();
        int countOranges = (int)Arrays.stream(orangePositions).filter(i -> (i>=s && i <= t)).count();
        System.out.println(countApples);
        System.out.println(countOranges);

    }

    public static void main(String[] args) {


        countApplesAndOranges(7, 11, 5, 15, new int[]{-2,2,1}, new int[]{5,-6});
    }


}
