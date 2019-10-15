package Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(7,9));
    }
    static int gcd(int m, int n){
        List<Integer> commonFactors = new ArrayList<>();
        List<Integer> mFactors = findFactors(m);
        List<Integer> nFactors = findFactors(n);
        for(int i = 0; i < mFactors.size(); i++){
            if(nFactors.contains(mFactors.get(i))){
                commonFactors.add(mFactors.get(i));
            }
        }
        Collections.sort(commonFactors);
        return commonFactors.get(commonFactors.size() - 1);
    }
    static List<Integer> findFactors(int n){
        int start = 1;
        int stop = n;
        List<Integer> factors = new ArrayList<>();
        while(start < stop){
            if(n % start == 0){
                factors.add(start);
                stop = n / start;
                factors.add(stop);
            }
            start ++;
        }
        return factors;
    }
}
