package com.company;

public class Power {
    private PowerType powerType;
    private String name;

    public Power(PowerType powerType, String name){
        if (name.trim().length() > 20 || name.trim().length() < 3){
            System.out.println("Incorrect name of Power, please choose another");
        }
        this.name = name;
        this.powerType= powerType;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public String getName() {
        return name;
    }
}
    