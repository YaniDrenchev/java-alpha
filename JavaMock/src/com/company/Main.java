package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lines = scan.nextLine();
        String[] strs = lines.trim().split("");
        int[] numbers = new int[strs.length];
        double sum = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(".")) {
                continue;
            }
            if (strs[i].equals("-")) {
                continue;
            }
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int n = 0;
        String num = "";
        for (int i = 0; i < strs.length; i++) {
            sum = sum + numbers[i];
        }
        while (sum > 9) {
            n = (int)sum;
            num = Double.toString(sum);
            int numbers2[] = new int[num.length()];
            String strs2[] = num.trim().split("");
            for (int i = 0; i < num.length(); i++) {
                if (strs2[i].equals(".")) {
                    continue;
                }
                numbers2[i] = Integer.parseInt(strs2[i]);
            }
            sum=0;
            for (int i = 0; i < numbers2.length; i++) {
                sum = sum + numbers2[i];
            }
        }
        n = (int)sum;
        System.out.println(n);

    }
}
