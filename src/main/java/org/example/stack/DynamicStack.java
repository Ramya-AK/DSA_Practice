package org.example.stack;

public class DynamicStack {

    // it can be anything but to generally we can go with low number
    int capacity = 2;
    int [] stack = new int[capacity];
    // this will represent the next element and size of the stored values
    int top = 0;


    public void push(int data){
        if(stack.length == top)
        {
            expandSize();
        }
        stack[top] = data;
        top ++;
    }

    // remove the element in the stack and replace the value with the 0
    public void pop() {
        if(top <= ((stack.length / 2) /2)) {
            shrink();
        }
        top--;
        System.out.println();
        System.out.println(stack[top] + " pop");
        stack[top] = 0;
    }

    public void show(){
        System.out.println();
        for(int element: stack) {
            System.out.print(element + " ");
        }
    }

    public void expandSize(){
        int length =  stack.length;
        int [] newArray =  new int[length * 2];


        for (int i = 0; i < stack.length ; i++) {
            newArray[i] = stack[i];
        }
        stack = newArray;
    }

    // peek means => last element display without removing and decrese the size
    public void peek() {
        System.out.println();
        System.out.println(stack[top -1] + " peek");
    }

    public void shrink() {
        int newLength = (stack.length / 2) / 2;
        //when length goes to the 3/4 (half => half)
        int [] smallArray = new int[newLength];


        for (int i = 0; i < newLength; i++) {
            smallArray[i] = stack[i];
        }
        stack = smallArray;
    }
}
