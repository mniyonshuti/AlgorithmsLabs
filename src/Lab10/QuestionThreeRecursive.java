package Lab10;

public class QuestionThreeRecursive {
    public static void main(String[] args) {
        QuestionThreeRecursive interviewQuestion3 = new QuestionThreeRecursive();
        System.out.println(interviewQuestion3.longestSubSequence("regular", "ruler"));
        System.out.println("Self calls " + interviewQuestion3.selfCalls);
    }
    int selfCalls = 0;
    public int longestSubSequence(String s, String t) {
        selfCalls++;
        System.out.println("\"S\"   " + s + "   \"T\"   ");
        if (s.length() == 0 || t.length() == 0) return 0;
        int m = s.length();
        int n = t.length();
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            return 1 + longestSubSequence(s.substring(0, m - 1), t.substring(0, n - 1));
        } else {
            return Math.max(longestSubSequence(s.substring(0, m - 1), t.substring(0, n)), longestSubSequence(s.substring(0, m), t.substring(0, n - 1)));
        }
    }

}
