package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Tribonachi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger first = new BigInteger(String.valueOf(scan.nextBigInteger()));
        BigInteger second = new BigInteger(String.valueOf(scan.nextBigInteger()));
        BigInteger third = new BigInteger(String.valueOf(scan.nextBigInteger()));
        int limit = scan.nextInt();
        System.out.println(nextTribonachi(first, second, third, limit, 3));
    }

    static BigInteger nextTribonachi(BigInteger first, BigInteger second, BigInteger third, int limit, int number) {
        BigInteger tribonachi = first.add(second);
        tribonachi = third.add(tribonachi);
        if (limit == number + 1) {
            return tribonachi;
        }
        if (limit == number) {
            return third;
        }
        BigInteger buffer;
        buffer = third;
        first = second;
        second = buffer;
        third = tribonachi;
        return nextTribonachi(first, second, third, limit, number + 1);
    }
}
