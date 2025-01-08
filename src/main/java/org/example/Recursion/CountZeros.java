package org.example.Recursion;

public class CountZeros {

    public static void main(String[] args) {
        System.out.println( find(2401200, 0));
    }

    static int find(int num, int count) {
        if(num <=0) {
//            System.out.println(count + " ");
            return count;
        }
        if(num % 10 == 0) {
            count = count + 1;
        }
        num = num / 10;
        return find(num, count);
    }
}
