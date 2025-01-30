package org.example.LeetCode.Arrays;

import java.util.Arrays;

public class ReverseSubArray {

    public static void main(String[] args) {
        int [] ar = {1,3,2,7,9,8,0};

        int k = 3;
        for (int i = 0; i < ar.length; i = i + k) {
            int left = i;

            int right =  Math.min(i + k - 1, ar.length-1);  // imp

            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
        }

        System.out.println(Arrays.toString(ar));
    }
}
