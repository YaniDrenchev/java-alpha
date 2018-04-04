package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AboveTheDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Double>> matrix = new ArrayList<ArrayList<Double>>();
        for (int i = 0; i < n; i++) {
            matrix.add(new ArrayList<Double>());
        }
        double power = 0;
        double row = 2;
        int result = 1;
        int firstnumber =1;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < n; j++) {
                power = firstnumber;
                power = Math.pow(power, j);
                matrix.get(i).add(power);

            }
            firstnumber = firstnumber*2;

        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        };

    }
}

