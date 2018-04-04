package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Primes_to_N {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for (int number = 1; number < n + 1; number++) {
                if (isPrime(number)){
                    System.out.print(number + " ");
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

