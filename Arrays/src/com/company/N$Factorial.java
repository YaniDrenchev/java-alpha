package com.company;

import java.util.Scanner;

public class N$Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numbers[] = new int[n];
        long mult = 1;
        if (n == 0){
            mult = 0;
        }
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        for (int i = 0; i < numbers.length; i++){
            mult = mult*numbers[i];
        }
        System.out.println(mult);
    }
}