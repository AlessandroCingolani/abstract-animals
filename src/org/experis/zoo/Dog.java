package org.experis.zoo;

public class Dog extends Animal{

    public Dog(String race) {
        super(race);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Nom Nom eat: meat");
    }

}
