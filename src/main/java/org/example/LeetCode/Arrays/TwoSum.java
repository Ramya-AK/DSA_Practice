package org.example.LeetCode.Arrays;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        find();
    }

    static void find() {
        int[] arr = {2,11,15, 7};
        int target = 9;

        HashMap<Integer, Integer> hashMap =  new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val =  target - arr[i] ;
            hashMap.put(arr[i], i);
            if(hashMap.containsKey(val)) {
                System.out.println( hashMap.get(val) + " " + i);
            }
        }
    }
}
