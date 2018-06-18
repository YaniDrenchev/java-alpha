package com.company;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Graph {
    public static HashMap<String, HashMap<String, ArrayList<String>>> names = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dependancies = Integer.parseInt(reader.readLine());
        for (int i = 0; i < dependancies; i++) {
            String line[] = reader.readLine().split(" ");
            String x = line[0];
            String y = line[1];
            String subjectArr[] = Arrays.copyOfRange(line, 2, line.length);
            String subject = "";
            for (int j = 0; j < subjectArr.length; j++) {
                subject = subject + subjectArr[j];
            }

            if (!names.containsKey(x)) {
                names.put(x, new HashMap<>());
                names.get(x).put(subject, new ArrayList<>());
                names.get(x).get(subject).add(y);
            } else {
                if (!names.get(x).containsKey(subject)) {
                    names.get(x).put(subject, new ArrayList<>());
                    names.get(x).get(subject).add(y);
                } else {
                    names.get(x).get(subject).add(y);
                }
            }
        }
        int lines = Integer.parseInt(reader.readLine());
        TreeSet<String> result = new TreeSet<>();
        for (int i = 0; i < lines; i++) {

            String line[] = reader.readLine().split(" ");
            String name = line[0];
            String subj = "";
            if (line.length > 2) {
                for (int j = 1; j < line.length; j++) {
                    subj = subj + line[j];
                }
            } else {
                subj = line[1];
            }
            if (names.get(name).containsKey(subj)) {
                result.add(name);
                dfs(names, name, subj, result);
            }
        }


    }

    public static void dfs(HashMap<String, HashMap<String, ArrayList<String>>> names, String name, String subject, TreeSet<String> result) {

            for (int i = 0; i < names.get(name).get(subject).size(); i++) {
                if (!names.keySet().contains(name)) {
                    continue;
                }
                String depends = names.get(name).get(subject).get(i);
                result.add(depends);
                if (names.keySet().contains(depends)) {
                    if (names.get(depends).containsKey(subject)) {
                        dfs(names, depends, subject, result);
                    }
                }
            }
            while (!result.isEmpty()){
                System.out.print(result.pollLast() + " ");
            }
            System.out.println();
            result.clear();
    }
}
