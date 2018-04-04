package com.company;

import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Symetric_Arrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int buffer = 0;
        while (buffer < n) {
            String lines = scan.nextLine();
            String[] strs = lines.trim().split(" ");
            int[] numbers = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                numbers[i] = parseInt(strs[i]);
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[numbers.length - 1 - i]) {
                    System.out.println("Yes");
                    break;
                } else {
                    System.out.println("No");
                    break;
                }
            }
            buffer++;
        }
    }
}