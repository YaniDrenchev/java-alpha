package com.company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sec = 0;
        int Maxsec = 0;
        int [] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (numbers[j] == numbers[i]){
                    sec++;
                    Maxsec = Math.max(sec, Maxsec);
                }else{
                    sec = 0;
                }
            }
        }
        System.out.println(Maxsec);
    }
}
