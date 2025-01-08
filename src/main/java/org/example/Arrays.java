package org.example;

public class Arrays {

//    Two ways to create an Arrays
//    1. int[] arry = new int[];
//    2. int[] arry = {1,2,3};

//    three ways to display an array
//    1. Using the for loop
//    2. for(int n: array)
//    3. Arrays.toStrings(arry)

//    new int[5] => creating the object in the heap memory
//    Integer array by default has a 0
//    String array by default has a null

//    Important
//    Mutable behaviour =>
//    Arrays in Java are mutable (can be changed) because:
//
//    Memory and Reference Behavior:
//
//
//    When you create an array, Java allocates a fixed block of memory
//    The variable holds a reference (address) to this memory location
//    You can change values at that memory location while keeping the same reference

//    While array contents are mutable, array size is immutable (fixed). Once created, you cannot change the length of an array.
 // when we don't know about the size use Array list

    int[] arry = new int[10];
    int[] arry2 = {1,2,3};
}
