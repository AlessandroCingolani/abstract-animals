package org.experis.zoo;

public class Eagle  extends Animal implements CanFly{
    public Eagle(String race) {
        super(race);
    }

    @Override
    public void makeNoise() {
        System.out.println("SCREEEE!");
    }

    @Override
    public void eat() {
        System.out.println("Nom Nom eat: meat");
    }

    @Override
    public void fly() {
        System.out.println("I can flyyy!");
    }
}
