package Assignment5.Module14;

import java.util.*;

public class GraphTraversal {

    // DFS function
    void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
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

        int startNode = 0;

        GraphTraversal obj = new GraphTraversal();
        boolean[] visited = new boolean[vertices];

        System.out.println("Traversal starting from node " + startNode + ":");
        obj.dfs(startNode, graph, visited);
    }
}