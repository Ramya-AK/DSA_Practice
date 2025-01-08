package org.example.PriorityQueue;


// Heap => cretiria is an adding a data and get the smallest number or any critiria, use Heap in this case
// Yes, we can still use Array, list, linked list but it takes O(NlogN)
// Heap will help to make it O(logn)
// Any question has condition to check on the collection of time => example top movie review in many data


//Heap has some condition to achive this
//1. Complete binary tree => means it should have all the two child node but leaf can be empty => every level should be full expect last level, left to right
//2. Every Node value is greater than or equal to all of tit's child node => if we want to maintain max value
//2. Every Node value is lesser than or equal to all of tit's child node => if we want to maintain min value
//3. Down heap => remove the element and get the sorted element
//4. Up heap => insert the element, in the sorted order

// Heap internally stored as array only but represent as the tree

// heap stored in array, by using the below formula we can fetch it as tree, so we don't need any pointer or next referrence
//formula for how heap store
// root => i
// parent => i /2
// left(i) => i * 2
// right(i) => i * 2 + 1

import java.util.ArrayList;
// when to use heap => when problems comes with condition like highest value or lowest value
//
public class HeapPriorityQueue {
//  When PriorityQueue task comes.
//  Think the array structure and heap tree structure
    ArrayList<Integer> list = new ArrayList<>();


    public void insert(Integer data) {
        // firstly we have to add the data
        list.add(data); // satisfies the first condition that => it should be complete binary tree
        //
        // compare the element with parent node
        upHeap(list.size() - 1); // imp same as array => index starts from 0 and array length is one


    }

    public void upHeap(int index) {
        if(index == 0) {
            return; // no swap => single element
        }
        // first add the element to the list then compare with the parent and once swap done move
        // to the parent's parent node so loop contiue until it's come out from the condition
        int parentIndex = parent(index);
        if(list.get(index).compareTo(list.get(parentIndex)) < 0) { // checking index of child is less than the index of parent
            swap(index, parentIndex);
            upHeap(parentIndex);
        }
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public void swap(int first, int second) {
        int temp =  list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public void displayLowestElement() {
        System.out.println(list.get(0));
    }

    // it will also return's the sorted element but we need to iterate downHeap

    public int removeLowestElement() {
        if(list.isEmpty()) {
            return 0;
        }
        int temp = list.get(0);
        int lastElement = list.remove(list.size() - 1);

       if(!list.isEmpty()) {
           list.set(0, lastElement);
           downHeap(0);
       }

        return temp;
    }


    public void downHeap(int index) {
        int left = left(index);
        int right = right(index);
        int min = index;

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
          swap(min, index);
          downHeap(min);
        }
    }

    public void sortedValue() {
        while(!list.isEmpty()) {
           int element = removeLowestElement();
            System.out.print(element + " ");
        }
    }

    public int left(int index) {
        return index * 2 + 1;
    }

    public int right(int index) {
        return index * 2 + 2;
    }
}
