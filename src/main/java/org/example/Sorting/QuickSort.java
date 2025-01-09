package org.example.Sorting;

import java.util.Arrays;

public class QuickSort {
    static int [] unSortedArray = {2,1,6,9,3,10,16,13,12};

    public static void main(String[] arg) {

        sorting(unSortedArray, 0, unSortedArray.length - 1);
        System.out.println(Arrays.toString(unSortedArray));
    }

    // Mainly get the pivot and sort the value below pivot to lesser and after pivot to higher
    // pivot used to get the partition of the array so that we can sort the value according to that
    // take a i less than the low value and increment if it is satifies the confition and at the last increment i value and add the pivot
    // this means below pivot is always the lower value


    static void sorting(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            sorting(arr, low, pivot - 1);
            sorting(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high ; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i] ;
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1] ;
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
