package com.company;

import com.sun.media.sound.SoftTuning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static StringBuilder result = new StringBuilder();
    public static int prevousNumber = -1;
    public static int levelOfNasting = 0;
    public static int buffer = 0;
    public static String key = "";
    public static int number = 0;
    public static int oppenedTag = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        Queue<String> oppenedTags = new ArrayDeque<>();
        ArrayList<String> keys = new ArrayList<>();
        HashMap<String, Integer> code = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String line[] = reader.readLine().split("");
            code.put(line[0], Integer.valueOf(line[1]));
            keys.add(line[0]);
        }

        int buffer2 = 0;
        while (N * 2 > buffer2) {
            if (buffer < N) {
                key = keys.get(buffer);
                number = code.get(key);
            }
            if (buffer == N) {
                while (!oppenedTags.isEmpty()) {
                    String key1 = ((ArrayDeque<String>) oppenedTags).removeLast();
                    levelOfNasting--;
                    for (int i = 0; i < levelOfNasting; i++) {
                        result.append(" ");
                    }
                    result.append("</" + key1 + code.get(key1) + ">\n");
                    levelOfNasting--;
                    prevousNumber = number;
                    buffer2++;
                }
                break;
            }

            if (oppenedTag < number) {
                for (int i = 0; i < levelOfNasting; i++) {
                    result.append(" ");
                }
                result.append("<" + key + number + ">\n");
                oppenedTag = number;
                buffer2++;
                buffer++;

            }
            if (levelOfNasting == 0) {
                result.append("<" + key + number + ">\n");
                oppenedTags.add(key);
                levelOfNasting++;
                buffer++;
                buffer2++;
                oppenedTag = number;
                continue;

            }
            if (oppenedTag >= number && oppenedTags.size() > 1) {
                String toAdd = ((ArrayDeque<String>) oppenedTags).removeLast();
                levelOfNasting--;
                for (int i = 0; i < levelOfNasting; i++) {
                    result.append(" ");
                }

                result.append("</" + toAdd + code.get(toAdd) + ">\n");
                oppenedTag = code.get(((ArrayDeque<String>) oppenedTags).getLast());

                buffer2++;

                continue;
            }
            if (oppenedTag > number && oppenedTags.size() == 1) {

                String toAdd = ((ArrayDeque<String>) oppenedTags).removeLast();
                for (int i = 0; i < levelOfNasting; i++) {
                    result.append(" ");
                }
                result.append("</" + toAdd + code.get(toAdd) + ">\n");
                for (int i = 0; i < levelOfNasting; i++) {
                    result.append(" ");
                }
                levelOfNasting=0;
                buffer2++;
                continue;
            }
            if (number >= oppenedTag) {
                for (int i = 0; i < levelOfNasting; i++) {
                    result.append(" ");
                }
                result.append("<" + key + number + ">\n");
                oppenedTags.add(key);
                levelOfNasting++;
                buffer2++;
                buffer++;
                oppenedTag = number;
                continue;
            }




        }
        System.out.println(result);
    }
}
