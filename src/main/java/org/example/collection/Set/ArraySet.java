package org.example.collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArraySet {


    // Set => HashSet class
    //     => TreeSet
    public void displayHashSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(12);
        set.add(2);
        set.add(59);
        set.add(12);

//      no order maintain
//      duplication value not be there
//      set does not support index value
        for (int n: set) {
            System.out.print(n + " ");
        }
    }

    public void displayTreeSet() {
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(2);
        set.add(59);
        set.add(12);


//      Order maintain
//      duplication value not be there
//      set does not support index value
        for (int n: set) {
            System.out.print(n + " ");
        }
    }
}
