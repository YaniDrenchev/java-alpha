package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  lines = scan.nextLine();

        String[] strs = lines.trim().split("");
        int start = 0;
        int end = strs.length-1;
        String buffer;
        while(start < end){
            buffer = strs[end];
            strs [end] = strs[start];
            strs [start] = buffer;
            end--;
            start++;
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }
    }
}
