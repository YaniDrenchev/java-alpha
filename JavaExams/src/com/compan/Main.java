package com.compan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int jumps = scan.nextInt();
        int startRow = scan.nextInt();
        int startCol = scan.nextInt();
        int dRows[] = new int[jumps];
        int dCols[] = new int[jumps];
        BigInteger result = BigInteger.ZERO;
        HashSet<Long> visited = new HashSet<>();
        for (int i = 0; i < jumps; i++) {
            dRows[i] = scan.nextInt();
            dCols[i] = scan.nextInt();
        }
        int nextRow = startRow;
        int nextCol = startCol;
        result = result.add(calculate(rows,cols,nextRow,nextCol));
        int index = 0;
        int numberOfJumps = 0;
        while (true) {
            nextRow = nextRow + dRows[index];
            nextCol = nextCol + dCols[index];
            if (nextCol >= cols || nextRow >= rows) {
                System.out.println("escaped" + " "+ result);
                break;
            }
            if (visited.contains(calculate2(rows,cols,nextRow,nextCol))){
                System.out.println("caught" + " " + numberOfJumps);
                break;
            }else {
                visited.add(calculate2(rows, cols, nextRow, nextCol));
                result = result.add(calculate(rows, cols, nextRow, nextCol));
                index++;
                numberOfJumps++;
                if (index >= dCols.length) {
                    index = 0;
                }
            }
        }


    }
    static BigInteger calculate(int rows, int cols, int currRow, int currCol){
        BigInteger result = BigInteger.ZERO;
        return result = result.add(BigInteger.valueOf((currRow*cols + 1) + currCol));
    }
    static long calculate2(int rows, int cols, int currRow, int currCol){
        long result = 0;
        return result = result + (currRow*cols + 1) + currCol;
    }
}
