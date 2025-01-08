package org.example.BinarySearch;
//public class InfinityArray {
//    public static void main(String[] args) {
////    find out the target in the sorted infinity array
//
////    First we expand until we find a range that contains our target
////    Then we do a normal binary search within that range
//        int[] arry = {3, 5, 7, 9, 10, 90,
//                100, 130, 140, 160, 170};
//        int target = 100;
////        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};
////        int target = 1;
//        findRange(arry, target);
//
//    }
//
//
//    static int findRange (int[] arry, int target) {
//            int first = 0;
//            double tempoLast = 1;
//
//                while (target > 0) {
////                    System.out.println(tempoLast + "target > arry[tempoLast]");
////                    double temp = tempoLast + 1;
//                    tempoLast = tempoLast +( ((tempoLast - first) + 1) * 2);
//                    System.out.println(tempoLast + "tempoLast");
////                    System.out.println(tempoLast + "end");
////                    System.out.println(first + "start");
////                    first = temp;
//                    target = target - 10;
//                }
//
//            System.out.println(first + "firs" + tempoLast);
//                return 0;
////            return find(arry, first, tempoLast, target);
//        }
//
//
//        static int find (int[] arry, int first, int last, int target){
//            int left = first;
//            int right = last;
//
//            while (left <= right && arry[right] > arry[0]) {
//                int mid = left + (right - left) / 2;
//                if (arry[mid] < target) {
//                    left = mid + 1;
//                } else if (arry[mid] > target) {
//                    right = mid - 1;
//                } else {
//                    return arry[mid];
//                }
//            }
//            return -1;
//        }
//    }
public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}