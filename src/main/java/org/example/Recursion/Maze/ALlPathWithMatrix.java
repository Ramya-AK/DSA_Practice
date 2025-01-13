package org.example.Recursion.Maze;

import java.util.Arrays;

public class ALlPathWithMatrix {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
//        System.out.println(maze.length);
//        display("", 3, 3, maze);

        int[][] newPathMaze = new int[maze.length][maze[0].length];
        displayAnotherWay("", 0, 0, maze, newPathMaze, 1);
    }


    // premetive values like int, char, boolean values are unique for each recursive call but  but for object and arrays and non-premitive values
    // are the pointing to the same refernce value, so once we modified the array so we need backtracking
    static void displayAnotherWay(String result, int row, int col, boolean[][] maze, int[][] newPathMaze, int step) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(result);
            newPathMaze[row][col] = step;
           for (int[] el: newPathMaze) {
               System.out.println(Arrays.toString(el));
           }

            System.out.println();
           return;
        }

        if(!maze[row][col]) {
            return;
        }

        if(row < maze.length -1) {
            maze[row][col] = false;
            newPathMaze[row][col] = step;
            displayAnotherWay(result + 'D', row + 1, col, maze ,newPathMaze, step + 1);
        }
        if(col < maze.length -1) {
            maze[row][col] = false;
            newPathMaze[row][col] = step;
            displayAnotherWay(result + 'R', row, col + 1, maze, newPathMaze, step + 1);
        }
        if(row > 0) {
            maze[row][col] = false;
            newPathMaze[row][col] = step;
            displayAnotherWay(result + 'U', row - 1, col, maze, newPathMaze, step + 1);
        }
        if(col > 0) {
            maze[row][col] = false;
            newPathMaze[row][col] = step;
            displayAnotherWay(result + 'L', row, col -1, maze, newPathMaze, step + 1);
        }

        maze[row][col] = true;  // backtracking => once  each function call completed, before removing from the stack make the array as previous value
        newPathMaze[row][col] = 0;  // backtracking
    }


}
