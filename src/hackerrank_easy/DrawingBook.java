package hackerrank_easy;

public class DrawingBook {


    static int pageCount(int n, int p) {

        int forwardFlip = 0;
        int firstPage;
        if (p % 2 != 0){
            firstPage = 1;
        }else{
            firstPage = 0;
        }
        while (firstPage!= p && firstPage <= n){
            firstPage += 2;
            forwardFlip++;
        }

        int backwardFlip = 0;
        int lastPage = n;
        if ( p % 2 != 0){
            if (lastPage % 2 == 0) {
                lastPage += 1;
            }
        }else{
            if (lastPage % 2 != 0) {
                lastPage -= 1;
            }
        }
        while (lastPage != p){
            lastPage -= 2;
            backwardFlip++;
        }
        return Math.min(forwardFlip, backwardFlip);
    }

    static int pageCount2(int n, int p) {

        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);

    }
    public static void main(String[] args) {

        System.out.println(pageCount2(5,3));

    }
}
