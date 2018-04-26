package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();
        int route[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = scan.nextLine();
            String str[] = line.trim().split(" ");
            for (int j = 0; j < str.length; j++) {
                route[i][j] = Integer.parseInt(str[j]);
            }
        }

        int currRow = 0;
        int currCol = 0;
        for (int i = 0; i < route.length; i++) {
            for (int j = 0; j < route[i].length; j++) {
                if (route[i][j] == 0) {
                    currRow = i;
                    currCol = j;
                }
            }
        }
        int count = 0;
        while (true) {
            int left = 0;
            int right = 0;
            int up = 0;
            int down = 0;
            if (currCol - 1 < 0) {
            } else {
                left = route[currRow][currCol - 1];
            }
            if (currCol + 1 >= cols) {

            } else {
                right = route[currRow][currCol + 1];
            }
            if (currRow - 1 < 0) {

            } else {
                up = route[currRow - 1][currCol];
            }
            if (currRow + 1 > rows - 1) {
            } else {
                down = route[currRow + 1][currCol];
            }


            if (left == 0 && right == 0 && up == 0 && down == 0) {
                break;
            }
            if (left >= right && left >= up && left >= down) {
                currCol = currCol - 1;
                count++;
                route[currRow][currCol] -= 1;
            } else if (right >= left && right >= up && right >= down) {
                currCol = currCol + 1;
                count++;
                route[currRow][currCol] -= 1;
            } else if (up >= right && up >= down && up >= left) {
                currRow -= 1;
                count++;
                route[currRow][currCol] -= 1;
            } else if (down >= right && down >= up && down >= left) {
                currRow += 1;
                count++;
                route[currRow][currCol] -= 1;
            }
        }
        System.out.println(count);
    }
}