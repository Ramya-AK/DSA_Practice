package org.example.LeetCode.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int [] ar = {7, 6, 4, 3, 1};

        int min = ar[0];
        int res = 0;

        for (int i = 1; i < ar.length; i++) {
            min = Math.min(min, ar[i]);
            res = Math.max(res, ar[i] - min);
        }
        System.out.println(res);
    }
}
