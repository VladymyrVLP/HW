package com.company;

public class Girafe extends Animal implements Predator {
    @Override
    public boolean isPredator() {
        return false;
    }

    public Girafe(){
        this.age = 5;
        this.color = "Red";
        this.weight = 80;
    }

    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    public String getVoices() {
        return voices;
    }
}
