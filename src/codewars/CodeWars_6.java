package codewars;

import java.text.DateFormatSymbols;
import java.time.Month;
import java.util.Arrays;

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


    public static void main(String[] args) {


        System.out.println(getDay(608, true));


        System.out.println(Arrays.toString( new DateFormatSymbols().getMonths()));
    }
}
