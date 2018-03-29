package com.company;

import java.util.Scanner;

public class Exchange_if_Greater {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float firstN = scanner.nextFloat();
        float secondN = scanner.nextFloat();
        float buffer = firstN;
        if (firstN == secondN || secondN > firstN){
            System.out.println(firstN + " " + secondN);
        }else if (firstN > secondN){
            firstN = secondN;
            secondN = buffer;
            System.out.println(firstN + " " + secondN);
        }
    }
}
