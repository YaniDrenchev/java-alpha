package com.company;

import java.util.Scanner;

public class Biggest_Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int number = n; number > 2; number--) {
            if (isPrime(number)){
                System.out.print(number);
                break;
            }
        }
    }

    static Boolean isPrime(int number) {
        int maxDevider = (int) Math.sqrt(number);
        for (int i = 2; i <= maxDevider; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
