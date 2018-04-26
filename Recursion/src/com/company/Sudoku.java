package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList> sodoku = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            sodoku.add(new ArrayList());
            String line = scan.nextLine();
            String str[] = line.trim().split("");
            for (int j = 0; j < str.length; j++) {
                sodoku.get(i).add(str[j]);
            }
            int numbers [] = {1,2,3,4,5,6,7,8,9};
        }

    }
    static void solveSudoku(ArrayList<ArrayList> sudoku, int Currrow, int Currcol, int numbers[]){
        for (int row = Currrow; row < 9 ; row++) {
            for (int col = Currcol; col < 9; col++) {
                if (sudoku.get(row).get(col).equals("-")){
                    for (int i = 0; i < numbers.length ; i++) {
//                        if (!sudoku.get(row).contains(numbers[i]) && sudoku.get(row).get(col))
                    }
                }
            }
        }
    }
}
