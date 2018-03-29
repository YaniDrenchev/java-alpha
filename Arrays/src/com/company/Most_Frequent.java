package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Most_Frequent {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        int current = 1;
        int max = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++){
            if (array[i]== array[i-1]){
                current++;
                if (max <= current){
                    max = current;
                    number = array[i];
                }
            }else{
                current = 1;
            }
        }
        System.out.println(number + "(" + max + " times)");
    }
}
