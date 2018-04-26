package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String str[] = line.trim().split("");
        String[] numbers1 = line.replaceAll("[^0-9]+", " ").trim().split(" ");
        int numbers[] = new int[numbers1.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbers1[i]);
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            result.add(str[i]);
        }
        int MAX = numbers.length;

        for (int Main = 0; Main < numbers.length; Main++) {
            ArrayList<String> newResult = new ArrayList<String>();
            int counts = 0;
            while (counts < MAX) {
                int index1 = 0;
                int index2 = 0;
                int numberSeq = 0;
                if (counts == MAX-1) {
                    for (int i = 0; i < result.size(); i++) {
                        if (result.get(i).equals("}")) {
                            index2 = i;
                            break;
                        }

                    }
                    for (int i = index2; i >=0 ; i--) {
                        if (result.get(i).equals("{")) {
                            index1 = i;
                            break;
                        }
                    }
                    result.remove(index1);
                    if (index2 == result.size()){
                        index2-=1;
                    }
                   result.remove(index2-1);
                    for (int i = 0; i < numbers[MAX-1]-1; i++) {
                        for (int j = index1; j <= index2-1 ; j++) {
                            if (result.get(j).equals("}")){
                                continue;
                            }
                            newResult.add(result.get(j));
                        }
                    }
                    int index = index1;
                    for (int i = 0; i < newResult.size(); i++) {
                        if (index > result.size()-1){
                            result.add(newResult.get(i));
                        }else {
                            result.add(index, newResult.get(i));
                            index++;
                        }
                    }

                } else {
                    counts++;
                    continue;
                }
                counts++;

            }
            MAX--;
        }
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            finalResult.append(result.get(i));
        }
        finalResult = new StringBuilder(finalResult.toString().replaceAll("[^A-Za-z]", ""));
        System.out.println(finalResult);
    }


}

