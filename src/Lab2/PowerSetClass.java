package Lab2;

import java.util.ArrayList;
import java.util.List;

public class PowerSetClass {

    public static void main(String[] args) {
        List<Integer> subSet = new ArrayList<>();
        subSet.add(1);
        subSet.add(2);
        subSet.add(3);
        System.out.println(powerSet(subSet));
    }

    static List<List<Integer>> powerSet(List<Integer> X) {
        List<List<Integer>> powerSet = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        powerSet.add(subSet);
        List<Integer> currentSubSet;
        while (!X.isEmpty()) {
            int f = X.remove(0);
            int size = powerSet.size();
            for (int i = 0; i < size; i++) {
                List<Integer> unionSet = new ArrayList<>();
                currentSubSet = powerSet.get(i);
                unionSet.addAll(currentSubSet);
                unionSet.add(f);
                powerSet.add(unionSet);
            }
        }
        return powerSet;
    }
}
