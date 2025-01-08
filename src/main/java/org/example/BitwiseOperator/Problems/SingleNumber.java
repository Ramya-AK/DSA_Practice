package org.example.BitwiseOperator.Problems;

public class SingleNumber {
// find the single element in the array without duplication
    public static void main(String[] args) {
        int[] num = {1,4,3,5,6,6,3,1,4};
        find(num);
    }

    static void find(int[] num) {
        int unique = 0;

//        The key insight:

//        We don't need to store pairs separately
//        When we XOR the same number twice, they cancel out automatically
//        Like this: (5 ^ 2 ^ 5) is same as (2)
//        Because 5 ^ 5 = 0, and 0 ^ 2 = 2

        // If we have numbers: 5, 2, 5
        // (5 ^ 2 ^ 5) = (5 ^ 5) ^ 2 = 0 ^ 2 = 2

        for (int n: num) {
           unique = unique ^ n;
//            System.out.println(n + " n " + unique);
        }
        System.out.println(unique);
    }
}
