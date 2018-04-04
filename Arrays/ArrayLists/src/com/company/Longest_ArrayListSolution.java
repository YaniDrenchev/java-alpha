package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Longest_ArrayListSolution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            int current = 1;
            int max = 0;
            for (int i = 0; i< n; i++){
                numbers.add(scan.nextInt());
            }
            for (int i = 1; i < numbers.size(); i++){
                if (numbers.get(i) > numbers.get(i-1)){
                    current++;
                    max = Math.max(max, current);
                }
                else {
                    max = Math.max(max, current);
                    current = 1;
                }
            }
            System.out.println(max);
        }
    }


