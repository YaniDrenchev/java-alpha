package com.company;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a num");
        int firstNum = scanner.nextInt();
        System.out.println("Write a num");
        int secondNum = scanner.nextInt();

        if (firstNum == secondNum) {
            System.out.println("Equal");
        } else if (firstNum < secondNum) {
            System.out.println("The bigger is" + secondNum);

        }else{
            System.out.println("the biggest is " + firstNum);
        }
    }
}
