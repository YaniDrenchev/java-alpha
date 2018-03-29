package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int k = scan.nextInt();
	int maxSum = 0;
	int[] numbers = new int[n];
	for (int i = 0; i< numbers.length; i++){
	    numbers[i] = scan.nextInt();
    }
        Arrays.sort(numbers);
        int  a = 1;
	for (int i = 0; i<k; i++ ){
        maxSum = maxSum + numbers[n-a];
        a++;
    }
		System.out.println(maxSum);
    }
}
