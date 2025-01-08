package org.example.collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListsClass {


    //Need not to specifies the size of the array as the normal array creation in java
    //It is given by java.utils package
    //Collection is an interface



    //Collection => List  => ArrayList
    //                    => LinkedList
    //           => Queue => DeQueue
    //           => Set   => HashSet
    //                    => Linked HashSet

//    imp => Collection has some 2 functions(example) => List interface extends the collection means it will has that 2 funtions and other functions


//    Collection (Interface)
//    ↓
//    List (Interface)
//    ↓
//    ArrayList (Class

//    The main differences are:
//
//    Collection<Integer> num = new ArrayList<Integer>();
//
//    Collection is the top-level interface in the collection hierarchy
//            It provides the most basic operations like add(), remove(), size()
//    Using Collection reference gives you access to only Collection interface methods
//More restrictive - can't use List-specific methods like get(index) or set(index, element)
//
//
//    List<Integer> list = new ArrayList<Integer>();
//
//    List is more specific as it extends Collection interface
//    Provides additional functionality like indexed access and ordering
//                    You can use all List methods like get(), set(), indexOf()
//    More commonly used as it gives access to position-based operations

  public void  arrayListFunction() {
      // Use when we need to add and display the values
      // But when we want index based fetching => Go with the List
        Collection<Integer> num = new ArrayList<Integer>();
        num.add(8);
        num.add(3);
        num.add(5);
        num.add(8);

        for (int n: num) {
            System.out.print(n + " ");
        }

      System.out.println(" ");
  }

  public void listFunction() {
      List<Integer> list = new ArrayList<Integer>();
      list.add(9);
      list.add(10);
      list.add(23);

      System.out.print(list.indexOf(10) + " index");
      System.out.println();
      System.out.print(list.get(2) + " value");

  }
}
