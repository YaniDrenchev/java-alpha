package com.company;

import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String bin = "";
        if (number == 0){
            bin = "0";
        }
        while (number >= 1){
            if (number % 2 == 0){
                bin = bin + 0;
            }else {
                bin = bin + 1;
            }
            number = number/2;
        }
        String reverse = new StringBuilder(bin).reverse().toString();
        System.out.println(reverse);
    }
}