package org.example.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "ramya";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println("  ramya  ".strip());
        System.out.println(Arrays.toString("ramya ak".split(" ")));
    }
}
