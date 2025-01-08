package org.example.LinearSearch;


import java.util.Arrays;

public class EvenNumberOfDigits {

    int[] array = {12,345,2,6,7896};
    public void find () {
        int[] digits = new int[5];
        for (int i = 0; i < array.length; i++) {
            int ele = array[i];
            while(ele > 0) {
                digits[i] = digits[i] + 1;
                ele = ele / 10;
            }
        }
        for (int el: digits) {
            if(el % 2 == 0) {
                System.out.println("even" + el);
            }
        }

        System.out.println(Arrays.toString(digits));
    }

}
