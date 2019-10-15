package ownclasscode.dynamicprogramming.editdistance;

public class Min {

    public static int min(int i, int j, int k) {

        return i<j? (i<k? i:k): (j<k? j:k);
    }
}
