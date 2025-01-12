package org.example.Recursion;

public class Dice {

    public static void main(String[] args) {
        // how many ways we can get 4 value in dice
        // target is 4
        // 1111, 121,122,22,31,4,311 etc

//        target = 4;
//        1/3 2/2 3/1 4/0
//          11/2 etc....



        display("", 6);
    }
    static void  display(String result, int target) {

        if(target == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= 8 && i <= target ; i++) { // face of the dice is 6
//            result = result + i; // this is wrong because it will modifies the existing string which should not do in the recursive path
            display(result + i , target - i); // imp  this will create the new string every recursive call
        }
    }
}
