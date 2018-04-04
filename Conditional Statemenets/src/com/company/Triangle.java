package com.company;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int buffer = 1;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= buffer-1; j++) {
                System.out.print(j+1 + " ");
            }

            buffer++;
            if (buffer > n){
                break;
            }
            System.out.println();
        }
        System.out.println();
        int buffer2 = n;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < buffer2 ; j++) {
                System.out.print(j  + " ");
            }
            buffer2--;
            if (buffer2 < 1){
                break;
            }
            System.out.println();
        }
    }
}