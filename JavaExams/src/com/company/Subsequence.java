package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] numbers = {4, 6, 7, 7};
        dfs(numbers, 0);
        for (List list :
                res) {
            list.forEach(System.out::print);
            System.out.println();
        }

    }

    public static void dfs(int[] nums, int index) {


        for (int i = index; i < nums.length - 1; i++) {
            List<Integer> comb = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    comb.add(nums[j]);
                }
            }
            if (comb.size() >= 2) {
                res.add((ArrayList<Integer>) comb);
            }
            dfs(nums, index+=1);
        }
    }

    static class Solution {


    }


}

