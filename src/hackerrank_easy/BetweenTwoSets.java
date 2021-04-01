package hackerrank_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {


        int gcdOfB = gcd(b);
        List<Integer> lcmOfA = new ArrayList<>();
        int lcm1 = lcm(a);
        int inc = lcm1;
        for (int i = lcm1; i <= gcdOfB; i+= lcm1) {
            lcmOfA.add(inc);
            inc = inc + lcm1;
        }

        int count = 0;

        for (int i = 0; i < lcmOfA.size(); i++){
            boolean evenlyDivided = true;

            for (int j = 0; j < b.size(); j++){
                if (b.get(j) % lcmOfA.get(i) != 0){
                    evenlyDivided = false;
                }
            }
            if (evenlyDivided){
                count++;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static int gcd(List<Integer> a){
        return a.stream().reduce((b,c) -> gcd(b,c) ).get();
    }
    public static int lcm(int a , int b){
        return (a/ (gcd(a,b)))*b;
    }
    public static int lcm(List<Integer> a){
        return a.stream().reduce((b,c) -> lcm(b,c) ).get();
    }

    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2), Arrays.asList(20,30,12)));
    }

}
