package hackerrank_easy;

import java.util.*;

public class TreeConstructor {
    public static void main(String[] args) {


        String[] ints = {"(1,2)", "(3,2)", "(2, 12)", "(5,2)"};
        System.out.println(        treeConstructor(ints));

    }

    public static boolean treeConstructor(String[] strArr){
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String[] split = strArr[i].replace("(", "").replace(")", "").split(",");
            int n1 = Integer.parseInt(split[0].trim());
            int n2 = Integer.parseInt(split[1].trim());
            ints.add(n1);
            ints.add(n2);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ints.size(); i++) {
            if (map.containsKey(ints.get(i))){
                int existing = map.get(ints.get(i));
                map.put(ints.get(i), existing+1);
            }else{
                map.put(ints.get(i), 1);
            }
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() >= 4){
                return false;
            }
        }
        return true;
    }
}
