package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Asteroids {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int buffer = Integer.parseInt(reader.readLine());
        Arrays.stream(asteroidCollision(new int[]{-2, -1, 1, 2})).forEach(System.out::print);
    }


    public static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> movingAsteroid = new LinkedList<>();
        for (int i = 0; i < asteroids.length; i++) {
            movingAsteroid.addLast(asteroids[i]);
            if (movingAsteroid.getLast() < 0){
                while (!movingAsteroid.isEmpty() && movingAsteroid.size() > 1){
                    int right = movingAsteroid.removeLast();
                    int left = movingAsteroid.removeLast();
                    if (left > 0 && right < 0){
                        if (left > -1 *right){
                            movingAsteroid.addLast(left);
                        }
                        if (left < -1 * right){
                            movingAsteroid.addLast(right);
                        }
                    }else {
                        movingAsteroid.addLast(left);
                        movingAsteroid.addLast(right);
                        break;
                    }

                }
            }
        }
        int [] newAsteroid = new int [movingAsteroid.size()];
        for (int i = 0; i < movingAsteroid.size(); i++) {
            newAsteroid[i] = movingAsteroid.get(i);
        }
        return newAsteroid;
    }
}
