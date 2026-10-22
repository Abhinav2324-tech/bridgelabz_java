package com.bridgelabz.java_treegraph;

import java.util.*;

public class GraphDFS {

    static void dfs(ArrayList<ArrayList<Integer>> graph,
                    int current, boolean[] visited) {

        visited[current] = true;
        System.out.print(current + " ");

        for (int neighbour : graph.get(current)) {
            if (!visited[neighbour]) {
                dfs(graph, neighbour, visited);
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

        boolean[] visited = new boolean[5];

        dfs(graph, 0, visited);
    }
}
