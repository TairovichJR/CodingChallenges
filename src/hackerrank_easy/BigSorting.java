package hackerrank_easy;

import java.util.Arrays;

public class BigSorting {

    static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
        return unsorted;

    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(bigSorting(new String[]{
                "31415926535897932384626433832795",
                "74545458495495487584768476485484",
                "3",
                "10",
                "3",
                "5"
        })));

    }
}
