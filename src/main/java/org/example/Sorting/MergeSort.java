package org.example.Sorting;

import java.util.Arrays;

public class MergeSort {
    // divide the array and merge it with sorting order
    public static void main(String[] arg) {
        int[] unsortedArr = {5, 2, 3, 4, 1};
        sorting(unsortedArr, 0, unsortedArr.length);
        System.out.println(Arrays.toString(unsortedArr));
    }

    // mainly in merge sort
    // remember while sorting value should Left MID Right so right - left == 1 will return

    static void sorting(int[] arry, int left, int right) {

        if (right - left == 1) {
            return;
        }
        int mid = left + (right - left) / 2;


        sorting(arry, left, mid);
        sorting(arry, mid, right);

        mergeSortArray(arry, left, right, mid);


    }

    static void mergeSortArray(int[] arr, int left, int right, int mid) {
        int i = left;
        int j = mid;
        int k = 0;
        int[] newArrSorted = new int[right - left];

        while (i < mid && j < right) {
            if (arr[i] < arr[j]) {
                newArrSorted[k] = arr[i];
                i++;
            } else {
                newArrSorted[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            newArrSorted[k] = arr[i];
            i++;
            k++;
        }

        while (j < right) {
            newArrSorted[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < newArrSorted.length; l++) {
            arr[l + left] = newArrSorted[l];
        }
    }
}