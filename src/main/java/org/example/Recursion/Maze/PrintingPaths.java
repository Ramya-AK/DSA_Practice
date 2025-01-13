package org.example.Recursion.Maze;

public class PrintingPaths {
    public static void main(String[] args) {
        System.out.println(display("", 3, 3));
    }

    static String display(String result, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(result);
            return result;
        }

        if(row > 1) {
            display(result + 'D' , row - 1, col);
        }
        if(col > 1) {
            display(result + 'R', row, col-1);
        }

        return result;
//        if(row < 1 || col < 1) {
//            return "";
//        }
//        display(result + 'D' , row - 1, col);
//        display(result + 'R', row, col-1);
//
//        return result;

//        or
    }

}
