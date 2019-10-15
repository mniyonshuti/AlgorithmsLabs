package ownclasscode.dynamicprogramming.editdistance;

public class RecursiveED {
    public static void main(String[] args) {
        RecursiveED recursiveED = new RecursiveED();
    System.out.println(recursiveED.ed("maple", "kale"));

    }

    public int ed(String s, String t){
        System.out.println("S   " + s + "    t   " + t);
        int i = s.length()-1;
        int j = t.length()-1;
        if(i <= 0) {
            System.out.println("If one");
            System.out.println("S   " + s + "    t   " + t);
            return t.length();
        }
        else if (j <= 0) {
            System.out.println("else If one");
            System.out.println("S   " + s + "    t   " + t);
            return s.length();
        }
        else {
            System.out.println("else one");
            System.out.println("S   " + s + "    t   " + t);
            if(s.charAt(i) == t.charAt(j)){
                System.out.println("If two");
                System.out.println("S   " + s + "    t   " + t);
                System.out.println("I " + i + "  J " + j);
                System.out.println("I " + s.charAt(i)  + "  J " + t.charAt(j));
                return ed(s.substring(0,i-1), t.substring(0, j-1));
            }
            else {
                System.out.println("else two");
                System.out.println("I " + i + "  J " + j);
                System.out.println("S   " + s + "    t   " + t);
                return  1 + min(ed(s.substring(0,i-1), t.substring(0, j)), ed(s.substring(0,i), t.substring(0, j-1)), ed(s.substring(0,i-1), t.substring(0, j-1)));
            }

        }
    }
    public int min( int a, int b, int c){
        if(a > b && a > c){
            return b < c ? b : c;
        }
        else if(b > a && b > c){
            return a < c ? a : c;
        }
        else {
            return b < a ? b : a;
        }
    }
}
