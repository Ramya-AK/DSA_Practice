package org.example.Sorting.CycleSort;

public class MissingElement {

    // Cycle wheel =>  while loop

    // whenver question comes with N number of element use this

//    Q => find the missing element where number is from the 0 to N => means (N + 1) number
//    [0,1] => number is 2 so it should be [0,1,2] => missing is 2

    public static void main(String[] arg) {
        System.out.println(sorting());
    }

    static int sorting() {
        int[] arry = {4,0,3,1,2,5};
        int i = 0;
       while (i < arry.length) {
           if(arry[i] != i && arry[i] < arry.length) { // imp arry[i] < arry.length => one missing element means one less than the actual length so last elment we can not access arry[tempo] array[5] is not there
              int tempo = arry[i];

              arry[i] = arry[tempo];
              arry[tempo] = tempo;
           } else {
               i++;
           }
       }


       // Search for the missing element
        for (int j = 0; j < arry.length; j++) {
            if(arry[j] != j) {
                return j;
            }
        }
        return arry.length;
    }

}
