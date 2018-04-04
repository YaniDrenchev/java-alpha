package com.company;

        import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  lines = scan.nextLine();

        String[] strs = lines.trim().split(" ");
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
        System.out.print(strs[0]);
        for (int i = 1; i < strs.length; i++) {

            System.out.print("," + strs[i]);
        }
    }
}

