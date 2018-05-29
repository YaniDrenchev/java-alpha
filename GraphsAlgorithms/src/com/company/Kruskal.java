package com.company;

import java.util.Comparator;
import java.util.List;

public class Kruskal {
    public static int [] kruskal (List<int []> graph, int node){
        int [] tree = new int[node];
        boolean[] used = new boolean[node];

        graph.sort(Comparator.comparingInt(x -> x[2]));
        for (int i = 0; i < graph.get(0).length; i++) {
            if (used[graph.get(i)[i]] && used[graph.get(i)[1]]){
                continue;
            }
            if (!used[graph.get(i)[i]] && !used[graph.get(i)[1]]){
                tree[graph.get(i)[0]] = graph.get(i)[1];
            }
            if (!used[graph.get(i)[i]] && used[graph.get(i)[1]]){
                tree[graph.get(i)[0]] = graph.get(i)[1];
            }
            if (used[graph.get(i)[i]] && !used[graph.get(i)[1]]){
                tree[graph.get(i)[1]] = graph.get(i)[0];
            }
            used[graph.get(i)[0]] = true;
            used[graph.get(i)[1]] = true;
        }
        return tree;
    }
}
