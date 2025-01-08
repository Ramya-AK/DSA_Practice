package org.example.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find()));
    }

    static int[] find() {

        // not fully sorted
        int[][] arry = {
                {1,2,13},  // started from the top left
                {7,8,19},
                {10,11,112}
        };

        int target = 10;
        int row = 0;
        int column =  arry.length -1; //2

        while(row <= arry.length -1 && column >=0) { // check the condition
            if(arry[row][column] == target) {
                return new int[]{row, column};
            }
            if(arry[row][column] < target) {
                row++;

            } else {
                column --;
            }
        }
        return new int[]{-1, -1};

    }
}
