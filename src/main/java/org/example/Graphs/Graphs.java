package org.example.Graphs;

import java.util.ArrayList;

public class Graphs {

    // two types of graphs => 1. undirected graphs and 2. directed graphs

    // key words are => edge, node, bydirectional graphs
    // Graphs need not be a cycle
    // Cycle graphs means, start from same node and end at the same node
    // DAG => Directed Acyclic graphs
    // Path => contain a lot of nodes and each of them are reachable, should not repeat the node
    // Degree of the graph => how many edges have for single node
    // InDegree => edges to the inward direction to the node
    // OutDegree => edges to the Outward direction to the node



    public void simpleGraph() {
        int n = 6, m = 6;
        int[][] multiDimensionalArray = new int[n + 1][m + 1]; // usually we ignore the 0 zero index

        multiDimensionalArray[1][2] = 1;
        multiDimensionalArray[2][1] = 1;
        multiDimensionalArray[2][3] = 1;
        multiDimensionalArray[3][2] = 1;
        multiDimensionalArray[1][3] = 1;
        multiDimensionalArray[3][1] = 1;
        multiDimensionalArray[6][5] = 1;
        multiDimensionalArray[5][6] = 1;

        for (int i = 1; i < multiDimensionalArray.length; i++) {
            for (int j = 1; j < multiDimensionalArray.length; j++) {
                System.out.print(multiDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }


    // space complexity is high => [n + 1][m + 1] => O(N * N)

    }

    public void arrayListGraph() {
        // also called edge array list
        // Mainly we will create an arrayList inside the arrayList
        int n = 3, m = 3;
        // O(2n) => n is the number of element and 1 stores 2 and 2 stores 1. so twice of the elements
        // adjacency storage
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // n + 1 => imp
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        //unDirected graph so both node has the same value
        adj.get(1).add(2);
        adj.get(2).add(1); // comment this if it is a directed graph becz it will go from 1 to 2 not 2 to 1 so commented this line

        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(1).add(3);
        adj.get(3).add(1);


        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
