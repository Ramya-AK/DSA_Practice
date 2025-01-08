package org.example;

public class TwoPointers {



    public int duplicateValueRemove(int [] sortedArray) {

        // first element don't touch
        // starts from the second element
        // compare backward => overflow will not be there

        int slow = 1;
        for (int fast = 1 ; fast < sortedArray.length; fast ++) {

           if( sortedArray[fast] != sortedArray[fast - 1] ) {
               sortedArray[slow] = sortedArray[fast];
               slow ++ ;
            }

        }

        return slow;
    }


    public int maxSumOfSubArray() {
        int [] unSortedArray = {12,1,4,8,19,0,17,14,2,18,90};
        int k =3;
        int maxSum = 0;

        int currentSum = 0;


        //creation max value of first window

        for (int i = 0; i < k; i++) {
            currentSum = currentSum + unSortedArray[i];
        }

        maxSum = currentSum;

        for(int j = k; j <= unSortedArray.length - 1; j ++) {
            currentSum = currentSum + unSortedArray[j] - unSortedArray[j - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
