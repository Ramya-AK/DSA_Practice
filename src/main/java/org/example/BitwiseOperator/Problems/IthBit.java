package org.example.BitwiseOperator.Problems;

public class IthBit {
// find the ith bit of the number
    public static void main(String[] args) {
        int number = 0b10110110;  // binary number 10110110

        findIthBit(number, 4);
    }

    static int findIthBit(int number, int i) {
        // Create mask by left shifting 1 by i positions
        int mask = 1 << i;

        // AND the number with mask and right shift result by i
        return (number & mask) >> i;

        // Alternative way: just check if result is non-zero
        // return (number & mask) != 0 ? 1 : 0;
    }
}
