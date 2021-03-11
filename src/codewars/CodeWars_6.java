package codewars;

import java.text.DateFormatSymbols;
import java.time.Month;
import java.util.*;
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

    public static String noOffFactors(int N, int X, int A[]){

        ArrayList<Integer> factors = new ArrayList<>();
        int[] sorted = Arrays.stream(A).distinct().sorted().toArray();
        Arrays.stream(sorted).filter( x -> X>=x && X%x == 0).forEach(x -> factors.add(x));
        String result = factors.stream().map(arr -> String.valueOf(arr)).collect(Collectors.joining(" "));
        return factors.size() + "\n" + result;
    }

    public static void shortestJobFirst(int N, int[] B){
        int[] sortedB = Arrays.stream(B).sorted().toArray();
        ArrayList<Integer> saved = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < sortedB.length; i++) {
            j = j + sortedB[i];
            saved.add(j);
        }
        final long count = saved.stream().reduce(0, (a,b)-> a+b);
        System.out.println( (int) Math.floor( count/saved.size()));
    }

    public static String longestConsec(String[] strarr, int k) {

        if (k > 0 && (strarr.length > 0 && strarr.length > k)){
            String[] str = new String[strarr.length-k+1];
            for (int i = 0; i < str.length; i++){
                String item = "";
                for (int j = i; j < i+k; j++){
                      item  += strarr[j];
                }
                str[i] = item;
            }
            String first = Arrays.stream(str)
                    .max(Comparator.comparingInt(String::length)).stream().findFirst()
                    .get();
            return first;
        }
        return "";
    }


    public static void main(String[] args) {

        System.out.println( longestConsec(
                new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));

    }
}
