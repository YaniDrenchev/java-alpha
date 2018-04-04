package com.company;

import java.util.Scanner;

public class Three_Groups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().trim().split(" ");
        int[] numbers = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int zeros = 0;
        int two = 0;
        int three = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                zeros++;
            } else if (numbers[i] % 3 == 1) {
                two++;
            } else {
                three++;
            }
        }
        int answer[][] = {
                new int[zeros],
                new int[two],
                new int[three],
        };
        int index0 = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                answer[0][index0] = numbers[i];
                index0++;
            } else if (numbers[i] % 3 == 1) {
                answer[1][index1] = numbers[i];
                index1++;
            } else {
                answer[2][index2] = numbers[i];
                index2++;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i].length == 0) {
                continue;
            }else {
                for (int j = 0; j < answer[i].length; j++) {
                    System.out.print(answer[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
