package Assignment5.Module14;

import java.util.*;

public class ShortestPathBFS {

    void shortestPath(int start, ArrayList<ArrayList<Integer>> graph, int vertices) {

        int[] distance = new int[vertices];
        Arrays.fill(distance, -1); // -1 means unvisited

        Queue<Integer> queue = new LinkedList<>();

        distance[start] = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph.get(node)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);
                }
            }
        }

        // Print shortest distances
        System.out.println("Shortest distances from node " + start + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph
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

        graph.get(3).add(5);
        graph.get(5).add(3);

        ShortestPathBFS obj = new ShortestPathBFS();
        obj.shortestPath(0, graph, vertices);
    }
}
