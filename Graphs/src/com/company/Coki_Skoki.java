package com.company;

import java.util.Scanner;

public class Coki_Skoki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String line = scan.nextLine();
        String str [] = line.trim().split("");
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length ; j++) {
                if (Integer.parseInt(str[i])> Integer.parseInt(str[i+1])){

                }
            }
        }
    }
}
