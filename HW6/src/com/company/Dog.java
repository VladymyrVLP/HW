package com.company;

public class Dog extends Animal implements Kind,Predator,Trained{
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
        return true;
    }

    @Override
    public boolean isPredator() {
        return false;
    }

    @Override
    public boolean isTrained() {
        return false;
    }
 public Dog(){
        this.name = "Morgan";
        this.age = 5;
        this.color = "Black, White, Brown";
        this.weight = 10;
        this.voices ="Woof";
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
    public String getVoices() {
        return voices;
    }

}


