package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Nummerology {
    static String number;
    static int[] numbers = new int[10];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = reader.readLine();
        dfs(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1) {
                result.append(String.format("%s", numbers[i]));
                break;
            }
            result.append(String.format("%s ", numbers[i]));

        }
        System.out.println(result);
    }
     static void dfs(String number){

        int a = 0;
        int b = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.length() == 1){
                numbers[Integer.parseInt(String.valueOf(number.charAt(0)))]++;
                return;
            }
            if (i + 1 >= number.length()){
                return;
            }
            a = Integer.parseInt(String.valueOf(number.charAt(i)));
            b = Integer.parseInt(String.valueOf(number.charAt(i+1)));
            int newNumber = 0;
            newNumber = (a + b) * (a ^ b) % 10;
            String newNumber1 = number.substring(0, i);
            newNumber1 += newNumber;
            newNumber1 += number.substring(i+2);
            dfs(newNumber1);
        }
    }
}
