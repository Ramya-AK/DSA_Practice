package org.example.Strings.Problem;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(find());
    }
    static boolean find() {
        String name = "abcecba";

        //

        String charc = Arrays.toString(name.toCharArray());
        System.out.println(charc);
        for (int i = 0; i < name.length() / 2 ; i++) {
            System.out.println(name.charAt(i));
            if(name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
