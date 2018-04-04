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
        int step = 1;
        int position = 0;
        int index = 0;
        int route = 1;
        int MaxRoute = 0;
        for (int i = 0; i < num.size() - 1; i++) {
            step = 1;
            route = 1;
            index = i;
            position = num.get(index);
            for (int j = 0; j < num.size(); j++) {
                route = 1;
                index = i;
                position = num.get(index);
                for (int k = 0; k < num.size() ; k++) {
                    if (index + step >= num.size()) {
                        index = (step - (num.size() - index));
                        if (position < num.get(Returnindex(index,num.size(),step))) {
                            route++;
                            position = Returnindex(index, num.size(), step);
                            index += step;
                            MaxRoute = Math.max(route, MaxRoute);
                        } else {
                            route = Math.max(route, MaxRoute);
                            break;
                        }
                    } else {
                        if (position < num.get(index + step)) {
                            route++;
                            position = num.get(index+step);
                            index = index + step;
                            MaxRoute = Math.max(route, MaxRoute);
                        } else {
                            MaxRoute = Math.max(route, MaxRoute);
                            break;
                        }
                    }
                }
                step++;
            }
            if (route >= MaxRoute) {
                MaxRoute = Math.max(route, MaxRoute);
            }
        }
        System.out.println(MaxRoute);
    }
    static int Returnindex(int index, int size, int step){
        if (index + step >= size){
            index = (step - (size - index));
            return index;
        }else {
            return index;
        }
    }
}
