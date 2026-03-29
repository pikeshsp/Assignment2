package Assignment5.Module14;

import java.util.*;

public class CycleDetectionUndirected {

    boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, graph))
                    return true;
            }
            else if (neighbor != parent) {
                return true; // Cycle detected
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0); // creates cycle
        graph.get(0).add(2);

        graph.get(2).add(3);
        graph.get(3).add(2);

        CycleDetectionUndirected obj = new CycleDetectionUndirected();
        boolean[] visited = new boolean[vertices];

        if (obj.dfs(0, -1, visited, graph))
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }
}