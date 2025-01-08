package org.example.LinearSearch;

public class TwoDymentional {

    int[][] arry = {
            {1,5},
            {7,3},
            {3,15}
    };
    public void findMax() {
        int max = 0;
        for (int i = 0; i <arry.length ; i++) {
            int el = 0;
            for (int j = 0; j < arry[i].length; j++) {
                el = arry[i][j] + el;
            }
            if (el > max) {
                max = el;
            }

        }
        System.out.println(max + "max");
    }
}
