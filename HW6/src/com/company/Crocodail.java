package com.company;

public class Crocodail extends Animal implements Predator{


    public Crocodail(){
        this.age = 4;
        this.color = "Green";
        this.weight = 40;
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

    @Override
    public boolean isPredator() {
        return true;
    }
}
