package com.company;

import java.util.ArrayList;

public class SuperHero {
    private String name;
    private String secretIdentity;
    private Alignment alignment;
    private int lifePoints = 100;
    private ArrayList<Power> powerList;
    private ArrayList<PowerType> immunities;

    public SuperHero(String name, String secretIdentity,
                     Alignment alignment) throws IllegalArgumentException {
        if (((name.trim().length() > 60 || name.trim().length() < 3))
               || ((secretIdentity.trim().length() > 60 || secretIdentity.trim().length() < 3))) {
            throw new IllegalArgumentException ("Incorrect argument , please choose another name or secretIdentity");
        } else {
            this.name = name;
            this.secretIdentity = secretIdentity;
            this.alignment = alignment;
            this.powerList = new ArrayList<>();
            this.immunities = new ArrayList<>();
        }

    }
    public void addPower(Power superpower) {
        powerList.add(superpower);
    }
    public void addPower(String name, PowerType powerType) {
        powerList.add(new Power(powerType, name));
    }

    public ArrayList<PowerType> getImmunities() {
        return immunities;
    }
    public void attack(SuperHero enemy, Power power){
        if (containPower(power)) {
            if (enemy.immunities.contains(power.getPowerType())) {
                System.out.println("Immune");
            } else {
                enemy.setLifePoints();
            }
        }else {
            System.out.println("This hero cant use this ability");
        }
    }
    private boolean containPower(Power powe){
        for (int i = 0; i < powerList.size(); i++) {
            if(powerList.get(i).getName().equals(powe.getName()) &&
                    powerList.get(i).getPowerType().equals(powe.getPowerType())){
                return true;
            }
        }
        return false;
    }

    private void setLifePoints() {
        lifePoints = lifePoints - 10;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void addImmunities(PowerType powerType) {
        immunities.add(powerType);
    }
}
