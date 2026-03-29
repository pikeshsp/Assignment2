package Assignment5.Module14;

import java.util.*;

public class BFSExample {

    // Function to perform BFS
    void bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        BFSExample obj = new BFSExample();
        boolean[] visited = new boolean[vertices];

        System.out.println("BFS Traversal:");
        obj.bfs(0, graph, visited);
    }
}