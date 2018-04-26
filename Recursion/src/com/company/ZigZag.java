package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger result = BigInteger.ONE;
        ArrayList<ArrayList<Integer>> visited = new ArrayList<>();
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        for (int i = 0; i < rows; i++) {
            visited.add(new ArrayList<Integer>());
            for (int j = 0; j < cols; j++) {
                visited.get(i).add(0);
            }
        }
        int dirCols = +1;
        int dirRows = +1;
        int currRow = 1;
        int currCol = 1;
        int nextRow = 0;
        int nextCol = 0;
//        result = result.add(getValue(currRow, currCol));
        while (!isInACornern(currRow, currCol, rows, cols, result)) {
            dirRows = dirRows * -1;
            nextCol = currCol + dirCols;
            nextRow = currRow + dirRows;
            if (nextCol == cols - 1) {
                dirCols = dirCols * -1;
                dirRows = dirRows * -1;
//                    result = result.add(getValue(nextRow, nextCol));
            }
            if (nextCol == 0) {
                dirCols = dirCols * -1;
                dirRows = dirRows * -1;
            }
            result = result.add(getValue(currRow, currCol));
            currCol = nextCol;
            currRow = nextRow;

        }
        result = result.add(getValue(currRow, currCol));
        System.out.println(result);

    }

    static BigInteger getValue(int row, int col) {
        BigInteger result = BigInteger.ZERO;
        result = result.add(BigInteger.valueOf(row * 3 + col * 3 + 1));
        return result;
    }

    static boolean isInACornern(int row, int col, int rows, int cols, BigInteger result) {
        if (row == 0 && col == cols - 1) {
            return true;

        }
        if (row == rows - 1 && col == 0) {
            return true;

        }
        if (row == rows-1 && col == cols-1) {
            return true;

        }
        if (row == 0 && col == 0) {
            return true;

        }
        return false;
    }
}

