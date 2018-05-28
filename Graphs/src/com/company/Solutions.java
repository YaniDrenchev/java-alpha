package com.company;

import java.util.Stack;

public class Solutions {

    public int[][] floodFill(int[][] image,
                             int sr, int sc, int newColor) {


        Stack<Integer> stack = new Stack<>();
        Boolean[] used = new Boolean[image.length];
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
        image[sr][sc] = newColor;
        stack.push(1);
        used[1] = true;

        while (!stack.isEmpty()){
            int node = stack.peek();
        }
        return image;
    }
}
