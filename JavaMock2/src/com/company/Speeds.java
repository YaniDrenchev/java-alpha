package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int cars[] = new int[a];
        for (int i = 0; i < a; i++) {
            cars[i] = scan.nextInt();
        }
        int cars2[] = new int[a];
        System.arraycopy( cars, 0, cars2, 0, cars.length );

//        for (int i = 0; i < cars.length / 2; i++) {
//            int temp = cars[i];
//            cars[i] = cars[cars.length - i - 1];
//            cars[cars.length - i - 1] = temp;
//        }
        for(int i = cars.length - 1; i  >= 0; i--){
            if (i == 0){
                break;
            }
            int buffer = cars[i-1];
            if (cars[i] > cars[i-1]){
                cars[i] = buffer;
            }
        }
        for(int i = cars.length - 1; i  >= 0; i--){
            if (i == 0){
                break;
            }
            int buffer = cars[i-1];
            if (cars[i] > cars[i-1]){
                cars[i] = buffer;
            }
        }
        if (cars[0] < cars[1]){
            int buffer = cars[0];
            cars[1] = buffer;
        }
        int biggest =0 ;
        int maxSum = 0;
        int group = 0;
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
           if (cars[i] == cars[i+1]){
               if (cars2[i] == cars[i+1]){
                   sum=0;
               }else{
                   sum = sum+cars2[i];
               }
               group++;
               if (biggest == group){
                   for (int a = 0; a <=  )
               }
               biggest = Math.max(group,biggest);
           }else{
               group=0;
           }
        }
    }
}
