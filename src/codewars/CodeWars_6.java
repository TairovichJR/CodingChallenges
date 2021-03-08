package codewars;

import java.text.DateFormatSymbols;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeWars_6 {

    public static String getDay(int day, boolean isLeap) {
        int[] monthDaysNums = {31, isLeap?29:28, 31,30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < monthDaysNums.length; i++) {
            if (day > monthDaysNums[i]){
                day = day - monthDaysNums[i]; // 41 - 31 = 10
            }else{
                String month = Month.of(i+1).name();
                return month.substring(0,1) + month.substring(1).toLowerCase() + ", " + day;
            }
        }
        return "";
    }

    public static String expandedForm(int num) {
//        String str = String.valueOf(num);
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < str.length(); i++){
//            int n = Integer.parseInt(str.substring(i, i + 1));
//            if (n > 0){
//                result.add(n + str.substring(i+1).replaceAll("[0-9]","0") );
//            }
//        }
//        return result.stream().collect(Collectors.joining(" + "));

        return IntStream.range(0, String.valueOf(num).length())
                .mapToObj(x -> String.valueOf(Character.getNumericValue(String.valueOf(num).charAt(x))
                * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
                .filter(x -> !x.equals("0"))
                .collect(Collectors.joining(" + "));
    }

    public static int plusMinus(int n, String s){
        String[] split = s.split("");
        List<String> collect = Arrays.stream(split).collect(Collectors.toList());
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++ ){
                List<String> sublist = collect.subList(i, j);
                int plus = (int)sublist.stream().filter(el -> el.equals("+")).count();
                int minus = (int)sublist.stream().filter(el -> el.equals("-")).count();
                int diff = plus - minus;
                if (diff > max){
                    max = diff;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(plusMinus(29, "-++++--+---+----+-+--++++++-+"));
    }
}
