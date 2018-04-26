package com.company;

public class Main {

    public static void main(String[] args) {
	    Persone[] people = {
	            new Persone("Pesho", 23, "005483516"),
                new Persone("Gosho", 22, "005483516"),
                new Persone("Vaya", 24, "005483516"),
                new Persone("Peo", 25, "005483516"),
                new Persone("Roro", 26, "005483516")
        };
	    people[1].addFriend(people[2]);
        people[3].addFriend(people[2]);
        people[4].addFriend(people[2]);
        people[2].addFriend(people[2]);
        people[0].addFriend(people[2]);

        for (Persone aPeople : people) {
            aPeople.sayHi();
            aPeople.givePhoneNumber();

            aPeople.lsitFrinds();
            System.out.println();
        }
        people[1].sayHi(people[2]);
    }
}
