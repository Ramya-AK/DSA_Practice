package org.example.Graphs.Traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
//
public class Dijkstras {
//
//    static class Node {   // this is required to store the how much distance required to reach the vertex, so add the vertex which we travelling to and distance
//        int vertex;
//        int distance;
//
//        Node(int vertex, int distance) {
//            this.vertex = vertex;
//            this.distance = distance;
//        }
//    }
//   // verify the smallest distance from the given start point to all the vertex
//    int node = 5;
//    ArrayList<ArrayList<Node>> adj =  new ArrayList<ArrayList<Node>>();
//
//    public void neighboursCreation() {
//
//        for (int i = 0; i < node; i++) {
//            adj.add(i,new ArrayList<>());
//        }
//
//        // Adding directed edges
//        addEdge(0, 1, 2);
//        addEdge(0, 2, 5);
//        addEdge(0, 3, 6);
//        addEdge(1, 4, 1);
//        addEdge(2, 4, 2);
//        addEdge(4, 1, 9);
//    }
//
//    private void addEdge(int u, int v, int weight) {
//        adj.get(u).add(new Node(v, weight)); // Only add one direction
//    }
//

    /// /        adj.get(0).add(new Node(1, 2));
    /// ///        adj.get(1).add(new Node(0, 2));
    /// /
    /// /        adj.get(0).add(new Node(2, 5));
    /// ///        adj.get(2).add(new Node(0, 5));
    /// /
    /// /        adj.get(0).add(new Node(3, 6));
    /// /
    /// ///        adj.get(3).add(new Node(0, 6));
    /// /
    /// /        adj.get(1).add(new Node(4, 1));
    /// ///        adj.get(4).add(new Node(1, 1));
    /// /
    /// ///        adj.get(4).add(new Node(2, 1));
    /// /        adj.get(2).add(new Node(4, 2));
    /// /
    /// ///        adj.get(1).add(new Node(4, 9));
    /// /        adj.get(4).add(new Node(1, 9));
//
//
//    public int[] shortestDistance(int source) {
//        int[] distance = new int[node];
//        boolean[] visited = new boolean[node];
//        Arrays.fill(distance, Integer.MAX_VALUE);
//        distance[source] = 0;
//        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
//        pq.add(new Node(source, 0));
//
//
//        while(!pq.isEmpty()) {
//            Node curr = pq.poll();
//            int u = curr.vertex;
//            if (visited[u]) continue;
//            visited[u] = true;
//
//            for(Node neighbor: adj.get(u)) {
//                int v = neighbor.vertex;
//                int weight = neighbor.distance;
//
//
//                if (!visited[v] && distance[u] != Integer.MAX_VALUE &&
//                        distance[u] + weight < distance[v]) {
//                    distance[v] = distance[u] + weight;
//                    pq.add(new Node(v, distance[v]));
//                }
//
//
//            }
//        }
//        return distance;
//    }
//}
//


    class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    class Node implements Comparable<Node> {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
    int V = 4;
    ArrayList<ArrayList<Edge>> adj;


        public void Graph(int V) {
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination, int weight) {
            adj.get(source).add(new Edge(destination, weight));
        }

        public int[] dijkstra(int source) {
            int[] distances = new int[V];
            Arrays.fill(distances, Integer.MAX_VALUE);
            distances[source] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>();
            pq.offer(new Node(source, 0));

            while (!pq.isEmpty()) {
                Node current = pq.poll();
                int u = current.vertex;

                if (current.distance > distances[u]) {
                    continue;
                }

                for (Edge edge : adj.get(u)) {
                    int v = edge.destination;
                    int weight = edge.weight;

                    if (distances[u] != Integer.MAX_VALUE &&
                            distances[u] + weight < distances[v]) {
                        distances[v] = distances[u] + weight;
                        pq.offer(new Node(v, distances[v]));
                    }
                }
            }

            return distances;
        }

}
