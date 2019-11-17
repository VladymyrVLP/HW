package com.company;

public class Hamster extends Animal implements Kind,Predator,Trained {
    public String name;
    @Override
    public boolean isWild() {
        return false;
    }

    @Override
    public boolean isHomePet() {
        return true;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public boolean isPredator() {
        return false;
    }

    @Override
    public boolean isTrained() {
        return false;
    }
    public Hamster(){
        this.name = "Jack Daniel";
        this.age = 5;
        this.color = "Striped";
        this.weight = 1;

    }


    public String getName(){
        return name;
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
}
