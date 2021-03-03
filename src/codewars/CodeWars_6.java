package codewars;

import java.text.DateFormatSymbols;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        String str = String.valueOf(num);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            int n = Integer.parseInt(str.substring(i, i + 1));
            if (n > 0){
                result.add(n + str.substring(i+1).replaceAll("[0-9]","0") );
            }
        }
        return result.stream().collect(Collectors.joining(" + "));
    }

    public static void main(String[] args) {

        System.out.println(expandedForm(70304));
        System.out.println( "3337675454".substring(1).replaceAll("[0-9]","0"));
    }
}
