package org.example.LeetCode.Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int [] arry = {1,4,2,3,0,4,0,3,0,11,23,0,8,0};
        int pointer = arry.length - 1;
        for (int i = 0; i < arry.length; i++) {

            if(arry[i] == 0) {

                while(arry[pointer] == 0) {
                    pointer = pointer - 1;
                }
                int tempo = arry[pointer];
                arry[pointer] = arry[i];
                arry[i] = tempo;
            }
            System.out.println((Arrays.toString(arry)));
        }

        System.out.println((Arrays.toString(arry)));

    }
}
