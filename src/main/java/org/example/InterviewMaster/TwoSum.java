package org.example.InterviewMaster;

public class TwoSum {

    int[] unSorted = {1, 3, 2,7,4,9};
    int target = 8;

   public void twoSumSolution() {
       int pointer = 0;
       for (int i = 1; i < unSorted.length ; i++) {
           if(target == unSorted[i] + unSorted[pointer]) {

               return;
           }

       }
   }
}
