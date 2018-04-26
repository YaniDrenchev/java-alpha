package com.company;

import java.util.Scanner;

public class Excahnge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double buffer = 0;
        if (a >= b){
            buffer = b;
            b = a;
            a = buffer;
        }
        System.out.print(a + ' ' + b);
    }
}
