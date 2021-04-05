package codingbat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

}
