package org.example.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] arg) {
        sorting();
    }
   static int [] unSortedArray = {2,1,6,9,3,10,16,13,12};

    static void sorting() {
      boolean swapped;
        for (int i = 0; i < unSortedArray.length; i++) {
            swapped =  false; //imp
            for (int j = 1; j < unSortedArray.length - i; j++) {
                if (unSortedArray[j] < unSortedArray[j - 1]) {  // j + 1 makes the overflow so j - 1
                    int tempo = unSortedArray[j - 1];
                    unSortedArray[j - 1] = unSortedArray[j];
                    unSortedArray[j] = tempo;
                    swapped = true; // becz if you did not swapper for the particular i, it means the array it sorted hence stop the program

                }
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(unSortedArray));
    }
}
