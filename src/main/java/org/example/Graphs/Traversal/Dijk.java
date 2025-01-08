package org.example.Graphs.Traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijk {

    public class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    int nodes =  5;
    ArrayList<ArrayList<Node>> adj =  new ArrayList<ArrayList<Node>>();

    public void generateNeighbours() {

        for (int i = 0; i <= 5; i++) {
            adj.add(new ArrayList<Node>());
        }
        System.out.println(adj.get(0) + "adj");
        System.out.println(adj.get(1) + "adj");
//        System.out.println(adj.get(5) + "adj");

        adj.get(1).add(new Node(2,2));
        adj.get(1).add(new Node(3,6));
        adj.get(2).add(new Node(3,1));
        adj.get(2).add(new Node(4,1));
        adj.get(2).add(new Node(5,5));
        adj.get(3).add(new Node(5,7));
        adj.get(4).add(new Node(5,1));

//        adj.get(2).add(new Node(1,2));
//        adj.get(3).add(new Node(1,6));
//        adj.get(3).add(new Node(2,1));
//        adj.get(4).add(new Node(2,8));
//        adj.get(5).add(new Node(2,5));
//        adj.get(5).add(new Node(3,7));
//        adj.get(5).add(new Node(4,9));

    }

    public int[] dik(int startPoint) {
        int[] dist = new int[nodes + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startPoint] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.offer(new Node(startPoint, 0));


        while(!pq.isEmpty()) {
            Node current = pq.poll();
            if (current.weight > dist[current.vertex]) {
                continue;
            }
            for(Node neighbor: adj.get(current.vertex)) {
                int v = neighbor.vertex;
                int weightToNeighbor = neighbor.weight;

                if (dist[current.vertex] + weightToNeighbor < dist[v]) {
                    dist[v] = dist[current.vertex] + weightToNeighbor;
                    System.out.println(dist[v] + "dist[v]" + v);
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }
        return dist;
    }

}
