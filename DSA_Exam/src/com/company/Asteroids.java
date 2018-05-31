package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Asteroids {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int buffer = Integer.parseInt(reader.readLine());
        System.out.println(buffer);
    }

    public int[] asteroidCollision(int[] asteroids) {
        // use linked lists or Stack
        // get the directions
        // check if its moving right or left and add them to the LinkedList
        // add to the list the one which is moving to the left
        //
        return asteroids;
    }
}
