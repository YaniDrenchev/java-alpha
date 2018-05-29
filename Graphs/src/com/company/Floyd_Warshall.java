package com.company;

import java.util.Arrays;

public class Floyd_Warshall {
   static int graph [] [];
   static int distances[][];

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

        distances = new int[graph.length][graph.length];
    }


    public static void Floyd (){
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] != -1){
                    distances[i][j] = graph[i][j];
                }
                else{
                    distances[i][j] = 10000;
                }
            }
        }

        for (int k = 0; k < graph.length; k++) {
            for (int i = 1; i < graph.length; i++) {
                for (int j = 2; j < graph.length; j++) {
                    if (distances[i][j] > distances[i][k] + distances[j][k]){
                        distances[i][j] = distances[i][k] + distances[j][k];
                    }
                }
            }
        }

        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {
                if (distances[i][j] != 10000) {
                    System.out.printf("%d \n", distances[i][j]);
                }
            }
        }
    }

}
