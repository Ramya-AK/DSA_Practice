package org.example.BitwiseOperator.Problems;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        int n = 50;
        find(n);
    }

//    given number is 50, display the prime number like 2,3,5,7,11.13.17,21... etc


    public static void find(int num) {
        boolean[] primes = new boolean[num + 1]; // it starts from 0 so we required one more, we will get 0 to 50

        for (int i = 2; (i*i) <= num; i++) {
            if(!primes[i])
            {
                for (int j = i * 2; j <= num; j=j+i) {
                    // i * 2 => makes initial value double 3*2= 6
                    // j + i => makes multiples =>  6+3 => 9 ....
                    System.out.println(j);
                    primes[j] = true;
                }

//                explanation

//                2 , 3, 4 , 5 , 6 , 7 , 8 , 9 , 10 ,
//                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
//                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
//                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
//                41, 42, 43, 44, 45, 46, 47, 48, 49, 50




//                2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
            }
        }

        for (int i = 2; i <= num; i++) {
//            if(!primes[i])
//                System.out.print(i + " ");
//            System.out.println(i + " ");
        }

    }
}
