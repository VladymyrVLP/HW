package com.company;

public class Wolf extends Animal implements Predator {
 public Wolf(){
        this.age = 6;
        this.color = "Grey";
        this.weight = 90;
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
