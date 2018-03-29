package com.company;

import java.util.Scanner;

public class Odd_Even_Product {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numbers[] = new int[n];
        scan.nextLine();
        String  lines = scan.nextLine();
        String[] strs = lines.trim().split("\\s+");
        long oddProduct = 1;
        long evenProduct = 1;
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0; i < numbers.length; i=i+2){
            oddProduct = oddProduct*numbers[i];
        }
        for (int i = 1; i < numbers.length; i=i+2){
            evenProduct = evenProduct*numbers[i];
        }
        if (evenProduct == oddProduct){
            System.out.println("yes " + evenProduct);
        }else {
            System.out.println("no " + oddProduct + " " + evenProduct);
        }

    }
}
