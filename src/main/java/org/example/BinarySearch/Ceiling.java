package org.example.BinarySearch;

// return the index of the smallest number >= target
public class Ceiling {
    // Ceiling => find the smallest element in array greater or equal to the  target


    // whenever problems comes with smallest element in array greater or equal to the  target
//    IMP// use while loop break condition means return the left point => becz left will be grater thanright and target grater element lies their
    int[] arry = {1, 4, 6, 8, 9, 10, 13, 15, 17, 19, 21, 23, 25};
    int target = 22;

    public int find() {
        int left = 0;
        int right = arry.length - 1;
        int mid = (left) + (right - left) / 2;
        int min = 0;

        while (left <= right) { // imp when both pointer pointing to the same index => means it is a greatest element
            if (arry[mid] == target) {
                min = arry[mid];
                return min;
            }
            if (arry[mid] > target) {
                System.out.println(arry[mid] + "arry[mid]");
                min = arry[mid];
                right = mid - 1;
            }
            if (arry[mid] < target) {
                left = mid + 1;
            }
            mid = (left ) + (( right - left) / 2); // whenever the big number taken as the left and right, integer range will exceed so
        }
        return arry[left]; // imp left is in the greatest element and right is the below gratest index exmaple => left is in the 8 index, right 8-1 => 7 index
    }

}
