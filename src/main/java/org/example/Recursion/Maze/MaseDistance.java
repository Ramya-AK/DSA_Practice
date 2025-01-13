package org.example.Recursion.Maze;

public class MaseDistance {

    public static void main(String[] args) {

        // in the 3*3 matrix, we are in the top left corner, how many ways to reach the bottom right corner
        System.out.println(findDistance(3,3));;
    }
    static int findDistance(int row, int col) {
        if(row == 1 && col == 1) {
            return 1;
        }

        if(row < 1 || col < 1) {  // Add this check for invalid paths
            return 0;
        }

        int leftCount = findDistance(row - 1, col);
        int rightCount = findDistance(row, col - 1);

        return leftCount + rightCount;
    }
}
