package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Getmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(scan.nextInt());
        num.add(scan.nextInt());
        num.add(scan.nextInt());
        int max = 0;
        for (int i = 0; i < num.size()-1; i++) {
            if (num.get(i) >= num.get(i+1)){
                max = Math.max(max,num.get(i));
            }else{
                max = Math.max(max,num.get(i+1));
            }
        }
        System.out.println(max);
    }
}
