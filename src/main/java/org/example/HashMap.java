package org.example;

public class HashMap {

    // it wil help to search the data in o(1)
    //  So it is helpfull to search becz binary search tree or other will take o(logN)


    // hpw it works
    // when we store the any data, example 'rmy' it will do internally it generates the hashCode and then it will store the index of that number
    // and that hashcode will be long number but we can reduce it to small number by doing the %10 so it will reduced to small number
    // what if both hascode after reduce, will made into small number => this problem is called as collision
    // how to solve the collision =>  2 ways
    // 1. chaining => every element in the hashMap is linked list so if we get the same hashcode, add those number to the same linked list
    // 2. open addressing => it will check the next address if it is empty stored in that address, and while searching it will go to the first address and then move to next address

    // when to use which ?
    // 2. open addrssing => better cache performance
    // 1. chaining => less sensitive to hash functions
}
