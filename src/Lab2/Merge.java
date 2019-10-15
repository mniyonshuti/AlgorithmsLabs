package Lab2;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2,3,4,5};
        int[] arr2 = {6, 8, 11, 13, 21, 23, 25};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int y = 0;
        while (y < mergedArray.length) {
            if (i == arr1.length) {
                for (int z = j; z < arr2.length; z++) {
                    mergedArray[y] = arr2[z];
                    y++;
                }
            } else if (j == arr2.length) {
                for (int z = j; z < arr1.length; z++) {
                    mergedArray[y] = arr1[z];
                    y++;
                }
            } else {
                if (arr1[i] < arr2[j]) {
                    mergedArray[y] = arr1[i];
                    i++;
                    y++;
                } else {
                    mergedArray[y] = arr2[j];
                    j++;
                    y++;
                }
            }
        }
        return mergedArray;
    }
}
