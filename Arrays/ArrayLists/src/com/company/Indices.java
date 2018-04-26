package com.company;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Indices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> num = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            num.add(scan.nextInt());
        }
        int index = 0;

        boolean loop = false;
        String result = "";
        ArrayList<Integer> numbers = new ArrayList<>();
        if (num.get(0) != 0){
            numbers.add(0);
        }
        HashSet<Integer> visited = new HashSet<>();
        while (index < num.size()) {
            if (num.get(index) < num.size()){
                if (visited.contains(num.get(index))) {
                    loop = true;
                    index = num.get(index);
                    break;

                }
                numbers.add(num.get(index));
                visited.add(index);
            }
             else if (num.get(index) > num.size()) {
                break;
            }
            index = num.get(index);
        }

        if(loop) {
            for(int i = 0; i < numbers.size(); i++) {
                int a = numbers.get(i);
                if(index == a) {
                    result +=("(");
                }else {
                    result+=(" ");
                }
                result += (String.valueOf(a));
                if(i == numbers.size()-1) {
                    result+=(")");
                }
            }
        }else{
            for (Integer number : numbers) {
                result += (String.valueOf(number));
            }
        }
        result = result.trim();
        System.out.println(result);
    }
}
