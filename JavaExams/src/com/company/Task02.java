package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String contains = reader.readLine();
        String contans[] = contains.split("");
        String toCheck = reader.readLine();
        String toCheckArr[] = toCheck.split("");
        int index = 0;
        boolean subSequence = false;
        for (int i = 0; i < contans.length; i++) {
            subSequence = false;
            String letter = contans[i];
            toCheckArr = toCheck.split("");
            for (int j = 0; j < toCheckArr.length; j++) {
                if (toCheckArr[j].equals(letter)){
                    index = j;
                    subSequence = true;
                    break;
                }
            }
            if (!subSequence){
                System.out.println("false");
                return;
            }
            if (contains.length() > 0) {
                toCheck = toCheck.substring(index+1, toCheck.length());
            }else {
                System.out.println("true");
                return;
            }
        }
        System.out.println(subSequence);
    }
}
