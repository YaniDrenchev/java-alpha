package com.compan;

public class City {
    String name;
    Integer temperature;
    Integer population;
    City(String name, Integer population){
        this.name = name;

        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        return this.name.length()== ((City)o).name.length();
    }

    @Override
    public int hashCode() {
        return 1000;
    }

    @Override
    public String toString() {
        return name;
    }
}
