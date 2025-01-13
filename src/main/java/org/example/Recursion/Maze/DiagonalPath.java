package org.example.Recursion.Maze;

public class DiagonalPath {

    public static void main(String[] args) {
        display("", 3, 3);
    }

    static void   display(String result, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(result);
        }

        if(row > 1 ){
            display(result + 'D', row -1, col);
        }

        if(col > 1 ){
            display(result + 'R', row, col-1);
        }

        if(col > 1 && row >1) {
            display(result + 'd', row-1, col -1);
        }

    }
}
