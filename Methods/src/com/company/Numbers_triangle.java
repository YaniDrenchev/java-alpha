package com.company;

import java.util.Scanner;

public class Numbers_triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            printnumIncrease(i);
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            printnumDecrease(i);
            System.out.println();
        }
    }

    static void printnumIncrease (int num){
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
    static void printnumDecrease (int num){
        for (int i = 1; i <= num; i++) {
            System.out.print(i+ " ");
        }
    }
}
