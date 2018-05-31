package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Units_of_Work {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int target = reader.read();
        while (true) {
            String line = reader.readLine();
            String[] command = line.split(" ");
            String comand = command[0];
//        HashSet<Unit> allUnits = new HashSet<>();
//        HashSet<String> names = new HashSet<>();
            TreeSet<Unit> orderdUnits = new TreeSet<>();
            HashMap<String, Unit> units = new HashMap<>();
            HashMap<String, TreeSet<Unit>> orderedUnitsByType = new HashMap<>();
            switch (comand) {
                case "add":
                    if (units.keySet().contains(command[1])) {
                        System.out.printf("FAIL: %s already exists!", command[1]);
                    } else {

                        units.put(command[1], new Unit(command[1], command[2], Integer.parseInt(command[3])));
                        orderdUnits.add(new Unit(command[1],command[2], Integer.parseInt(command[3])));
                    }
                    break;
                case "remove":
                    String name = command[1];
                    if (units.containsKey(name)) {
                        units.remove(name);
                        System.out.printf("SUCCESS: %s removed!", name);
                    } else {
                        System.out.printf("FAIL: %s could not be found!", name);
                    }
                    break;
                case "find":

                    break;
                case "power":
                    orderdUnits.forEach(System.out::println);
                    break;
                case "end":
                    return;
            }
        }
    }
}

class Unit implements Comparable {

     String type;
     int attack;
     String name;


    public Unit(String name, String type, int attack) {
        this.type = type;
        this.attack = attack;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s[%s](%s)", type, attack);
    }
    public int compareTo(Object o){
        Unit unit = (Unit) o;
        int attacCompare = Integer.compare(this.attack, unit.attack);
        if (attacCompare != 0){
            return -attacCompare;
        }
        return this.name.compareTo(unit.name);
    }
}

