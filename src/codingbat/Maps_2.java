package codingbat;

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
}
