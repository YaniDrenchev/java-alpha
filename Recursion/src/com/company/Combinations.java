package com.company;

import sun.util.resources.cldr.uk.CurrencyNames_uk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<ArrayList> comb = new ArrayList<>();
        int current [] = new int[k];
        nextCombination(n, k, current, 0, 1 );
    }

}
