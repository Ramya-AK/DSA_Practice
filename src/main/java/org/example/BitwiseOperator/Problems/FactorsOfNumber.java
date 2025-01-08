package org.example.BitwiseOperator.Problems;

import java.util.ArrayList;

public class FactorsOfNumber {

    public static void main(String[] args) {
        findFactors1();
        findFactors2();
        System.out.println();
        findFactors3();

    //        what are all the number can divides the number
    //        num = 20
    //        answer would be 1,2,4,5,10,20
    }

    //        i == Math.sqrt(num) sam as the i*i == num
        public static void findFactors1() {
            int num = 20;
            for (int i = 1; i * i <= num ; i++) {
                if( num % i == 0) {
//                    System.out.println(i + " " + num/i);
                }
            }
            // if it is 36, then 6 will repeat twice so go with 2nd method
        }

//                        20 / 1 => 20
//                        20 / 2 => 10
//                        20 / 4 => 5
//                        20 / 5 => 4
//                        20 / 10 => 2
//                        20 / 20 => 1
//    patters are repeated so add sqaure root iteration and i + " " + num/i


    public static void findFactors2() {
        int num = 36;
        for (int i = 1; i * i <= num ; i++) {

            if( num % i == 0) {
                if(i == num/i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " " + num/i);
                }
            }
        }
        // it is not displays in the sorted order so follow 3rd
    }

    public static void findFactors3() {
        int num = 36;
        ArrayList<Integer> arry = new ArrayList<>();
        for (int i = 1; i * i <= num ; i++) {

            if( num % i == 0) {
                if(i == num/i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " ");
                    arry.add(num/i); // this will sortes half answers in the desending order like , 20,10,5
                }
            }
        }

        for (int i = arry.size() - 1; i >= 0 ; i--) { // iterate the value in the reverse order
            System.out.println(arry.get(i) + " ");
        }
    }



}
