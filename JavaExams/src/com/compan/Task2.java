package com.compan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String str[] = line.trim().split(" ");
        int numbers[] = new int[str.length];
        for (int i = 0; i < str.length ; i++) {
            numbers[i]= Integer.parseInt(str[i]);
        }
        int result = 0;
        String line2 = scan.nextLine();
        String str2[] = line2.trim().split(" ");
        HashSet<Integer> sums = new HashSet<>();
        for (int i = 0; i < str2.length ; i++) {
            sums.add(Integer.parseInt(str2[i]));
        }
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (sums.contains(numbers[i] + numbers[j])){
                    result++;
                    sums.remove(numbers[i] + numbers[j]);
                }
            }
        }
        System.out.println(result);
    }
}
