package com.compan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        IntStream.range(0, n).boxed().map(x -> x*5).forEach(System.out::println);

    }
}
