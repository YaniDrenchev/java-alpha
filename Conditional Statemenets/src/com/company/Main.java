package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password ");
        String pass = scanner.nextLine();

            if (pass.length() >= 8){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid pass");
        }
//        System.out.println("edasdas");
    }
}
