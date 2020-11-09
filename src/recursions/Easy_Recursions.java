package recursions;

public class Easy_Recursions {

    public static int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return  n * factorial(n-1);
    }

    public static  int bunnyEars(int bunnies) {
        if (bunnies == 0){
            return 0;
        }
        return 2 + bunnyEars(bunnies-1);
    }

    public static int fibonacci(int n) {
         if (n == 0 || n == 1){
            return n;
         }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0){
            return 0;
        }
        else if (bunnies % 2 == 0){
            return 3 + bunnyEars2(bunnies-1);
        }
        return 2 + bunnyEars2(bunnies-1);
    }

    public int triangle(int rows) {
        if (rows == 0){
            return 0;
        }
        return rows + triangle(rows-1);
    }

    public static int sumDigits(int n) {
        if (n == 0){
            return 0;
        }
        int t = n % 10;
        n = n / 10;
        return t + sumDigits(n);
    }

    public static int count7(int n) {
        if(n == 0)
            return 0;

        if(n % 10 == 7)
            return 1 + count7(n / 10);

        return count7(n / 10);
    }

    public static  int count8(int n) {
//        if (n < 1) return 0;
//        if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8(n/10);
//        else if (n % 10 == 8) return 1 + count8(n/10);
//        else return count8(n/10);
        if (n == 0){
            return 0;
        }
        int count = 0;
        if (n % 10 == 8){
            count++;
            if (n % 100 == 88){
                return count*2 + count8(n/10);
            }
            return count + count8(n/10);
        }
        return count8(n/10);
    }

    public static int powerN(int base, int n) {
        if (n == 0){
            return 1;
        }
        return base * powerN(base, n-1);
    }
}
