package org.example.BinarySearch;

public class Mountain {


//    output should be 7 in this case

    public static void main(String[] args) {
        System.out.println(find());
    }

    static int find() {
        int [] arry = {1,2,3,5,7,6,3,2};

        int left = 0;
        int right = arry.length - 1;
        int mid = left + (right -left) /2;
        int peak = 0;

        // peak means greatest element in the mountain array

        while(left < right) {  // when two pointer meets that is the gratest element so when it is equal return the value

           if(arry[mid] > arry[mid + 1]) {
               right = mid;
           } else {
               left = mid + 1;
           }
            mid = left + (right -left) /2;
            System.out.println( arry[mid] + " arry[mid]");
        }
        return right;  // any pointer can display here since it is pointing to the same position
    }
}
