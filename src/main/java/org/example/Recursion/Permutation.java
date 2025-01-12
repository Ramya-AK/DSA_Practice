package org.example.Recursion;


public class Permutation {
        public static void permute(String str) {
            if (str == null || str.isEmpty()) {
                System.out.println("Please provide a valid string");
                return;
            }
            System.out.println("r".length() + "length");
            System.out.println("ramya".substring(0,1));
            permuteHelper("", str);

            System.out.println("wer".charAt(0) + "here");

            String newRemaining = "bc".substring(0, 1) +
                    "bc".substring(1 + 1);

            System.out.println(newRemaining);
        }

        private static void permuteHelper(String prefix, String remaining) {
            // Base case: when no characters are left to permute
            if (remaining.isEmpty()) {
                System.out.println(prefix);
                return;
            }

            // Try each character as the next character in the permutation
            for (int i = 1; i <= remaining.length(); i++) {
                // Choose current character
                char current = remaining.charAt(i-1);

                // Create new prefix by adding current character
                String newPrefix = prefix + current;

                // Create remaining string by removing current character
                String newRemaining = remaining.substring(0, i - 1) +
                        remaining.substring(i);  //imp

                // Recursive call with new prefix and remaining string
                permuteHelper(newPrefix, newRemaining);
            }
        }

        public static void main(String[] args) {
            String str = "abc";
            System.out.println("Permutations of " + str + ":");
            permute(str);
        }
    }