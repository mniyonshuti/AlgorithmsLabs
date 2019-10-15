package ownclasscode.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={7,1,4,8,2,998,3,5,6,2,5,3,65,6,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int j = i;
            int temp = arr[i];
            while (j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
