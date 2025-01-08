package org.example.Strings;

public class StringBuildersClass {

//    String builder class is a inbuilt class which will help us to add the String
//    but it won't create a new object everytime like String

//    So it is a mutable


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            builder.append(ch + " ");
        }
        System.out.println(builder + " ");
    }
}
