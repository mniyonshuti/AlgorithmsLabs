package ownclasscode.quicksort;

import java.util.List;

public class QuickSort {

    int[] sort(int[]arr){
        int len = arr.length-1;
        int pivot = pickPivot(arr, 0, len);
//        List<>
        return null;
    }
    int pickPivot(int[] arr, int start, int end){
        int mid = (start + end) / 2;
        if(arr[start] < arr[mid] && arr[mid] < arr[end]){
            return arr[mid];
        }
        else if(arr[mid] < arr[start] && arr[start] < arr[end]){
            return arr[start];
        }
        else {
            return arr[mid];
        }
    }

}
