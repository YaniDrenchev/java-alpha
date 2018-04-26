package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int dRows = +1;
        int dCols = +1;
//        int currentRow = 0;
//        int currentCol = 0;
        int nextRow = 0;
        int nextCol = 0;
        BigInteger result = BigInteger.ZERO;
        result = getValue(nextRow,nextCol);
        while(!inAcorner(nextRow, nextCol, rows, cols)){
            nextRow+=dRows;
            nextCol+=dCols;
            if (nextRow == 0 && nextCol == 0){
                result = result.add(getValue(nextRow, nextCol));
                break;
            }
            if (nextRow == rows-1 && nextCol == cols-1){
                result = result.add(getValue(nextRow, nextCol));
                break;
            }
            if (nextRow == 0 && nextCol == cols-1){
                result = result.add(getValue(nextRow, nextCol));
                break;
            }
            if (nextRow == rows-1){
                dRows = dRows*-1;
                result = result.add(getValue(nextRow, nextCol));
            }
            else if (nextCol == cols-1){
                dCols = dCols*-1;
                result = result.add(getValue(nextRow, nextCol));
            }
            else if (nextRow == 0){
                dRows = dRows*-1;
                result = result.add(getValue(nextRow, nextCol));
            }
            else if (nextCol == 0){
                dCols = dCols*-1;
                result = result.add(getValue(nextRow, nextCol));
            }
            else result = result.add(getValue(nextRow, nextCol));
        }
        System.out.println(result);
    }
    static Boolean inAcorner (int currentRow, int currentCol, int rows ,int cols){
        return currentRow == rows-1 && currentCol == 0;
    }
    static BigInteger getValue (int CurrentRow, int CurretCol){
        BigInteger result = BigInteger.ZERO;
        result = result.add(BigInteger.valueOf(2)).pow(CurrentRow+CurretCol);
        return result;
    }
}
