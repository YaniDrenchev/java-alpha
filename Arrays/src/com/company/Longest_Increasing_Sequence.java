package com.company;

import java.util.Scanner;

public class Longest_Increasing_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int current = 1;
        int max = 0;
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = scan.nextInt();
        }
        for (int i = 1; i< numbers.length; i++){
             if (numbers[i] > numbers[i-1]){
                 current++;
                 max = Math.max(max, current);
             }
             else {
                 max = Math.max(max, current);
                 current = 1;
             }
        }
        System.out.println(max);
    }
}
