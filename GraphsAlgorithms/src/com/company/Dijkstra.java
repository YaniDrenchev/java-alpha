package com.company;

public class Dijkstra {
    private static int[][] graph;
    private static final int start = 8;
    public static int[] dijkstra(int [][] graph, int index){
        int [] result = new int[start];
        boolean [] used = new boolean[start];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.MAX_VALUE;
        }
        result[index] = 0;
        boolean hasUnusedNodes = true;
        for (int n = 0; n < start; n++) {
            {
                int shortestPath = Integer.MAX_VALUE;
                int shortestPathNode = -1;

                for (int i = 0; i < start; i++) {
                    if (!used[i] && result[i] < shortestPath) {
                        shortestPath = result[i];
                        shortestPathNode = i;
                    }
                }
                used[shortestPathNode] = true;

                for (int i = 0; i < start; i++) {
                    if (!used[i] && graph[shortestPathNode][i] > -1) {
                        int newDistance = shortestPath + graph[shortestPathNode][i];
                        if (result[i] > newDistance) {
                            result[i] = newDistance;
                        }
                    }
                }
            }
        }
        return result;
    }

}
