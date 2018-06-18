package com.company;

import javafx.beans.binding.StringBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 [] = reader.readLine().split(",");
        String line2 [] = reader.readLine().split(",");
        StringBuilder res = new StringBuilder();
        HashSet numbers3 = new HashSet();
        HashSet numbers5 =new HashSet();
        LinkedList<Node> numbers1 = new LinkedList<>();
        LinkedList<Node> numbers2 = new LinkedList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        Node start1 = new Node(-1, -1);
        Node start2 = new Node(-1, -1);
        for (int i = 0; i < line1.length ; i++) {
            Node nodeToadd = new Node(Integer.parseInt(line1[i]), i);
            start1.next = nodeToadd;
            numbers1.add(nodeToadd);
            start1 = start1.next;
            num1.add(Integer.valueOf(line1[i]));
        }
        for (int i = 0; i < line2.length; i++) {
            Node nodeToadd = new Node(Integer.parseInt(line2[i]), i);
            start2.next = nodeToadd;
            numbers2.add(nodeToadd);
            start2 = start2.next;
            num2.add(Integer.valueOf(line2[i]));
        }
        Node li1node = null;
        int index = 0;
        if (numbers1.size() > 0) {
            li1node = numbers1.get(0);
        }
        else {
            res.append("-1");
            return;
        }
        Node li2node = null;

        boolean hasBigger = false;
        for (int i = 0; i < numbers2.size(); i++) {
            index = num2.indexOf(li1node.val);
            if (index < numbers2.size() && index > 0) {
                li2node = numbers2.get(index);
            }

            hasBigger = false;
            for (int j = index; j < numbers2.size(); j++) {
                li2node = numbers2.get(j);
                if (li2node.val > li1node.val){
                    res.append(li2node.val + ",");
                    hasBigger=true;
                    break;
                }
            }
            if (!hasBigger){
                res.append("-1,");
            }
            if (li1node.next!= null) {
               li1node = li1node.next;
            }else {
                break;
            }
        }
        if (res.length()>0) {
            res.replace(res.length() - 1, res.length(), "");
        }
        System.out.println(res);
    }

    static class Node{
        Node next;
        int val;
        int index;
        Node(int val, int index){
            this.next = null;
            this.val  = val;
            this.index = index;
        }
    }
}
