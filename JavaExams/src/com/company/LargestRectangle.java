package com.company;

import java.util.Stack;

public class LargestRectangle
{
    public static void main(String[] args) {
        int [] height = {2,1,2};
        System.out.println(Solution.largestRectangleArea(height));

    }
}
class Solution {
    public static int largestRectangleArea(int[] heights)
    {
        int [] height2 = new int[heights.length + 1];
        for (int i = 0; i < heights.length; i++) {
            height2[i] = heights[i];
        }
        height2[height2.length-1] = 0;
        int index = 0;
        int MAX = 0;
        int currMax = 0;
        int start = 0;
        int end = 0;
        Stack<Integer> s = new Stack<>();
        while (index < height2.length){

            if (s.isEmpty() || height2[ s.peek()] <= height2[index]){
                s.push(index);
                index++;
            }
            else {
                start = index;
                end = s.pop();
                currMax = (start-end)*height2[end];
                if (currMax > MAX){
                    MAX = currMax;
                }
            }
        }
        return MAX;
    }
}