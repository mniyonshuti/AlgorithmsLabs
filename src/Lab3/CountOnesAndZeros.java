package Lab3;

import java.util.Arrays;

public class CountOnesAndZeros {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr2 = {3, 1, 4, 4, 6, 2, 8, 9, 4, 6, 8, 2};
        System.out.println(Arrays.toString(countOnesAndZeros(arr)));

    }

    static int[] countOnesAndZeros(int[] arr) {
        return innerCountOnesAndZeros(arr, 0, arr.length - 1);
    }

    private static int[] innerCountOnesAndZeros(int[] arr, int lower, int upper) {
        int mid = (upper + lower) / 2;
        if(arr.length == 0) return new int[] {0, 0};
        else if(mid == 0 && arr[mid] == 1) return new int[] {0, arr.length -1};
        else if(mid == arr.length - 1 && arr[mid] == 0) return new int[] {arr.length -1, 0};
        if (arr[mid] == 0 && arr[mid + 1] == 1) {
            int numberOfZeros = mid + 1;
            int numberOfOnes = arr.length - numberOfZeros;
            return new int[]{numberOfZeros, numberOfOnes};
        } else if ((arr[mid - 1] == 0 && arr[mid] == 1)) {
            int numberOfZeros = mid;
            int numberOfOnes = arr.length - numberOfZeros;
            return new int[]{numberOfZeros, numberOfOnes};
        } else {
            if ((arr[mid] == 1 && arr[mid - 1] == 1)) {
                upper = mid - 1;
                return innerCountOnesAndZeros(arr, lower, mid - 1);
            } else {
                return innerCountOnesAndZeros(arr, mid + 1, upper);
            }
        }
    }
}
