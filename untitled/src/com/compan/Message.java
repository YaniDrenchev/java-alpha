package com.compan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        String nextLine = scan.nextLine();
        String str[] = nextLine.split("");
        for (int i = 0; i < str.length; i++) {
            a.add(str[i]);
        }
        scan.nextLine().chars().forEach(x -> a.add((char) x));
        a.stream().filter(Character::isDigit).collect(Collectors.toList());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a);
        }
    }
}
