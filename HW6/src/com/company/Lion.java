package com.company;

public class Lion extends Animal implements Predator{

     public Lion(){
        this.age = 5;
        this.color = "White";
        this.weight = 150;
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
