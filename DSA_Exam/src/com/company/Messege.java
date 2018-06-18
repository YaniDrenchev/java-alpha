package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Messege {
    static HashSet<String> visited = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String messege = reader.readLine();
        HashMap<Integer, String> encodedMessege = new HashMap<>();
        for (int i = 0; i < messege.length(); i++) {
            if (Character.isLetter(messege.charAt(i))) {
                String number = "";
                for (int j = i; j < messege.length(); j++) {
                    if (Character.isDigit(messege.charAt(j))){
                        number = number+messege.charAt(i);
                    }
                }
                encodedMessege.put(Integer.parseInt(number),String.valueOf(messege.charAt(i)));
            }
        }
        
    }
    public static void dfs(String messege, HashMap<Integer, String> decode){
        String newMessege = "";
        for (int i = 0; i < messege.length(); i++) {
            int numberToSearch = Integer.parseInt(String.valueOf(messege.charAt(i)));
            if (decode.containsKey(Integer.parseInt(String.valueOf(numberToSearch)))){
                newMessege = newMessege+decode.get(Integer.parseInt(String.valueOf(numberToSearch)));
            }
        }
    }
}
