package ownclasscode.dynamicprogramming.editdistance;

import java.util.Arrays;

public class IterativeDynamic {

    public static void main(String[] args) {

        IterativeDynamic e = new IterativeDynamic();
        System.out.println(e.ed("maple", "kale"));
    }

    public int ed(String s, String t) {
        int x = s.length();
        int y = t.length();
        int D[][] = new int[x + 1][y + 1];
        D[0][0] = 0;
        for (int i = 1; i <= x; i++)
            D[i][0] = i;
        for (int i = 1; i <= y; i++)
            D[0][i] = i;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    D[i][j] = D[i - 1][j - 1];
                } else {
                    D[i][j] = min(D[i - 1][j - 1], D[i - 1][j] , D[i][j - 1]) + 1;
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------");
        for(int i = 0; i < D.length; i++){
            System.out.println(Arrays.toString(D[i]));
        }
        System.out.println("-----------------------------------------------------------------------");
        return D[x][y];
    }

    public int min(int a, int b, int c) {
        if (a > b && a > c) {
            return b < c ? b : c;
        } else if (b > a && b > c) {
            return a < c ? a : c;
        } else {
            return b < a ? b : a;
        }
    }
}
