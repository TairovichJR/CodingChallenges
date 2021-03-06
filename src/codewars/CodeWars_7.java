package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeWars_7 {

    public String spoonerize(String words) {

//        String[] s = words.split(" ");
//        if (s.length > 1){
//            String firsChar = String.valueOf(s[0].charAt(0));
//            String lastChar = String.valueOf(s[s.length-1].charAt(0));
//            s[0] = lastChar + s[0].substring(1);
//            s[s.length-1] = firsChar+ s[s.length-1].substring(1);
//            words = "";
//            for (String s1 : s) {
//                words = words + s1 + " ";
//            }
//        }
//        return words.trim();
        String[] word = words.split(" ");
        return word[1].substring(0, 1) + word[0].substring(1) + " " + word[0].substring(0, 1) + word[1].substring(1);
    }

    public static int sortDesc(final int num) {



       return num >= 0 ? Integer.parseInt(Arrays.stream(String.valueOf(num).split(""))
               .sorted((a, b) -> b.compareTo(a))
               .collect(Collectors.joining(""))) : num;
    }

    public static String oddOrEven (int[] array) {

        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    public static String vowel2Index(String s) {

//        List<String> vowels = List.of("a","e","i","o","u");
//        String[] chars = s.split("");
//        for (int i = 0; i < chars.length; i++) {
//           if (  vowels.contains(chars[i]) ){
//               chars[i] = String.valueOf(i+1);
//            }
//        }
//        return Arrays.stream(chars).collect(Collectors.joining(""));
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//          result = result + ("aeiouAEIOU".indexOf(s.charAt(i)) == -1 ? String.valueOf(s.charAt(i)) : (i + 1));
//        }
//        return result;
        return IntStream.range(0, s.length())
                .mapToObj( i -> "aeiouAEIOU".indexOf(s.charAt(i)) >=0 ? String.valueOf(i+1) : String.valueOf(s.charAt(i)))
                .collect(Collectors.joining());
    }

    public static String alhapNum(int N, String S){
        StringBuffer newStr=new StringBuffer(S);
        for(int i = 0; i < S.length(); i++) {
            if(Character.isLowerCase(S.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(S.charAt(i)));
            }
            else if(Character.isUpperCase(S.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(S.charAt(i)));
            }
        }
        return newStr.toString();
    }

    public static String qualified(int N, int A[]){
        String rows = "0 ";
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]){
                rows += " " + i;
                max = A[i];
            }
        }
        return rows.trim();
    }



    public static int findCredit(int customers, int fooditems, int[]customerlimit, int[] foodcredit){
        int count = 0;
        for (int i = 0; i < foodcredit.length; i++) {
            for (int j = 0; j < customerlimit.length; j++) {

                if (customerlimit[j] >= foodcredit[i]){
                    count++;
                }
            }
        }
        return  count;
    }

    public static int oddEven(int N, int A[]){

        int[] even = Arrays.stream(A).filter(n -> n % 2 == 0).sorted().toArray();
        int[] odd = Arrays.stream(A).filter(n -> n % 2 != 0).sorted().toArray();

        int evenMedium = 0;
        int evenLength = even.length;
        if (evenLength > 0){
            if (evenLength % 2 == 1){
                evenMedium = even[ (evenLength+1)/2-1 ];
            }else{
                evenMedium = (even[evenLength/2-1] + even[evenLength/2])/2;
            }
        }
        int oddMedium = 0;
        int oddLength = odd.length;
        if (oddLength > 0){
            if (oddLength % 2 == 1){
                oddMedium = odd[ (oddLength+1)/2-1 ];
            }else{
                oddMedium = (odd[oddLength/2-1] + odd[oddLength/2])/2;
            }
        }


        return evenMedium + oddMedium;
    }
    public static void main(String[] args) {
        System.out.println(oddEven(8, new int[]{2,4,6,8,10,12,14,16}));

    }
}










