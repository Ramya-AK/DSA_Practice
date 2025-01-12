package org.example.Recursion;

import java.util.ArrayList;

public class PhoneDigitPermutation {
        public static void main(String[] args) {
            // Test all three methods
            System.out.println( pad("", "12"));  // void method that prints combinations
//            System.out.println(padRet("", "23")); // returns ArrayList of combinations
//            System.out.println(padCount("", "23")); // returns count of combinations
        }

        // Method 1: Void method that prints combinations
        static ArrayList<String> pad(String p, String up) {
            ArrayList<String> list =  new ArrayList<>();

            if (up.isEmpty()) {
                System.out.println(p);
                list.add(p);
                return list;
            }
            int digit = Character.getNumericValue(up.charAt(0));  // convert character digit to integer digit
//            int digit = up.charAt(0) - '0';  // convert character to integer

            // Calculate range for current digit
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
//                System.out.println(i + "i");
                char ch = (char) ('a' + i);
                list.addAll(pad(p + ch, up.substring(1)));
            }
            return list;
        }

}
