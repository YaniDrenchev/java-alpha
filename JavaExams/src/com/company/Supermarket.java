package com.company;

import com.sun.jndi.ldap.ext.StartTlsResponseImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Supermarket {
    public static StringBuilder result = new StringBuilder();
    public static  LinkedList<String> names1= new LinkedList<>();
    public static HashMap<String, Integer> names  = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean buffer = true;

        while(buffer ) {
            String line[] = reader.readLine().split(" ");
            String command = line[0];
            switch (command){
                case "Append":
                    handleAppendCommand(line);
                    break;
                case "Insert":
                    handleInsertCommand(line);
                    break;
                case "Find":
                    handleFindCommand(line);
                    break;
                case "Serve":
                    handleServeCommand(line);
                    break;
                case "End":
                    buffer=false;
                    break;
            }


        }
        System.out.println(result);
    }

    private static void handleServeCommand(String line[]) {
        int count = Integer.parseInt(line[1]);
        if (names1.size() < count){
            result.append("Error\n");
        }else {
            for (int i = 0; i < count; i++) {
               String served =  names1.removeFirst();
               int value = names.get(served)-1;
               names.put(served, value);
               if (i == count -1){
                   result.append(served + "\n");
               }else {
                   result.append(served + " ");
               }
            }

        }

    }

    private static void handleFindCommand(String line []) {
        String name = line[1];
        if (!names.containsKey(name)){
            result.append("0\n");
        }else {
            result.append(names.get(name) + "\n");
        }
    }

    private static void handleInsertCommand(String line[]) {
        int position = Integer.parseInt(line[1]);
        String name = line[2];
        if (names1.size()<position){
            result.append("Error\n");
        }
        else{
            if (!names.containsKey(name)){
                names.put(name, 1);
            }else {
                int number = names.get(name) +1;
                names.put(name, number);
            }
            names1.add(position, name);
            result.append("OK\n");
        }
    }

    private static void handleAppendCommand(String line[]) {
        String name = line[1];
        if (!names.containsKey(name)){
            names.put(name, 1);
        }else {
           int number = names.get(name) +1;
           names.put(name, number);
        }
        names1.addLast(name);
        result.append("OK\n");
    }
}
