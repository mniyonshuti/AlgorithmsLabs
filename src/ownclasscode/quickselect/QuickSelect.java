package ownclasscode.quickselect;

import java.util.Arrays;

public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = {9,1,8,2,7,3,6,4,5,0};
        QuickSelect quickSelect = new QuickSelect();
        System.out.println(quickSelect.select(arr, 8));
    }
    int select(int[] arr, int k){
        return innerSelect(arr, k, 0, arr.length -1);
    }
    int innerSelect(int[] arr, int k, int lowerBound, int upperBound){
        System.out.println("Array " + Arrays.toString(arr));
        if(lowerBound > upperBound) return 0;
        else {
            int[] pivot = pickPivot(arr, lowerBound, upperBound);
            swap(arr, pivot[0], upperBound);
            int i = 0;
            int j = upperBound - 1;
            while (i <= j){
                if(arr[i] < pivot[1]) i++;
                else if(arr[j] > pivot[1]) j--;
                else {
                    swap(arr, i , j);
                    i++;
                    j--;
                }
            }
            swap(arr, i, upperBound);
            System.out.println("Pivot " + Arrays.toString(pivot) + "  I  " + i + "   J   " + j);
            if(i == k) return arr[i];
            else if(i > k) return innerSelect(arr, k,lowerBound, i-1);
            else return innerSelect(arr, k,i + 1, upperBound);
        }
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    int[] pickPivot(int[] arr, int lowerBound, int upperBound){
        int mid = (upperBound + lowerBound) /2;
        if(arr[lowerBound] < arr[mid] && arr[lowerBound] < arr[upperBound]){
            if(arr[mid] < arr[lowerBound]) return new int[]{mid, arr[mid]};
            else return new int[] {upperBound, arr[upperBound]};
        }
        else if(arr[lowerBound] > arr[mid] && arr[lowerBound] > arr[upperBound]){
            if(arr[mid] < arr[lowerBound]) return new int[]{mid, arr[mid]};
            else return new int[] {upperBound, arr[upperBound]};
        }
        else {
            return new int[] {lowerBound, arr[lowerBound]};
        }
    }

}
