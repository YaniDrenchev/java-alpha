package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Persone {
    private String name;
    private int age;
    private String phone;
    private ArrayList<Persone> friends;

    public Persone(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
        friends = new ArrayList<>();

    }
    public void sayHi(){
        System.out.printf("Hey i am %s and I am %d years old :) \n", name, age);
    }
    public void givePhoneNumber(){
        System.out.printf("You can contact me at %s\n", phone);
    }
    public void addFriend(Persone newFriend){
        friends.add(newFriend);
    }
    public void lsitFrinds(){
        System.out.print("My friends are: ");
        for(Persone friend: friends){
            System.out.printf("%s ", friend.name);
        }
        System.out.println();
    }
    public void sayHi (Persone person){
        System.out.printf("Hey %s how are you my name is %s", person.name, name);
    }
}

