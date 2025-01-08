package org.example.Sorting;

import java.util.Arrays;

// slect the max or min element and put it in the last or first array
public class SelectionSort {
    // worst case => O(N2)
    // Best case => O(N2)
    // Stable => NO


    public static void main(String[] arg) {
        sorting();
    }
    static int [] unSortedArray = {2,1,6,9,3,10,16,13,12};

    static void sorting() {
        for (int i = 0; i < unSortedArray.length ; i++) {
            int tempoMax = unSortedArray[unSortedArray.length - 1];
            for (int j = 0; j < unSortedArray.length; j++) {
                 tempoMax = i;
                if(unSortedArray[tempoMax] < unSortedArray[j]) {
                    tempoMax = j;
                }
            }
            int tempSwap = unSortedArray[unSortedArray.length - i - 1];
            unSortedArray[unSortedArray.length - i - 1] = unSortedArray[tempoMax];
            unSortedArray[tempoMax] = tempSwap;

        }

        System.out.println(Arrays.toString(unSortedArray));
    }
}
