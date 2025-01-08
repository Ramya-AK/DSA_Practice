package org.example.BinarySearch;

public class StartingEndingPoint {

//    find the target starting and ending point
    // use binary serach twice to find out the start and end index

    int [] arry = {5,7,7,7,7,7,8,8,10};
    int target = 7;

    public int[] find() {
        int left = 0;
        int right = arry.length -1;

        int [] output = {-1, -1};

        int firstOccurance = findFirstOccureance(left, right, true);
        int secondOccurance = findFirstOccureance(left, right, false);
         output[0] = firstOccurance;
         output[1] = secondOccurance;
         return output;
    }

    public int findFirstOccureance(int left, int right, boolean isFirstOccranceCheck) {
        int mid = left + (right -left) / 2;
        int output = -1;
        while(left <=  right) {

            if (arry[mid] < target) {
                left = mid + 1;
            } else if (arry[mid] > target) {
                right = mid - 1;
            } else {
               if(isFirstOccranceCheck) {
                   right = mid - 1; // checking the first occurance, shift the end pointer to the mid - 1; do the loop again
               } else {
                   left = mid + 1; // checking the last occurance, shift the end pointer to the mid + 1; do the loop again
               }
                output = mid;
            }
            mid = left + ((right - left) / 2);
        }
        return output;
    }
}
