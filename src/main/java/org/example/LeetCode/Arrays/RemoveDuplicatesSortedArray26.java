package org.example.LeetCode.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,6,6}; // Input array
        int[] expectedNums = {0,1,2,3,4,5,6}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    static int removeDuplicates(int[] arry) {
        int j = 1;
        for (int i = 1; i < arry.length; i++) {
            if(arry[i] != arry[i - 1]) {
                arry[j] = arry[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arry));
        return j;

    }
}
