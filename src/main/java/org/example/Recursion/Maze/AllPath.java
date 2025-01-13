package org.example.Recursion.Maze;

public class AllPath {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
//        System.out.println(maze.length);
//        display("", 3, 3, maze);
        displayAnotherWay("", 0, 0, maze);
    }


    // premetive values like int, char, boolean values are unique for each recursive call but  but for object and arrays and non-premitive values
    // are the pointing to the same refernce value, so once we modified the array so we need backtracking
    static void displayAnotherWay(String result, int row, int col, boolean[][] maze) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(result);
        }

        if(!maze[row][col]) {
            return;
        }

        if(row < maze.length -1) {
            maze[row][col] = false;
            displayAnotherWay(result + 'D', row + 1, col, maze);
        }
        if(col < maze.length -1) {
            maze[row][col] = false;
            displayAnotherWay(result + 'R', row, col + 1, maze);
        }
        if(row > 0) {
            maze[row][col] = false;
            displayAnotherWay(result + 'U', row - 1, col, maze);
        }
        if(col > 0) {
            maze[row][col] = false;
            displayAnotherWay(result + 'L', row, col -1, maze);
        }

        maze[row][col] = true;  // backtracking => once  each function call completed, before removing from the stack make the array as previous value
    }


}
