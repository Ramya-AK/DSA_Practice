package org.example.Recursion.Maze;

public class MazeAbstracales {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        System.out.println(maze.length);
//        display("", 3, 3, maze);
        displayAnotherWay("", 0, 0, maze);
    }

    static void display(String result, int row, int col, boolean[][] maze) {

        if (row == 1 && col == 1) {
            System.out.println(result);
        }
        if (!maze[row - 1][col - 1]) { // becuase array martix starts from 0 index so
            return;
        }

        if (row > 1) {
            display(result + 'D', row - 1, col, maze);
        }

        if (col > 1) {
            display(result + 'R', row, col - 1, maze);
        }
    }

    static void displayAnotherWay(String result, int row, int col, boolean[][] maze) {
        if(row == maze.length - 1 && col== maze[0].length - 1) {
            System.out.println(result);
        }

        if(!maze[row][col]) {
            return;  // to stop the recursive for particular recurive call
        }

        if(row < maze.length - 1) {
            displayAnotherWay(result + 'D', row + 1, col, maze);
        }

        if(col < maze[0].length - 1) {
            displayAnotherWay(result + 'R', row, col + 1, maze);
        }


    }
}