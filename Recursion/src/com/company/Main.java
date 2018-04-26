package com.company;

public class Main {

    static boolean inRange(int value, int max) {
        return 0 <= value && value < max;
    }

    static boolean pathExist(int row, int col, char[][] lab) {
        int[] dRows = {1, 0, -1, 0};
        int[] dCols = {0, 1, 0, -1};
        int rows = lab.length;
        int cols = lab[row].length;
        for (int i = 0; i < dRows.length; i++) {
            int nextRow = row + dRows[i];
            int nextCol = col + dCols[i];
            if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                continue;
            }


            if (lab[nextRow][nextCol] == 'x') {
                continue;
            }
            if (lab[nextRow][nextCol] == 'e') {
                return true;
            }
            lab[nextRow][nextCol] = 'x';
            Boolean hasPath = pathExist(nextRow, nextCol, lab);
            lab[nextRow][nextCol] = ' ';
            if (hasPath) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] labirint = {
                {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',},
                {'s', 'x', ' ', 'x', ' ', ' ', 'x', 'x',},
                {' ', ' ', 'x', 'x', ' ', ' ', ' ', 'x',},
                {' ', ' ', ' ', ' ', ' ', 'x', ' ', 'x',},
                {'x', 'x', 'x', ' ', ' ', 'x', ' ', 'x',},
                {'x', 'x', 'x', 'x', ' ', 'x', 'e', 'x',},
        };
        System.out.println(pathExist(1,0,labirint));
    }
}
