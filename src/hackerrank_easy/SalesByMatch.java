package hackerrank_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < ar.length; i++){
            int num = ar[i];
            if (map.containsKey(num)){
                int value = map.get(num);
                map.put(num, value+1);
                value = map.get(num);
                if (value % 2 == 0){
                    count++;
                    map.remove(num);
                }
            }else{
                map.put(num, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(sockMerchant(9, new int[]{10,20, 20, 10, 10, 30, 50, 10, 20}));
    }

}
