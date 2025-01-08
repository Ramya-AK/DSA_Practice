package org.example.Recursion;

public class SortedArray {
    public static void main(String[] args) {
//        find the array sorted or not
        int [] arry = {1,4,6,8,9, 1};
        System.out.println(find(arry, 1));
    }
    static boolean find(int [] arr, int index) {
        if(index == arr.length) return true;
        return arr[index] >= arr[index -1] && find(arr, index + 1);
    }
}
