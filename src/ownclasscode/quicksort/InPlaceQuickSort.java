package ownclasscode.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InPlaceQuickSort {
    public static void main(String[] args) {
        InPlaceQuickSort inPlaceQuickSort = new InPlaceQuickSort();
        int[] arr = {8, 1, 4, 9, 6, 3, 5, 2, 7, 0};
        System.out.println(Arrays.toString(inPlaceQuickSort.sort(arr)));
//        System.out.println(Arrays.toString(inPlaceQuickSort.pickPivot(arr, 0 ,9)));
    }

    int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    void quickSort(int[] arr, int lower, int upper) {
        int mid = (lower + upper) / 2;
        int[] pivot;
        if (upper < lower) {
            return;
        } else {
            pivot = pickPivot(arr, lower, upper);
            swap(arr, pivot[0], upper);
            int i = 0;
            int j = upper - 1;
            while (j >= i) {
                if (arr[i] < pivot[1]) i++;
                else if (arr[j] > pivot[1]) j--;
                else {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }
            pivot[0] = i;
            swap(arr, i, upper);
            System.out.println(Arrays.toString(arr));

        }
        quickSort(arr, lower, pivot[0] - 1);
        quickSort(arr, pivot[0] + 1, upper);
    }

    int[] pickPivot(int[] arr, int first, int last) {
        int mid = (first + last) / 2;
        System.out.println("Mid " + mid + "   lower " + first + "   Upper " + last);
        int[] returnArray = new int[2];
        if (arr[first] < arr[mid] && arr[first] < arr[last]) {
            if (arr[mid] > arr[last]) return new int[]{mid, arr[mid]};
            else return new int[]{last, arr[last]};
        } else if (arr[first] > arr[mid] && arr[first] > arr[last]) {
            if (arr[mid] > arr[last]) return new int[]{mid, arr[mid]};
            else return new int[]{last, arr[last]};
        } else {
            return new int[]{mid, arr[mid]};
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
