package hackerrank_easy;

public class KangarooJump {

    static String kangaroo(int x1, int v1, int x2, int v2) {

       if (x1 < x2){
           if (v1 >= v2) {
               int first = x1;
               int second = x2;
               while (first < ((first + 1) * 10) && second < ((second + 1) * 10)) {
                   first += v1;
                   second += v2;
                   if (first == second) {
                       return "YES";
                   }
               }
           }
       }else {
           if (v1 <= v2) {
               int first = x1;
               int second = x2;
               while (first < (first * 10) && second < (second * 10)) {
                   first += v1;
                   second += v2;
                   if (first == second) {
                       return "YES";
                   }
               }
           }
       }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
    }

}
