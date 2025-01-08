package org.example.Recursion;

public class Problem {
    public static void main(String[] args) {
        System.out.println(find(14, 0));

//        Given number, retuen the number of setos to reduce it to zero
//        if it is even divide by 2 and if it is odd minus by 1
    }

    static int find(int num, int count) {
        if(num == 0) {
            return count;
        }
        if(num % 2 == 0) {
            num = num / 2;
           return find(num, count+1);
        } else {
            num = num - 1;
           return find(num, count+ 1);
        }

    }
}
