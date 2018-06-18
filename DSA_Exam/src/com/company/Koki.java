package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koki {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lenght = Integer.parseInt(reader.readLine());
        int[] building = new int[lenght];
//        LinkedNode start = new LinkedNode(-1);
        String line[] = reader.readLine().split(" ");
        for (int i = 0; i < building.length; i++) {
            building[i] = Integer.parseInt(line[i]);
//            start.next = new LinkedNode(building[i]);
//            start = start.next;
        }
        int jumps[] = new int[lenght];
        int maxJumps =0;

        for (int i = 0; i < building.length; i++) {
            int curr = 0;
            int buildingHeigh = building[i];
            for (int j = i; j < building.length; j++) {
                if (buildingHeigh < building[j]){
                    curr++;
                    buildingHeigh = building[j];
                }
            }
            jumps[i] = curr;
            if (curr > maxJumps){
                maxJumps = curr;

            }
        }
        StringBuilder result = new StringBuilder();
        System.out.println(maxJumps);
        for (int i = 0; i < jumps.length; i++) {
            if (i != jumps.length-1){
                result.append(jumps[i]);
                result.append(" ");
            }else {
                result.append(jumps[i]);
            }
        }
        System.out.println(result);
    }

}





