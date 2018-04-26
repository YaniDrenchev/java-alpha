package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SuperHero SuperMan = new SuperHero("Superman", 80, Gender.FEMALE,
                "Klark", "Dead", State.GOOD, new ArrayList<String>());
        SuperVilian Joker = new SuperVilian("Joker", 50, Gender.OTHER,
                "Joker", "Dead", State.BAD, new ArrayList<String>());
        SuperMan.addSuperPower("Umriiii");
        Joker.canFly("Messege");
        Joker.addSuperPower("adsadasd");
    }
}
