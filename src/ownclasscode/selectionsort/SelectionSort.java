package ownclasscode.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={7,1,4,8,2,998,3,5,6,2,5,3,65,6,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minPos = minPos(arr, i , arr.length -1);
            swap(arr, i, minPos);
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int minPos(int[] arr, int i, int j){
        int minPos = i;
        for(int y = i +1; y < arr.length; y++){
            if(arr[y] < arr[minPos]) minPos = y;
        }
        return minPos;
    }
}
