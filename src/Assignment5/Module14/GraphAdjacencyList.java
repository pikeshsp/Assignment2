package Assignment5.Module14;

import java.util.*;

public class GraphAdjacencyList {

    public static void main(String[] args) {

        int vertices = 5;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize list for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (Undirected Graph)
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        // Print adjacency list
        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}