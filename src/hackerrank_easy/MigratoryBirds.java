package hackerrank_easy;

import java.util.*;
public class MigratoryBirds {


    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        //Add the items from arr to map, mapping with their count of occurrences
        arr.stream().forEach(item -> {
            if (map.containsKey(item)){
                Integer val = map.get(item);
                map.put(item, val+1);
            }else{
                map.put(item, 1);
            }
        });
        //find the max value from map
        int maxValue = map.values().stream().mapToInt(i -> i).max().getAsInt();
        //Stream the map, filter the entries whose values are equal to maxValue, sort the entries based on their keys, return the min of keys
        int min = map.entrySet().stream().filter(i -> i.getValue() == maxValue).sorted(Comparator.comparingInt(Map.Entry::getKey))
                .findFirst()
                .map(Map.Entry::getKey).get();
        return min;
    }

    public static void main(String[] args) {

        System.out.println( migratoryBirds(List.of(1,1,4,4,7,7,5,3)));
    }

}
