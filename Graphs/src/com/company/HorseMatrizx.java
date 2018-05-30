package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class HorseMatrizx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String[][] graph = new String[size][size];
        int j = 0;
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            String[] str = line.split(" ");
            while (j <= i) {
                for (int k = 0; k < graph[j].length; k++) {
                    graph[j][k] = str[k];
                    if (graph[j][k].equals("s")) {
                        startRow = j;
                        startCol = k;
                    }
                }
                j++;
            }
        }

        int[][] deltas = {
                {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                {2, -1}, {2, 1}, {1, -2}, {1, 2}
        };

        int[] node = {startRow, startCol, 0};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int[] node1;
            node1 = ((ArrayDeque<int[]>) queue).getLast();

            int r = node1[0];
            int c = node1[1];
            int s = node1[2];
            int nr = r;
            int nc = c;
            for (int i = 0; i < deltas.length; i++) {
                int newParam[] = new int[3];
                nr = nr + deltas[i][0];
                nc = nc + deltas[i][1];
                if (nr < 0 || size <= nr || nc < 0 || nc >= size || graph[nr][nc].equals("x")) {
                    nr = r;
                    nc = c;
                    continue;
                }
                if (graph[nr][nc].equals("e")) {
                    System.out.println(s-1);
                    return;
                }
                graph[nr][nc] = "x";
                s = s + 1;
                newParam[0] = nr;
                newParam[1] = nc;
                newParam[2] = s;
                queue.add(newParam);
            }

        }
        System.out.println("no");
    }
}
