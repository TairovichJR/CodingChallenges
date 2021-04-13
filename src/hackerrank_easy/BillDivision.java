package hackerrank_easy;

import java.util.List;

public class BillDivision {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int remain=(bill.stream().mapToInt(i->i).sum()-bill.get(k))/2-b;
        System.out.println(remain==0?"Bon Appetit":Math.abs(remain));
    }

    public static void main(String[] args) {

        bonAppetit(List.of(3,10,2,9), 1, 12);

    }
}
