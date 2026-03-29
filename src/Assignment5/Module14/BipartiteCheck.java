package Assignment5.Module14;

import java.util.*;

public class BipartiteCheck {

    boolean isBipartite(ArrayList<ArrayList<Integer>> graph, int vertices) {

        int[] color = new int[vertices];
        Arrays.fill(color, -1); // -1 means uncolored

        for (int i = 0; i < vertices; i++) {

            if (color[i] == -1) {

                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 0;

                while (!queue.isEmpty()) {
                    int node = queue.poll();

                    for (int neighbor : graph.get(node)) {

                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node];
                            queue.add(neighbor);
                        }
                        else if (color[neighbor] == color[node]) {
                            return false; // Not bipartite
                        }
                    }
                }
            }
        }
        return true;
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

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(0);
        graph.get(0).add(3);

        BipartiteCheck obj = new BipartiteCheck();

        if (obj.isBipartite(graph, vertices))
            System.out.println("Graph is Bipartite");
        else
            System.out.println("Graph is NOT Bipartite");
    }
}
