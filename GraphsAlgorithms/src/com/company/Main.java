package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        for (int i = 0; i < Dijkstra.dijkstra(initGraph(), 5).length; i++) {
            System.out.println(Dijkstra.dijkstra(initGraph(), 5)[i]);
        }
        Arrays.stream(Kruskal.kruskal(getGraphKruskal(), 7)).forEach(System.out::println);

    }

    private static int[][] initGraph() {
        int graph[][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = -1;
            }

        }
        graph[0][1] = 4;
        graph[0][2] = 4;

        graph[1][0] = 4;
        graph[1][2] = 2;
        graph[1][3] = 6;
        graph[1][6] = 5;


        graph[2][0] = 4;
        graph[2][1] = 2;
        graph[2][6] = 3;

        graph[3][1] = 6;
        graph[3][5] = 1;
        graph[3][7] = 9;

        graph[4][7] = 4;

        graph[5][3] = 1;
        graph[5][6] = 6;
        graph[5][7] = 5;

        graph[6][1] = 5;
        graph[6][2] = 4;
        graph[6][5] = 6;

        graph[7][3] = 9;
        graph[7][4] = 4;
        graph[7][5] = 5;

        return graph;

    }

    private static List<int []> getGraphKruskal(){
        List<int[]> graph = new ArrayList<>();

        graph.add(new int[]{0,2,2});
        graph.add(new int[]{0,2,2});
        graph.add(new int[]{0,2,2});
        graph.add(new int[]{0,2,2});
        graph.add(new int[]{0,2,2});
        graph.add(new int[]{0,2,2});
        return graph;
    }
}

