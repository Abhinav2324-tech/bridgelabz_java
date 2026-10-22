package com.bridgelabz.java_treegraph;
import java.util.*;

public class GraphBFS {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbour : graph.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).addAll(Arrays.asList(1, 2));
        graph.get(1).addAll(Arrays.asList(0, 3));
        graph.get(2).addAll(Arrays.asList(0, 4));
        graph.get(3).add(1);
        graph.get(4).add(2);

        bfs(graph, 0);
    }
}