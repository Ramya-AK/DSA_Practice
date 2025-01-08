package org.example.BinarySearch;

public class RotationArray {
// find the index of the target in the rotation element

    public static void main(String[] args) {
        System.out.println(find() + "find();");
    }

    static int find() {
        int[] arry = {5,6,7,8, 9,10,11,12,13,1,2,3,4};

        int target = 6;

        int highestValue = findPivot();

        if(arry[highestValue] == target) {
            System.out.println(highestValue + "index");
        }

        int findValue = -1;

        findValue = findTarget(0, (highestValue -1), target);

        if(findValue == -1)
            findValue = findTarget(highestValue + 1, arry.length - 1, target);
        System.out.println(findValue + "index");
        // find the pivot => higest element where the rotation occurs

        return findPivot();


    }
    static int findPivot() {
        int[] arry = {5,6,7,8, 9,10,11,12,13,1,2,3,4};
        int left = 0;
        int right = arry.length -1;
//        int[] arry = {5,6,7,8, 9,10,11,12,13,1,2,3,4};
        while(left <= right) {
            int mid = left + (right - left) /2;
            if(arry[mid] > arry[mid + 1]) {
                return mid;
            } else if(arry[mid] < arry[mid + 1] && arry[mid] > arry[arry.length -1]) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return  -1;
    }

    static int findTarget(int start, int end, int target) {

        System.out.println(start + "start" +  end + "end" + target);
        int[] arry = {5,6,7,8, 9,10,11,12,13,1,2,3,4};
        int left = start;
        int right = end;
//        int[] arry = {5,6,7,8, 9,10,11,12,13,1,2,3,4};
        while(left <= right) {
            int mid = left + (right - left) /2;

            if(arry[mid] < target) {
                left = mid + 1;
            } else if(arry[mid] > target) {
                right = mid -1;
            } else {
                return mid;
            }

        }
        return  -1;
    }



}
