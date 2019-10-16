package Lab10;

public class QuestionThreeDynamic {
    int selfCalls = -1;
    int D[][];

    public static void main(String[] args) {
        QuestionThreeDynamic interviewQuestion3 = new QuestionThreeDynamic();
        System.out.println(interviewQuestion3.longestSubSequence("maple", "kale"));
        System.out.println("Self calls " + interviewQuestion3.selfCalls);
    }

    public int longestSubSequence(String s, String t) {
        selfCalls++;
        System.out.println("\"S\"   " + s + "   \"T\"   " + t);
        if (s.length() == 0 || t.length() == 0) return 0;
        int m = s.length();
        int n = t.length();
        if (selfCalls == 0) {
            D = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    D[i][j]--;
                }
            }
        }
        if (D[m][n] != -1) return D[m][n];
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            if (D[m - 1][n - 1] == -1) {
                D[m - 1][n - 1] = longestSubSequence(s.substring(0, m - 1), t.substring(0, n - 1));
            }
            D[m][n] = 1 + D[m - 1][n - 1];
        } else {
            D[m][n] = Math.max(longestSubSequence(s.substring(0, m - 1), t.substring(0, n)), longestSubSequence(s.substring(0, m), t.substring(0, n - 1)));
        }
        return D[m][n];
    }
}
