package Lab10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeastPerfectSquaresDynamic {
    public static void main(String[] args) {
        LeastPerfectSquaresDynamic leastPerfectSquares = new LeastPerfectSquaresDynamic();
        System.out.println(leastPerfectSquares.leastPerfectSquare(67));
    }

    public int leastPerfectSquare(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
               // System.out.println("    I   " + i + "    J   " + j  +  "     i + j * j     "  + (i + j * j) + "    dp[i + j * j]  " + dp[i + j * j] + "   dp[i]  " +dp[i]) ;
                dp[i + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
            System.out.println(Arrays.toString(dp) + "    I   " + i ) ;
        }
        return dp[n];
    }

}

