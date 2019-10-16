package Lab10;

import java.util.Arrays;

public class QuestionThreeIterative {

    public static void main(String[] args) {
        QuestionThreeIterative interviewQuestion3 = new QuestionThreeIterative();
        System.out.println(interviewQuestion3.longestSubSequence("maple", "kale"));
    }

    public int longestSubSequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] D = new int[m + 1][n + 1];
        if (m == 0 || n == 0) return 0;
        D[0][0] = 0;
        for (int i = 1; i < m + 1; i++) {
            D[i][0] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            D[0][i] = 0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    D[i][j] = D[i - 1][j - 1] + 1;
                } else {
                    D[i][j] = Math.max(D[i][j - 1], D[i - 1][j]);
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------");
        for(int i = 0; i < D.length; i++){
            System.out.println(Arrays.toString(D[i]));
        }
        System.out.println("-----------------------------------------------------------------------");
        return D[m][n];
    }
}
