package com.company;

public class Cat  extends Animal implements Kind,Predator,Trained{
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

    public Cat(){
        this.name = "Jemeson";
        this.age = 4;
        this.color = "Red";
        this.weight = 4;
        this.voices ="Meow";
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
