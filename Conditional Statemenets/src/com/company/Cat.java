package com.company;

import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] cats = new int[10];
        int buffer = 0;
        while (buffer < n){
            int number = scan.nextInt();
            cats[number-1] = cats[number-1] +1;
            buffer++;
        }
        int cat = 0;
        int maxSum = 0;

        for (int i = 0; i < cats.length ; i++) {
            if (maxSum < cats[i]){
                maxSum = cats[i];
                cat = i;
            }
        }
        System.out.println(cat+1);
    }
}
