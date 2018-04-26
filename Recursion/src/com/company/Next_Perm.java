package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Next_Perm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String line = scan.nextLine();
        String str [] = line.trim().split(" ");
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            visited.add(Integer.parseInt(str[i]));
        }
        List<Integer> num = new ArrayList<>();
        num = Stream.generate(() -> 0).limit(n).collect(Collectors.toList());
        visited.remove(n);
        nexPerm(num, visited, n, 0);
    }

    static void  nexPerm(List<Integer> numbers, HashSet<Integer> visited, int n, int index) {
        if (index == n){
            for (Integer number : numbers) {
                System.out.print(number + " ");
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
