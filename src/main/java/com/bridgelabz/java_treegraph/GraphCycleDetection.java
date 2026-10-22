package com.bridgelabz.java_treegraph;
import java.util.*;

public class GraphCycleDetection {

    static boolean dfs(ArrayList<ArrayList<Integer>> graph,
                       int current, int parent, boolean[] visited) {

        visited[current] = true;

        for (int neighbour : graph.get(current)) {

            if (!visited[neighbour]) {
                if (dfs(graph, neighbour, current, visited)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).addAll(Arrays.asList(1, 2));
        graph.get(1).addAll(Arrays.asList(0, 2));
        graph.get(2).addAll(Arrays.asList(0, 1));

        boolean[] visited = new boolean[3];

        System.out.println("Cycle exists: " +
                dfs(graph, 0, -1, visited));
    }
}