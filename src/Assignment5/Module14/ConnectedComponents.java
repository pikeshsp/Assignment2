package Assignment5.Module14;

import java.util.*;

public class ConnectedComponents {

    // DFS function
    void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(4).add(5);
        graph.get(5).add(4);

        ConnectedComponents obj = new ConnectedComponents();
        boolean[] visited = new boolean[vertices];

        int count = 0;

        // Count components
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                obj.dfs(i, graph, visited);
                count++;
            }
        }

        System.out.println("Number of connected components: " + count);
    }
}
