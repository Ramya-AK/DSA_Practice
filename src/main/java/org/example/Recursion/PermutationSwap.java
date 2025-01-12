package org.example.Recursion;
public class PermutationSwap {
    public static void permute(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Please provide a valid string");
            return;
        }
        char[] chars = str.toCharArray();
        permuteHelper(chars, 0);
    }

    private static void permuteHelper(char[] chars, int currentPosition) {
        // Base case: when we've reached the end of the array
        if (currentPosition == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        // Try each character as the next character in the permutation
        for (int i = currentPosition; i < chars.length; i++) {
            // Swap characters
            swap(chars, currentPosition, i);

            // Recursive call for next position
            permuteHelper(chars, currentPosition + 1);

            // Backtrack - restore the array to original state
            swap(chars, currentPosition, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of " + str + ":");
        permute(str);
    }
}