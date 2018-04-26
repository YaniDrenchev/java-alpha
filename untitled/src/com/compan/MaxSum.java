package com.compan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int num [] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        List<Integer> nums = Arrays.stream(num).sorted(
        ).boxed().collect(Collectors.toList());
        int result = 0;
        for (int i = 1; i < k+1; i++) {
            result+=nums.get(nums.size()-i);
        }
        System.out.println(result);
    }
}
