package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SuperHero Batman = new SuperHero("Batman", "Bruce Wayne", Alignment.GOOD);
        Power kryptonite = new Power(PowerType.CHEMICAL, "Kryptonite");
        Batman.addPower(kryptonite);

        SuperHero Superman = new SuperHero("Superman", "Jurnalist", Alignment.GOOD);
        Superman.addImmunities(PowerType.CHEMICAL);
        Batman.attack(Superman, kryptonite);
        System.out.println(Superman.getLifePoints());

    }
}
