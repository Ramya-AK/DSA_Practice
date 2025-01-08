package org.example.Recursion;

public class FibonocyClass {

    // fibonocy in recursion is the worst time complexity becz end node call repeteadly = >bestWay(n - 1) + bestWay(n - 2);
    //
    public static void main(String[] args) {
        find();
        System.out.println();
        System.out.println(bestWay(4) + " ");
    }

    static void find() {
        int initial = 0;
        int second = 1;
        System.out.print((initial) + " " + second);
        print(initial, second);

    }

    static void print(int first, int second) {
        int cal = first + second;
        if(cal >= 56) {
            return;
        }
        System.out.print(" "+ (cal) + " ");
        print(second, cal);
    }

    static int bestWay(int n) {
        System.out.print(n + " ");
        if(n < 2) {
            return n;
        }
        return bestWay(n - 1) + bestWay(n - 2);
    }
}
