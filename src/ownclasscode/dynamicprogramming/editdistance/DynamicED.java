package ownclasscode.dynamicprogramming.editdistance;

import java.util.Arrays;

public class DynamicED {
    public static void main(String[] args) {
        DynamicED recursiveED = new DynamicED();
        System.out.println(recursiveED.ed("KediKebba", "Kedi"));
    }
    private int selfCalls = -1;
    int[][] ints;
    public int ed(String s, String t){
        selfCalls++;
        int i = s.length();
        int j = t.length();
        //Array to initialise values to zero
        if(i == 0) {
            System.out.println("If One");
            return j;
        }
        if (j == 0) {
            System.out.println("If Two");
            return i;
        }
        if(selfCalls == 0){
            ints = new int[i+1][j+1];
            for(int x = 1; x < ints.length; x++){
                for(int y =1; y < ints[x].length; y++) ints[x][y]--;
            }
        }
        if(ints[i][j] != -1) {
            System.out.println("If Three");
            return ints[i][j];
        }
        if(s.charAt(i-1) == t.charAt(j-1)){
            System.out.println("If Four");
            if(ints[i-1][j-1] == -1){
                System.out.println("If Four Two");
                ints[i-1][j-1] = ed(s.substring(0, i-1), t.substring(0, j-1));
            }
            ints[i][j] = ints[i-1][j-1];
        }
        else {
            System.out.println("Else Four");
            if(ints[i-1][j-1] == -1){
                System.out.println("If Five");
                ints[i-1][j-1] = ed(s.substring(0, i-1), t.substring(0, j-1));
            }
            if(ints[i-1][j] == -1){
                System.out.println("If Six");
                ints[i-1][j] = ed(s.substring(0, i-1), t);
            }
            if(ints[i][j-1] == -1){
                System.out.println("If Seven");
                ints[i][j-1] = ed(s, t.substring(0, j-1));
            }
            ints[i][j] = min(ints[i-1][j-1] +1, ints[i-1][j] +1, ints[i][j-1] +1);
        }
        System.out.println("-----------------------------------------------------------------------");
        for(int x = 0; x < ints.length; x++){
            System.out.println(Arrays.toString(ints[x]));
        }
        System.out.println("-----------------------------------------------------------------------");
        return ints[i][j];
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
