package ownclasscode;

import java.util.Arrays;

public class MergeSort {
    int[] theArray;

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {8,2,4,1};
        System.out.println(Arrays.toString(mergeSort.sort(arr)));

    }

    int[] sort(int[] arr) {
        int length = arr.length;
        int[] tempArray = new int[length];
        theArray = arr;
        mergeSort(tempArray, 0, length - 1);
        return theArray;
    }

    void mergeSort(int[] arr, int lower, int upper) {
        if (lower == upper) {
            System.out.println("  Lower " + lower + "   Upper  " + upper  + "  number " + theArray[lower]);
            return;
        } else {
            int mid = (lower + upper) / 2;
            System.out.println("  Mid " + mid);
            mergeSort(arr, 0, mid);
            mergeSort(arr, mid + 1, upper);
            merge(arr, lower, mid + 1, upper);
        }
    }

    public void merge(int[] tempStorage, int lowerPointer, int upperPointer, int upperBound) {
        System.out.println("Temp " + Arrays.toString(tempStorage));
        System.out.println("LowerPointer " + lowerPointer + "  UpperPointer " + upperPointer + "  UpperBound " + upperBound);
        int j = 0; //tempStorage index
        int lowerBound = lowerPointer;
        //total number of elements to rearrange
        int n = upperBound - lowerBound + 1;
        //view the range [lowerBound,upperBound] as two arrays
        //[lowerBound, mid], [mid+1,upperBound] to be merged
        int mid = upperPointer - 1;
        while (lowerPointer <= mid && upperPointer <= upperBound) {
            if (theArray[lowerPointer] <= theArray[upperPointer]) {
                tempStorage[j++] = theArray[lowerPointer++];
            } else {
                tempStorage[j++] = theArray[upperPointer++];
            }
        }
        System.out.println("After adding one element" + Arrays.toString(tempStorage));
        //left array may still have elements
        while (lowerPointer <= mid) {
            tempStorage[j++] = theArray[lowerPointer++];
        }
        //right array may still have elements
        while (upperPointer <= upperBound) {
            tempStorage[j++] = theArray[upperPointer++];
        }
        //replace the range [lowerBound,upperBound] in theArray with
        //the range [0,n-1] just created in tempStorage
        for (j = 0; j < n; ++j) {
            theArray[lowerBound + j] = tempStorage[j];
        }
    }


}
