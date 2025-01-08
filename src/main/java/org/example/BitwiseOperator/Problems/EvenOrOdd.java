package org.example.BitwiseOperator.Problems;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 57;
        find(num);
    }

    static void find(int num) {
        // every number internally works with binary
        // so think it is binary now
        // odd or even , determinse by last digit so do AND operator with 1
        // AND operator return 1 only when oth are 1

        if((num & 1) == 1) {
            System.out.println("odd " + num);
        }
        System.out.println("even " + num);

    }
}
