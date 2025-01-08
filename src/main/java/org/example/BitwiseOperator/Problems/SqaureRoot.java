package org.example.BitwiseOperator.Problems;

public class SqaureRoot {

    public static void main(String[] args) {
        find();
    }

    // think
    // Square root of the number is always less than the number
    // finding the range from 2 to that number => means it is binary search

    static void find() {
        int number = 40;
        int p = 3;

        int left = 2;
        int right = 36;
        int mid =  left + (right - left) / 2;
        double root = 0.0;

        while(left <= right) {

            if(mid * mid > number) {
                right = mid -1;
            } else if(mid * mid < number) {
                left = mid + 1;
                root = mid;
            } else {
                System.out.println(mid);
                return;
            }
             mid =  left + (right - left) / 2;
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= number) {
                root += incr;
            }
            root -= incr; //
            incr /= 10;  // 0.1 / 10 => 0.01
        }
        System.out.println(root + "root");

    }


}
