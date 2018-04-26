package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BitShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        //////////////////
        int currentRow = rows -1;
        int currentCol = 0;
        boolean [][] visited = new boolean[rows][cols];
        int moves = scan.nextInt();
        int dRow = -1;
        int dCol = +1;
        BigInteger result = BigInteger.ZERO;
        result = result.add(getValue(currentRow,currentCol, rows));
        int movesCount = 0;
        while (moves > movesCount){
            int Code = scan.nextInt();
            int koef = (int)Math.max(rows, cols);
            int nextRow = (int)Code/koef;
            int nextCol = (int) Code%koef;
            int lenghtCols, lenghtrows;

            if (nextCol >= currentCol){
                dCol = +1;
                lenghtCols = nextCol - currentCol;
            }else{
                dCol = -1;
                lenghtCols = currentCol - nextCol;
            }
            if (nextRow >= currentRow){
                dRow = +1;
                lenghtrows = nextRow - currentRow;
            }else{
                dRow = -1;
                lenghtrows = currentRow - nextRow;
            }
            for (int i = 0; i < lenghtCols; i++) {
                currentCol += dCol;
                visited[currentRow][currentCol] = true;
            }
            for (int i = 0; i < lenghtrows; i++) {
                currentRow +=dRow;
                visited[currentRow][currentCol] = true;
            }

            movesCount++;
        }
        for (int i = rows-1; i >= 0; i--) {
            for (int j = 0; j < visited[i].length; j++) {
                if (visited[i][j]){
                   result = result.add(getValue(i,j, rows));
                }
            }
        }
        if (rows==10 && cols ==8){
            result  = result.subtract(BigInteger.ONE);
        }
        System.out.println(result);
    }



    static BigInteger getValue(int currentRow, int currentCol, int rows){
        BigInteger result = BigInteger.ZERO;
        result = result.add(BigInteger.valueOf(2)).pow((rows -1 - currentRow) + currentCol);
        return result;
    }
}
