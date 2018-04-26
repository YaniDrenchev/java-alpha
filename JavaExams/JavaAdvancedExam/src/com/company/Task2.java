package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String str[] = line.trim().split(",");

        int[] code = new int[str.length];
        for (int i = 0; i < code.length; i++) {
            code[i] = Integer.parseInt(str[i]);
        }
        int index = 0;
        while (index < code.length) {
            ArrayList<Integer> newNumber = new ArrayList<>();
            int number = code[index];
            boolean isEven = isEven(index);
            String str1[] = printBinaryform(number).split("");
            int binNum[] = new int[8];
            int j = binNum.length - 1;
            for (int i = str1.length - 1; i >= 0; i--) {
                binNum[j] = Integer.parseInt(str1[i]);
                j--;
            }
            if (isEven) {
                for (int i = 0; i < binNum.length; i++) {
                    if (i == 0) {
                        continue;
                    }
                    if (i % 2 != 0) {
                        newNumber.add(binNum[i]);
                    }

                }
            } else {
                for (int i = 0; i < binNum.length; i++) {
                    if (i ==0){
                        newNumber.add(binNum[i]);
                        continue;
                    }
                    if (i % 2 == 0) {
                        newNumber.add(binNum[i]);
                    }
                }

            }
            index++;
            for (int i = 0; i < newNumber.size(); i++) {
                System.out.print(newNumber.get(i));
            }
        }
    }

    private static String printBinaryform ( int number){
        String bin = "";
        if (number == 0) {
            bin = "0";
        }
        while (number >= 1) {
            if (number % 2 == 0) {
                bin = bin + 0;
            } else {
                bin = bin + 1;
            }
            number = number / 2;
        }
        String reverse = new StringBuilder(bin).reverse().toString();
        return reverse;
    }
    static Boolean isEven ( int number){
        if (number == 0) {
            return true;
        }
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
