package org.example.Sorting;

import java.util.Arrays;

public class CountSort {

    // it is a non comparision sorting =>  it won't campare the value
    // it will good for the small arrays
    // O(m+n) time

    // disadvantage
    // it won't works for decimal value
    // large arrays

    public static void main(String[] args) {
        counting();
    }

    static public void counting() {
        int [] arry = {1,3,3,2,4,5,3,7,1,4,5,9};
        int maxValue = arry[0];
        for (int max: arry) {
            if(maxValue < max) {
                maxValue = max;
            }
        }


        int [] newArray = new int[maxValue + 1];

        for(int value: arry) {
            newArray[value]++;
        }

        int index =0;
        for (int i = 0; i <= maxValue; i++) {
            while(newArray[i] > 0){
                arry[index] = i;
                index ++;
                newArray[i] --;
            }
        }


        System.out.println(Arrays.toString(arry));
    }
}
