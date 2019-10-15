package Lab5;

import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        int[] arr = {1, 4, 5, 6};
        PowerSet powerSet = new PowerSet();
        System.out.println(powerSet.isSubsetSum(arr, 15));
    }

    boolean isSubsetSum(int[] set, int sum) {
        return innerSubsetSum(set, set.length, sum);
    }

    boolean innerSubsetSum(int set[], int len, int sum) {
        if (sum == 0){ return true; }
        if (len == 0 && sum != 0){ return false; }
        return innerSubsetSum(set, len - 1, sum) ||
                innerSubsetSum(set, len - 1, sum - set[len - 1]);
    }
}
