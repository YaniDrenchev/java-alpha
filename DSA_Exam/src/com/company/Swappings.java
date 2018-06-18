package com.company;

import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Swappings {
    public static int[] numbersArray;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String line [] = reader.readLine().split(" ");
        int swapping [] = new int[line.length];

        NodeLinked start1 = new NodeLinked(-1);
        NodeLinked start2 = new NodeLinked(-1);
        int index = 0;

        for (int i = 0; i < line.length; i++) {
            swapping[i] = Integer.parseInt(line[i]);
        }
        numbersArray = new int[number];
        for (int i = 0; i < number; i++) {
            numbersArray[i] = i+1;
        }


        for (int i = 0; i < swapping.length; i++) {
            int magicNumber = 2;
            int numberToBeSwapped = swapping[i];
            NodeLinked list;
            if (numberToBeSwapped != numbersArray[0] ){
                magicNumber = 1;
            }else if (numberToBeSwapped == numbersArray[numbersArray.length-1]){
                magicNumber = 0;
            }
            if (numberToBeSwapped != numbersArray[0]) {
                list = new NodeLinked(numbersArray[0]);
            }
            else {
                list = new NodeLinked(numbersArray[1]);
            }
            start1.next = list;
            if (numberToBeSwapped != numbersArray[0]) {
                for (int j = magicNumber; j < numbersArray.length; j++) {
                    if (numberToBeSwapped == numbersArray[j]) {
                        index = j;
                        break;
                    }
                    list.next = new NodeLinked(numbersArray[j]);
                    list = list.next;
                }
            }else {
                for (int j = magicNumber; j < numbersArray.length; j++) {
                    if (j == numbersArray.length -1 && numberToBeSwapped == numbersArray[numbersArray.length -1]){
                        break;
                    }
                    list.next = new NodeLinked(numbersArray[j]);
                    list = list.next;
                }
            }
            if (numberToBeSwapped != numbersArray[0] && numberToBeSwapped!=numbersArray[numbersArray.length -1]) {
                NodeLinked list2 = new NodeLinked(numbersArray[index + 1]);
                start2.next = list2;
                for (int k = index + 2; k < numbersArray.length; k++) {
                    list2.next = new NodeLinked(numbersArray[k]);
                    list2 = list2.next;
                }
            }

            int buffer = 0;
            if (numberToBeSwapped != numbersArray[0] && numberToBeSwapped!=numbersArray[numbersArray.length -1]) {
                while (start2.next != null) {
                    numbersArray[buffer] = start2.next.val;
                    start2 = start2.next;
                    buffer++;
                }
                buffer++;
                numbersArray[buffer - 1] = swapping[i];

                while (start1.next != null) {
                    numbersArray[buffer] = start1.next.val;
                    start1 = start1.next;
                    buffer++;
                }
            }else {
                int lastNumber = numbersArray[numbersArray.length -1];
                if (numberToBeSwapped== lastNumber){
                    numbersArray[buffer] = numberToBeSwapped;
                    buffer++;
                }
                while (start1.next != null){
                    numbersArray[buffer] = start1.next.val;
                    start1 = start1.next;
                    buffer++;
                }
                if (numberToBeSwapped != lastNumber) {
                    numbersArray[buffer] = numberToBeSwapped;
                }
            }

        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbersArray.length; i++) {
            result.append(numbersArray[i]);
            if (i == numbersArray.length-1){
                break;
            }
            result.append(" ");
        }
        System.out.println(result);
    }

}
    class NodeLinked{
        int val;
        NodeLinked next;
        NodeLinked previous;

        NodeLinked(int val){
            next = null;
            previous = null;
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("%d", val);
        }
    }
