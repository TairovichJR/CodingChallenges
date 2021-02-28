package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> vowels = List.of("a","e","i","o","u");
        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++) {
           if (  vowels.contains(chars[i]) ){
               chars[i] = String.valueOf(i+1);
            }
        }
        return Arrays.stream(chars).collect(Collectors.joining(""));
    }
}









