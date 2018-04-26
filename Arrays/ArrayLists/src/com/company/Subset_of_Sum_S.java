package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Subset_of_Sum_S {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scan.nextInt());
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum = numbers.get(i);
            for (int j = i; j < numbers.size(); j++) {
                if (i == j) {
                    continue;
                }
                sum = sum + numbers.get(j);
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);

    }
}
