package ownclasscode.dynamicprogramming.fibonacci;

import java.util.Arrays;

public class DynamicFib {
    public static void main(String[] args) {
        DynamicFib dynamicFib = new DynamicFib();
        System.out.println(dynamicFib.fib(6));
    }
    private int[] fibs;
    int[] table;
    public int fib(int n){
        fibs = new int[n+1];
        table = new int[n+1];
        for(int i = 0; i < fibs.length; i++){
            fibs[i] = -1;
            table[i] = -1;
        }
       return innerFib(n);
    }
    private int innerFib(int c){
        if(c == 0 || c == 1) {
            fibs[c] = c;
            return fibs[c];
        }
        if(fibs[c - 2 ] < 0){
            fibs[c -2 ] = innerFib(c-2);
        }
        if(fibs[c - 1 ] < 0){
            fibs[c -1 ] = innerFib(c-1);
        }
        fibs[c] = fibs[c -1 ] + fibs[c -2 ];
        System.out.println("temp  " + c + "  " +Arrays.toString(fibs));
        return fibs[c];
    }

    private int subprobFib(int m) {
        if(m == 0 || m == 1) {
            table[m] = m;
            return table[m];
        }
        if(table[m-2] < 0) {
            table[m-2] = subprobFib(m-2);
            System.out.println("call to subprobFib on "+(m-2));
        }
        if(table[m-1] < 0) {
            table[m-1] = subprobFib(m-1);
            System.out.println("call to subprobFib on "+(m-1));
        }
        table[m] = table[m-1] + table[m-2];
        return table[m];
    }

}
