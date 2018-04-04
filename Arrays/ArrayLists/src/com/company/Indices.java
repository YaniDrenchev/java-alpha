package com.company;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Indices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> num = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            num.add(scan.nextInt());
        }
        int index = 0;
        int x = 0;
        int y = 0;
        int current = 0;
        ArrayList<String> result = new ArrayList<>();
        result.add("0");
        while (index < num.size()) {
            if (num.get(index) < num.size()){
                x = num.get(index);
                result.add(String.valueOf(x));
            }
            if (current < index) {
                result.add(current,")");
                result.add(index,"(");
                break;
            } else if (num.get(index) > num.size()) {
                break;
            }
            current = index;
            index = num.get(index);
        }
        for (String aResult : result) {
            System.out.print(aResult);
        }
    }
}
