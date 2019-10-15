package Lab1;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] k = {1, 3, 9, 4, 8, 5 };
        System.out.println(SubsetSum1(k, 0));
    }

    public static List<Integer> SubsetSum1(int[] set, int k){
        if(k == 0 ) return new LinkedList<>();
        int numberOfSubSets = (int) Math.pow(2, (set.length));
        List<Integer> returnSet = new ArrayList<>();
        for(int i = 0; i <= numberOfSubSets; i ++){
            returnSet.clear();
            List<Integer> binaryValue = convertToBinary(i);
            int sum = 0;
            for(int j = 0; j < binaryValue.size(); j++){
                if(binaryValue.get(j) == 1) {
                    returnSet.add(set[j]);
                    sum += set[j];
                }
            }
            if(sum == k) return returnSet;
        }
        return null;
    }
    static List<Integer> convertToBinary(int n){
        List<Integer> binaryRepresentation = new ArrayList<>();
        while(n>0){
            binaryRepresentation.add(n%2);
            n /= 2;
        }
        Collections.reverse(binaryRepresentation);
         return binaryRepresentation;   
    }
}
