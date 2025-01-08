package org.example.Graphs.Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {

    // Breadth first search


    // 1. Visited Array is common in all the Graphs question
    // 2. Graphs should store in the Adjacency order so we will get the neighbours
    // 3. ignore the 0 index

    // Steps
    // First step => create an adjacency list to get their neighbours
    //


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

    public void breadthFirstSearch(int startNode) {
        System.out.print("BFS");
        Queue<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[node + 1]; // should use this becz it will create the array with false values as defulat
//        ArrayList<Integer> visitedList = new ArrayList<>(node + 1); // this will be the size ??

        queue.add(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()) {
            int val = queue.poll();
            System.out.print(val + " ");
            bfs.add(val);
            for(int n: adj.get(val)) {
               if (!visited[n]) {
                   queue.add(n);
                   visited[n] = true;
               }
            }
        }

        System.out.println(bfs + "bfs");
    }


}
