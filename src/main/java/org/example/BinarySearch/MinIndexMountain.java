package org.example.BinarySearch;

public class MinIndexMountain {

//    find the minimun index of the target

    public static void main(String[] args) {
        System.out.println(  find());
    }

    static  int find() {
        int [] arry = {1,3,4,5,3,2,1};
        int target = 2;

        // out should 2 index

        int left = 0;
        int right = arry.length -1;

        int mid = left + (right - left) /2;

        while(left <= right) {
            if(arry[mid] < target) {
                left = mid + 1;
            } else if(arry[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
            mid = left + (right - left) /2;
        }
        return -1;

    }
}
