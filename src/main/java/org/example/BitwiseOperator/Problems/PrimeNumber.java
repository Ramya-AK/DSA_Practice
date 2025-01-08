package org.example.BitwiseOperator.Problems;

public class PrimeNumber {

    // prime number => number can divide by same number or
    // 1 is not a prime number
    // 2,3,5,7,11,13 ..prime number

    public static void main(String[] args) {
        find();
    }

     static void find(){

        int num = 24;
        if(num <= 1) {
            System.out.println("not prime");
        }

        // try to divide the numbers less than the given number
         for (int i = 2; i  <= (num/2); i++) { // imp => to reduce the same repeatation to check the prime number or not iteration
             System.out.println(i + "i * i");
             if(num % i == 0) {
                 System.out.println("not a prime");
                 return;
             }
         }
         System.out.println("prime");
    }
}
