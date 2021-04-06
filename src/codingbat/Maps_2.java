package codingbat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Maps_2 {

    public static String wordAppend(String[] strings) {

        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.put(strings[i], map.get(strings[i])+1);
                if (map.get(strings[i]) % 2 == 0){
                    result += strings[i];
                }
            }else {
                map.put(strings[i], 1);
            }
        }
        return result;
    }
    public static Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();
        Arrays.stream(strings).forEach( str -> {
            if (map.containsKey(str)){
                map.put(str, true);
            }else{
                map.put(str, false);
            }
        });
        return map;

    }


    public static String[] allSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c)){
                Integer foundIndex = map.get(c);
                String temp = strings[foundIndex];
                strings[foundIndex] = strings[i];
                strings[i] = temp;
                map.remove(c);
            }else{
                map.put(c, i);
            }
        }
        return strings;
    }

}









