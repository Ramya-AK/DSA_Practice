package org.example.Strings;

public class StringTheory {

    public static void main(String[] args) {

        // imp
        // "a" =. String => double quote
        // 'a' =. Char => single quote

        System.out.println("a" + 1);
        System.out.println('a' + 1);

        // String + any data, it will convert to String only
        // Char + any int or number, it will convert to number only


        // Operator overloading for only + sign => imp
        //    - sign => won't work
    }

    // String is an Object and non-primitive, stored in heap
    // Stored in the Heap memory by reference
    // imp => Sting a = "ramya" , String b = "ramya"
    // in this case, it stored in the String pool in the heap so at b Sring won't create a Object,
    // instead of the it will reffer to the same data, but
    // but when you chnage the String a, means it won't effect the b, becuase new String
    // means new object creation, until it's not a same data
    // imp => Sting a = "ramya" , String b = "ramya"  if(a==b) => true
    // imp => to create a new object => STring name = new String("rashmi") => new object
    // imp => String are inmmutablity => you can not change the existing data, but it will create new one

}
