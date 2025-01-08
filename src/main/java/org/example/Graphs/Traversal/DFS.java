package org.example.Graphs.Traversal;

import java.util.ArrayList;

public class DFS {

    // Depth First search
    // goes to the in depth from top to bottom then left to right
    int node = 5;
    ArrayList<ArrayList<Integer>> adj =  new ArrayList<ArrayList<Integer>>();

    public void neighboursCreation() {

        for (int i = 0; i <= node; i++) {
            adj.add(i,new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);

        adj.get(2).add(5);
        adj.get(3).add(5);

    }
    ArrayList<Integer> dfs = new ArrayList<Integer>();
    boolean [] visitedList = new boolean[node + 1];

    public void dfsFunction(int startPoint) {

        visitedList[startPoint] = true;
        dfs.add(startPoint);

       for (int neighbours:  adj.get(startPoint)) {
           if(!visitedList[neighbours]){
               dfsFunction(neighbours);
           }
       }
    }

    public void display() {
        System.out.println(dfs + "dfs");
    }
}
