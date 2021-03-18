package hackerrank_easy;


public class TimeConversion {

    static String timeConversion(String s) {

        String AM_PM = s.substring(s.length() - 2);
        int time = Integer.parseInt(s.substring(0, 2));
        if (AM_PM.equalsIgnoreCase("PM")){
            if (time < 12 && time > 0){
                time += 12;
            }
        }else{
            if (time == 12){
                time -= 12;
            }
        }
        String strTime = time < 10 ?  "0"+time : String.valueOf(time);
        return strTime  + s.substring(2, s.length()-2) ;
    }

    public static void main(String[] args) {

        System.out.println(timeConversion("01:51:00PM"));
    }

}
