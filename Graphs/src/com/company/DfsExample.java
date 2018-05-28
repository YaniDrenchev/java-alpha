package com.company;

import java.util.Stack;

public class DfsExample {
    static int [][] graph;

    static void dfs(){
        Stack<Integer> stack = new Stack<>();
        Boolean[] used = new Boolean[graph.length];
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
        System.out.printf("%c", 65);
        stack.push(0);
        used[0] = true;

        while (!stack.isEmpty()){
            int node = stack.peek();
            boolean hasUnusedNeighbours = false;

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] != 0 && used[i] == false ){
                    hasUnusedNeighbours = true;
                    System.out.printf("%c", i+65);
                    stack.push(i);
                    used[i] = true;
                    break;
                }
            }

            if (!hasUnusedNeighbours){
                stack.pop();
            }
        }
    }


    static {
        graph = new int [6][6];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = 0;
            }
        }
        graph[0][1] = 1;
        graph[0][2] = 1;

        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[1][4] = 1;

        graph[2][0] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[2][4] = 1;

        graph[3][2] = 1;
        graph[3][4] = 1;

        graph[4][1] = 1;
        graph[4][2] = 1;
        graph[4][3] = 1;
        graph[4][5] = 1;

        graph[5][4] = 1;

    }
}
