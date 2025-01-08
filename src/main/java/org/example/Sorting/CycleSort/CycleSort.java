package org.example.Sorting.CycleSort;

import java.util.Arrays;

public class CycleSort {

    //O(N)

    // using the index to check the value is in the correct place or not
    // whenver question comes with N number of element use this

    public static void main(String[] arg) {
        sorting();
    }

    static void sorting() {
//                    0,1,2,3,4
//        while(i < arry.length) {
//            if(arry[i] != (i+1)) {  // 5!=1
//                int tempo = arry[i]; // 5
//
//                arry[i] = arry[tempo - 1]; // 1
//                arry[tempo - 1] = tempo;  // 3
//            } else {
//                i++;
////                System.out.println(arry[i]);
//            }
        int i = 0;
        int[] arry = {3,5,2,1,4};
        //   index =  2,4,1,0,3

            while(i < arry.length) {
                int correct = arry[i] - 1; // -1 becz index is always -1 of the number
                if(arry[i] != arry[correct]) {  // 5!=1
                    int tempo = arry[i]; // 5

                    arry[i] = arry[correct]; // 1
                    arry[correct] = tempo;  // 3
                } else {
                    i++;
                }
        }
        System.out.println(Arrays.toString(arry));
        }

}
