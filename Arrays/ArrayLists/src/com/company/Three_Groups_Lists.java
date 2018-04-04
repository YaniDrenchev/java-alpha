package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Three_Groups_Lists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().trim().split(" ");
        int[] numbers = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
        groups.add(new ArrayList<>());
        groups.add(new ArrayList<>());
        groups.add(new ArrayList<>());

        for (int i = 0; i < strs.length; i++) {
            int x = Integer.parseInt(strs[i]);
            int index = numbers[i]%3;
            ArrayList<Integer> group = groups.get(index);
            group.add(x);
        }

        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).size() == 0) {
                continue;
            }else {
                for (int j = 0; j < groups.get(i).size(); j++) {
                    System.out.print(groups.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
