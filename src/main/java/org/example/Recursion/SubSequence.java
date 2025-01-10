package org.example.Recursion;

public class SubSequence {

//    Sub sequence is for String
//    Sub set for arrays

//    take a single character and take it and ignore it
//    abc , ab , ac , a, bc , b, c
    public static void main(String[] args) {
        subSeq("" , "abc");
        System.out.println("ramy".substring(1, 4));  // remove the 1st place and display till 4th place
    }

    static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1)); // take it
        subSeq(p, up.substring(1));  // ignore it
    }
}
