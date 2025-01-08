package org.example.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTarget()));
    }
    static int[] findTarget() {
        int[][] arry = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int target =  3;
        int start = 0;
        int end = arry.length -1; // 3

        int mid = start + (end - start) /2; // 2

        while(start <= (arry.length -1) && end >=0) {
            if(arry[mid][mid] < target) {
                start ++;
            } else if(arry[mid][mid] > target) {
                end --;
            } else {
                return new int[]{mid, mid};
            }
            mid = start + (end - start) /2;
        }
        return   new int[]{-1, -1};



    }
}
