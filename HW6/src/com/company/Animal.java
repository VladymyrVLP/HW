package com.company;

public class Animal implements Kind,Predator {
    public int id, age, weight;
    public String color,voices;

    public void Animal(){

        Animal animal = new Animal();


        if (animal.isHomePet()==true){
            Cat cat = new Cat();
                  System.out.println("Hello, my name is " + cat.getName() + " and my voice is " + cat.getVoices());
            Dog dog = new Dog();
                  System.out.println("Hello, my name is " + dog.getName() + " and my voice is " + dog.getVoices());
            Hamster hamster = new Hamster();
                   System.out.println("Hello, my name is " + hamster.getName());
            Fish fish = new Fish();
                 fish.Fish();
            GuitDog guitDog = new GuitDog();
            if (guitDog.isTrained() == true){
                 System.out.println("Hello, my name is " + guitDog.getName() + ". I can take you home");}
        }
         if (animal.isWild() == true){
               Crocodail crocodail = new Crocodail();
               if (crocodail.isPredator() == true){
                   System.out.println("Hello, I am a wild animal" + " and I am angry");
               }else {
                   System.out.println("Hello, I am a wild animal");
               }
               Girafe giraffe = new Girafe();
              if (giraffe.isPredator() == true){
                   System.out.println("Hello, I am a wild animal" + " and I am angry");
               }else {
                   System.out.println("Hello, I am a wild animal");
               }
              Lion lion = new Lion();
              if (lion.isPredator() == true){
                 System.out.println("Hello, I am a wild animal" + " and I am angry");
             }else {
                 System.out.println("Hello, I am a wild animal");
             }
              Wolf wolf = new Wolf();
              if (wolf.isPredator() == true){
                   System.out.println("Hello, I am a wild animal" + " and I am angry");
               }else {
                   System.out.println("Hello, I am a wild animal");
               }
        }

    }

    @Override
    public boolean isWild() {
        return true;
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
}
