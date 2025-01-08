package org.example.Recursion;

import java.util.ArrayList;

public class FindTargets {
    public static void main(String[] args) {
//        find the index of the targets without creating outside arraylist
        int [] arry = {1,4,6,1,9,1};
        int target = 1;
        System.out.println(find(arry, 0, 1));
    }

    static ArrayList<Integer> find(int [] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>(); // new array list will be created every time so we collected that in the below and used AddALl

        if(index == arr.length) return list;

        if(arr[index] == target) {
            list.add(index);
        }

        list.addAll(find(arr, index + 1, target));
        return list ;
    }

}
