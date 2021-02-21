package codewars;

import java.util.Arrays;

public class CodeWars_7 {

    public String spoonerize(String words) {

        String[] s = words.split(" ");
        if (s.length > 1){
            String firsChar = String.valueOf(s[0].charAt(0));
            String lastChar = String.valueOf(s[s.length-1].charAt(0));
            s[0] = lastChar + s[0].substring(1);
            s[s.length-1] = firsChar+ s[s.length-1].substring(1);
            words = "";
            for (String s1 : s) {
                words = words + s1 + " ";
            }
        }
        return words.trim();
    }
}
