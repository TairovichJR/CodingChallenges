package hackerrank_easy;

import java.util.Arrays;
import java.util.List;

public class GradingStudent {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38){
                Integer grade = grades.get(i);
                int mod = grade % 10;
                if (mod < 5){
                    if (5 - mod < 3){
                        grades.set(i, grade+(5-mod));
                    }
                }else if (mod > 5 ){
                    if (10-mod < 3){
                        grades.set(i, grade+(10-mod));
                    }
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(73,67,38,33);
        System.out.println(  gradingStudents(    nums ));
    }
}
