package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> num = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        num = Stream.generate(() -> 0).limit(n).collect(Collectors.toList());
        nexPerm(num, visited, n, 0);
    }

    static void  nexPerm(List<Integer> numbers, HashSet<Integer> visited, int n, int index) {
        if (index == n){
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (visited.contains(i)) {
                continue;
            }
            numbers.set(index, i);
            visited.add(i);
            nexPerm(numbers, visited, n, index + 1);
            visited.remove(i);
        }
    }
}
