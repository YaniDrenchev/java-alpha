package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lines = scan.nextLine();
        String[] strs = lines.trim().split("");
        int[] numbers = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int sum;
        int sum1;
        int sum2;
        int sum3;
        int sum4;
        sum = numbers[0] * numbers[1] * numbers[2];
        sum1 = (numbers[0] * numbers[1]) + numbers[2];
        sum2 = (numbers[0] * numbers[2]) + numbers[1];
        sum3 = (numbers[2] * numbers[1]) + numbers[0];
        sum4 = numbers[2] + numbers[1] + numbers[0];
        if (sum4 > sum) {
            sum = sum4;
        } else if (sum1 > sum) {
            sum = sum1;
        } else if (sum2 > sum) {
            sum = sum2;
        } else if (sum3 > sum) {
            sum = sum3;
        }
        System.out.println(sum);
    }
}
