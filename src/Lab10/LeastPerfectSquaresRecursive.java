package Lab10;

import java.util.Arrays;

public class LeastPerfectSquaresRecursive {
    public static void main(String[] args) {
        LeastPerfectSquaresRecursive leastPerfectSquares = new LeastPerfectSquaresRecursive();
        System.out.println(leastPerfectSquares.leastPerfectSquare(52));
        System.out.println(leastPerfectSquares.selfCalls);
    }
    int selfCalls = -1;
    public int leastPerfectSquare(int n) {
        int minSquareRoot = (int) Math.floor(Math.sqrt(n));
        return innerPerfectSquare(n, minSquareRoot);
    }
    private int innerPerfectSquare(int num, int maxSqrt){
        selfCalls++;
        if (num <= 0) {
            return 0;
        }
        int min = innerPerfectSquare(num -1, maxSqrt);
        for (int i = 2; i <= maxSqrt; i++) {
            if (num >= i * i) {
                min = Math.min(min, innerPerfectSquare(num - i * i, maxSqrt));
            }
        }
        return min + 1;
    }




}
