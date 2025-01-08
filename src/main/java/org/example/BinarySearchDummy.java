package org.example;

public class BinarySearchDummy {
    //Binary search = > divide to two
    // Array should be sorted



    public int search(int [] arrayVal, int target) {

        int left = 0;
        int right = arrayVal.length -1 ;
        int foundVal = 0;


        while (right <= left) {
            int mid = left + right / 2 ;
            if(arrayVal[mid] == target) {
                return mid;
            }
            else if(arrayVal[mid] > target) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return foundVal;
    }
}
