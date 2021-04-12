package hackerrank_easy;

public class DayOfTheProgrammer {

    static String dayOfProgrammer(int year) {
        String result = ".09." + year;
        if (year == 1918){
            return 26 + result;
        }else if(year >= 1700 && year<= 1917 ){
            if (year % 4 == 0){
                return  12 + result;
            }else{
                return  13 + result;
            }
        }else{
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                return  12 + result;
            }else{
                return  13 + result;
            }
        }
        //one line solution
//        return (year==1918)?26+".09."+year
//                :(year>=1700&&year<=1917)
//                ?((year%4==0)?12+".09."+year:13+".09."+year)
//                :(year%400==0||(year%4==0&&year%100!=0)
//                ?12+".09."+year:13+".09."+year);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1984));
    }
}
