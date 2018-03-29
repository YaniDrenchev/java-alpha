package com.company;

import java.util.Scanner;

public class Allocate_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i<n; i++){
            numbers[i] = i*5;
        }
        for (int i =0; i<n; i++){
            System.out.println(numbers[i]);
        }
    }
}
