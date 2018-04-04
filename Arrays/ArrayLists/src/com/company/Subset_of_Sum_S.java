package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Subset_of_Sum_S {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int sum = 0;
        boolean check = false;
        String lines = scan.nextLine();
        String[] strs = lines.trim().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            numbers.add(Integer.parseInt(strs[i]));
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() ; j++){
                if (i==j){
                continue;
            }
                sum = sum + numbers.get(j);
                if (sum == n){
                   check = true;
                }
            }
            sum = numbers.get(i);
        }
        if (check == true ){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
