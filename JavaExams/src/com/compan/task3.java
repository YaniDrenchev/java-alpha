package com.compan;

import java.math.BigInteger;
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        HashSet<List> visited = new HashSet<>();
        List<Integer> variations = new ArrayList<>();
        ArrayList<ArrayList> allVariations = new ArrayList<ArrayList>();
        for (int i = 0; i < max; i++) {
            variations.add(A);
        }
            nexPerm(variations, visited, max, 0, B, A);


    }
    static void  nexPerm(List<Integer> numbers, HashSet<List> visited, int n, int index, int B, int A) {
        if (index == n){
            if (visited.contains(numbers)){
                return;
            }
            for (Integer number : numbers) {
                System.out.print(number + "");
            }
            System.out.println();
            visited.add(numbers);
            return;
        }
        for (int j = 0; j < 1<<n; j++) {
            for (int i = index; i < n; i++) {
                if (A < B) {
                    numbers.set(i, A);
                    if (visited.contains(numbers)) {
                        numbers.set(i, B);
                    }
                } else {
                    numbers.set(i, B);
                    if (visited.contains(numbers)) {
                        numbers.set(i, A);
                    }
                }
                nexPerm(numbers, visited, n, index + 1, B, A);
            }
        }

    }

}
