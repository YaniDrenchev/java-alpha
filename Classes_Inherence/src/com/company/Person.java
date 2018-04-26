package com.company;

import java.util.ArrayList;

public class Person {
    String name;
    int weight;
    Gender gender;
}

class Hero extends Person {
    String secretindentity;
    String backStory;
    State state;
    ArrayList<String> listOfPowers;

    public void addSuperPower(String name) {
        listOfPowers.add(name);
    }

    public void canFly(String string) {
        System.out.println("I can fly");
    }
}

class SuperHero extends Hero {
    public void saveWorld() {
    }

    public SuperHero(String name, int weight, Gender gender, String secretindentity, String backStory, State state,
                     ArrayList<String> listOfPowers) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.secretindentity = secretindentity;
        this.backStory = backStory;
        this.state = state;
        this.listOfPowers = listOfPowers;
    }

    @Override
    public void addSuperPower(String massege) {
        System.out.println("Overrided method");
    }

}

class SuperVilian extends Hero {
    public void destroy() {
    }

    public SuperVilian(String name, int weight, Gender gender, String secretindentity, String backStory, State state,
                       ArrayList<String> listOfPowers) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.secretindentity = secretindentity;
        this.backStory = backStory;
        this.state = state;
        this.listOfPowers = listOfPowers;

    }

    @Override
    public void addSuperPower(String massege) {
        System.out.println("Overrided method Supervilian");
    }

    @Override
    public void canFly(String string) {
        System.out.println("I can fly and i am Supervillian");
    }
}

