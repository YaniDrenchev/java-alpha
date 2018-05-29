package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class Prim {
    public static int[][] graph;
    public static boolean[][] used;

    public static void Prim(){
        int [] v = graph[0];
        Queue<int[]> edges = new ArrayDeque<>();

        while (v.length > 0){
            v = ((ArrayDeque<int[]>) edges).pop();
        }
    }



    static {
        graph = new int [6][6];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = -1;
            }
        }
        graph[0][1] = 3;
        graph[0][2] = 4;

        graph[1][0] = 3;
        graph[1][2] = 1;
        graph[1][4] = 6;

        graph[2][0] = 4;
        graph[2][1] = 1;
        graph[2][3] = 7;
        graph[2][4] = 7;

        graph[3][2] = 7;
        graph[3][4] = 8;

        graph[4][1] = 6;
        graph[4][2] = 7;
        graph[4][3] = 8;
        graph[4][5] = 8;

        graph[5][4] = 8;

    }
}
