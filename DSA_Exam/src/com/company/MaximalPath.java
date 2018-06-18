package com.company;

import jdk.nashorn.api.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MaximalPath {
    public static int MaxSum;
    public static HashSet<Integer> added = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, ArrayList<Integer>> parents = new HashMap<>();

        int nodes = Integer.parseInt(reader.readLine());
        int buffer = 0;
        while (buffer < nodes - 1) {

            Integer parrent = 0;
            Integer child = 0;

            String[] input = reader.readLine().replaceAll("[^?0-9]+", " ").split(" ");

            parrent = Integer.parseInt(input[1]);
            child = Integer.parseInt(input[2]);

            if (parents.keySet().contains(parrent)) {
                parents.get(parrent).add(child);

            } else {
                parents.put(parrent, new ArrayList<>());
                parents.get(parrent).add(child);
            }

            buffer++;
        }

        int firstParrent = findParrent(parents);
        added.add(firstParrent);
        dfs(0, parents, firstParrent, -1);
//        System.out.println(firstParrent);

        System.out.println(MaxSum + firstParrent);
    }

    public static void dfs(int curr, HashMap<Integer, ArrayList<Integer>> tree, int x, int previus) {

        int getLeafs = 0;
        int leafsCount = 0;
        for (int i = 0; i < tree.get(x).size(); i++) {

            getLeafs = tree.get(x).size();

                if (tree.containsKey(tree.get(x).get(i))) {
                    if (!added.contains(tree.get(x).get(i)) ) {
                        curr += tree.get(x).get(i);
                    }
                    if (MaxSum < curr) {
                        MaxSum = curr;
                    }
                    added.add(tree.get(x).get(i));
                    dfs(curr, tree, tree.get(x).get(i), x);
                } else  {
                    int max = 0;
                    for (int j = 0; j < tree.get(x).size(); j++) {
                        if (!tree.containsKey(tree.get(x).get(j))) {
                            if (tree.get(x).get(j) >= max) {
                                max = tree.get(x).get(j);
                                curr += max;
                                leafsCount++;
                            }
                        }
                    }
                }

//            }
        }
    }

    public static int findParrent(HashMap<Integer, ArrayList<Integer>> tree) {
        int parrent = 0;
        int counter = 0;
        for (int key :
                tree.keySet()) {
            for (int key2 :
                    tree.keySet()) {
                if (!tree.get(key2).contains(key)) {
                    counter++;
                }
            }
            if (counter == tree.keySet().size()) {
                parrent = key;
                break;
            } else {
                counter = 0;
            }
        }

        return parrent;
    }
}
