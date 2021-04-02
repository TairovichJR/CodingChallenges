package hackerrank_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingRecord {

    static int[] breakingRecords(int[] scores) {

        if (scores.length < 1){
            return new int[]{0,0};
        }
        int lowestScore = scores[0];
        int highestScore = scores[0];
        List<Integer> lowest = new ArrayList<>();
        List<Integer> highest = new ArrayList<>();
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > highestScore ){
                highestScore = scores[i];
                highest.add(highestScore);
            }
            if (scores[i] < lowestScore){
                lowestScore = scores[i];
                lowest.add(lowestScore);
            }
        }
        return new int[]{ highest.size(), lowest.size()};
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25,1})));


    }
}