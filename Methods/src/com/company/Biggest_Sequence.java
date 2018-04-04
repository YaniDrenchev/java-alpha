package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Biggest_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scan.nextInt());
        }
        Integer maxSequence = 0;
        int sequence = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1).equals(nums.get(i))) {
                sequence++;
                maxSequence = Math.max(sequence, maxSequence);
            } else {
                maxSequence = Math.max(sequence, maxSequence);
                sequence = 0;
            }
        }
        System.out.println(maxSequence+1);
    }
}
