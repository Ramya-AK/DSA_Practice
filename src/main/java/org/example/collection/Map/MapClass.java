package org.example.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapClass {


    // key value pair
    // key act as set => means no duplication, no order
    // value act as the list

    public void displayMap() {
        Map<String, Integer> map = new HashMap<>();

        map.put("ramya", 123);
        map.put("ram", 456);

        // we don't have add method here, we have put becuase it will replace if we add duplicate keys

        System.out.println(map.get("ram"));

        map.keySet();

        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }


    }
}
