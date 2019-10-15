package Lab3;

import java.util.Arrays;

public class SetOf012Sorting {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 2, 1, 2, 0, 2, 2, 0, 2, 0};
        System.out.println(Arrays.toString(sort012(arr)));
    }

    static int[] sort012(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length - 1;
        while (i <= n) {
            System.out.println(Arrays.toString(arr));
            System.out.println("I " + i + " J " + j + "  N " + n);
            if (arr[i] < 1) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] > 1) {
                swap(arr, i, n);
                n--;
            } else {
                i++;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
