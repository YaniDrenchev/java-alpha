package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        DfsExample.dfs();
//        System.out.println();
//        BFSExample.bfs();

//        Arrays.stream(Floyd_Warshall.Floyd(initGraph())).forEach(System.out::print);

//        Floyd_Warshall.Floyd();
        int[][] deltas = {
                {-2, -1},{-2, 1},{-1, -2},{-1, 2},
                {2,-1}, {2,1}, {1 ,-2}, {1, 2}
        };
        System.out.println(deltas[4][1]);

    }

}
