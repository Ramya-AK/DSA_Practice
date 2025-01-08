package org.example.BinarySearch;
// return the index of the greatest number <= target
public class floor {
    // Ceiling => find the greatest element in array greater or equal to the  target


    // whenever problems comes with greatest element in array greater or equal to the  target
//    IMP// use while loop break condition means return the left point => becz left will be grater thanright and target greatest element lies their
    int[] arry = {1, 4, 6, 8, 9, 10, 13, 15, 17, 19, 21, 23, 25};
    int target = 22;

    public int find() {
        int left = 0;
        int right = arry.length - 1;
        int mid = (left) + (right - left) / 2;

        while (left <= right) { // imp
            if (arry[mid] == target) {
                return arry[mid];
            }
            if (arry[mid] > target) {
                System.out.println(arry[mid] + "arry[mid]");
                right = mid - 1;
            }
            if (arry[mid] < target) {
                left = mid + 1;
            }
            mid = (left ) +( right - left) / 2;
        }
        return arry[right]; // imp
    }
}
