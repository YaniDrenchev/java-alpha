package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Joro_the_rabbit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lines = scan.nextLine();
        String[] strs = lines.trim().split(", ");
        ArrayList<Integer> num = new ArrayList<>();
        for (String str : strs) {
            num.add(Integer.parseInt(str));
        }
        int MaxRoute = 0;
        int index = 0;
        int CurrRoute = 0;
        for (int position = 0; position < num.size(); position++) {
            for (int step = 1; step < num.size()+1; step++) {
                CurrRoute = 0;
                ArrayList<Integer> visited = new ArrayList<>();
                index = position;
                for (int i = 0; i <= num.size() ; i++){
                    int nextIndex;
                    CurrRoute++;
                    nextIndex = (index + step) % num.size();
                    if (num.get(nextIndex) <= num.get(index)){
                        break;
                    }
                    index = nextIndex;
                }
                MaxRoute = Math.max(CurrRoute, MaxRoute);
            }
        }
        System.out.println(MaxRoute);
    }
}
