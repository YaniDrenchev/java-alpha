package com.company;

import java.util.Scanner;

public class SwitchCaseStatment {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.println();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
