package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> sum = new ArrayList<>();
        if (m >= n){
            n = m;
        }else{
            m = n;
        }
        int numbers1 [] = new int [n];
        int numbers2 [] = new int [n];

        scan.nextLine();
        String line = scan.nextLine();
        String str [] = line.trim().split(" ");
        for (int i = 0; i < str.length; i++) {
            numbers1[i] = Integer.parseInt(str[i]);
        }
        String line2 = scan.nextLine();
        String str2 [] = line2.trim().split(" ");
        for (int i = 0; i < str.length; i++) {
            numbers2[i] = Integer.parseInt(str2[i]);
        }
        for (int i = 0; i < m; i++) {
            if (numbers1[m] + numbers2[m] >= 10){
                numbers1[n+1] +=(n+m)-10;
            }
            sum.add(returnSum(n, m));
        }
        System.out.println(sum);
    }
    static int returnSum(int a, int b){
        if (a + b >= 10){
            return a+b - 10;
        }else{
            return a+b;
        }
    }
}
