package com.compan;

import java.util.*;

public class UnitsOfWorks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] command = line.split(" ");
        String comand = command[0];
//        HashSet<Unit> allUnits = new HashSet<>();
//        HashSet<String> names = new HashSet<>();
        HashMap<String, Unit> units = new HashMap<>();
        switch (comand) {
            case "add":
                if (units.keySet().contains(command[1])) {
                    System.out.printf("FAIL: %s already exists!", command[1]);
                } else {
                    units.put(command[1],new Unit(command[2], Integer.parseInt(command[3])));

                }
                break;
            case "remove":
                String name = command[1];
                if (units.containsKey(name)){
                    units.remove(name);
                    System.out.printf("SUCCESS: %s removed!", name);
                }else {
                    System.out.printf("FAIL: %s could not be found!", name);
                }
                break;
            case "find":
                break;
            case "power":
                break;
        }
    }
}

class Unit {

    private String type;
    private int attack;


    public Unit(String type, int attack) {
        this.type = type;
        this.attack = attack;
    }

}
