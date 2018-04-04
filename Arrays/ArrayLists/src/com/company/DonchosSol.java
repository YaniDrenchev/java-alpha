package com.company;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DonchosSol {
    static void fakeInput() {
        String test = "6\n" +
                "1 2 3 5 7 8";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }

    public static void main(String[] args) {
        fakeInput();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> num = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            num.add(scan.nextInt());
        }
        int index = 0;
        boolean loop = false;
        ArrayList<Integer> result = new ArrayList<>();
        while (0 <= index && index < num.size()) {
            if (result.contains(index)) {
                loop = true;
                break;
            }
            result.add(index);
            index = num.get(index);
        }
        if (loop) {
            String toPrint = "";
            for (int i = 0; i < result.size(); i++) {
                if (i == index) {
                    toPrint += "(";

                } else {
                    toPrint += "";
                }
            }
        } else {
            String toPrint = result.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "));
            System.out.println(toPrint);
        }
    }
}
