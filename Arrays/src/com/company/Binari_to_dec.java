package com.company;


import java.util.Scanner;

public class Binari_to_dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long dec = 0;
        String lines = scan.nextLine();
        String[] strs = lines.split("");
        int numbers[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        for(int i = 0; i <  numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        double a = 0;
        for (int i = 0; i <  numbers.length; i++){
            dec = dec + (long) (numbers[i] * Math.pow(2, a));
            a = a+1;
        }
        System.out.println(dec);
    }
}

