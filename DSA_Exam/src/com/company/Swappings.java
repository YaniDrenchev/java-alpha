package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Swappings {
    public static int [] newArray;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        newArray = new int[number];
        for (int i = 0; i < number; i++) {
            numbers.add(i+1);
            newArray[i] = i+1;
        }
        String [] line  = reader.readLine().split(" ");
        int [] rotations = new int[line.length];
        for (int i = 0; i < line.length ; i++) {
            rotations[i] = Integer.parseInt(line[i]);
         }

        int buffer = 0;
        while (buffer < rotations.length){
            Queue<Integer> queue = new ArrayDeque<>();
//            int nextNumber = Integer.parseInt(reader.readLine());
            for (int i :newArray) {
                if (i == rotations[buffer]){
                    ((ArrayDeque<Integer>) queue).addLast(i);
                    break;
                }
                ((ArrayDeque<Integer>) queue).addLast(i);
            }
            int queuesize = queue.size();
            for (int i = 0; i < queuesize; i++) {
                int numberToBeAdded = ((ArrayDeque<Integer>) queue).removeLast();
                newArray[newArray.length-i-1] = numberToBeAdded;
            }
            for (int i =0; i < numbers.size(); i++) {
              if (numbers.get(i) == rotations[buffer]){
                  for (int j = 0; j < numbers.size(); j++) {
                      if (i+j > numbers.size()){
                          break;
                      }
                      newArray[j] = numbers.get(i+j);
                  }
              }
              break;
            }
            buffer++;
        }
        Arrays.stream(newArray).forEach(System.out::print);
    }
}
