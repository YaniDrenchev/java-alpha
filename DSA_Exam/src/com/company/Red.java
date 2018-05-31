package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Red {
    private static int n;
    private static int[] money;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int maxMoney = 0;
    private static int bestNode = 0;
    private static StringBuilder result;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        money = new int[n];
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        String line = reader.readLine();
        String[] str = line.split(" ");
        for (int i = 0; i < n - 1; i++) {
            money[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            String route = reader.readLine();
            String[] nums = route.split(" ");
            int a = Integer.parseInt(nums[0]) -1;
            int b = Integer.parseInt(nums[1]) -1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        maxMoney = 0;
        dfs(0, -1,0 );
        maxMoney=0;
        dfs(bestNode, -1,0 );
        System.out.println(maxMoney);
    }

    public static void dfs(int x, int previous, int currMoney) {
        currMoney += money[x];
        boolean hasNext = false;
        for (int i: graph.get(x)) {
            if (i != previous) {
                hasNext = true;
                dfs(i, x, currMoney);
            }
        }
        if (!hasNext) {
           if (maxMoney < currMoney){
               maxMoney = currMoney;
               bestNode = x;
           }
        }
    }
}
