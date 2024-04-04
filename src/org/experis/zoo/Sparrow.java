package org.experis.zoo;

public class Sparrow extends Animal implements CanFly {


    public Sparrow(String race) {
        super(race);
    }

    @Override
    public void makeNoise() {
        System.out.println("Chip-Chip!");
    }

    @Override
    public void eat() {
        System.out.println("Nom Nom eat: insect seeds and berries");
    }

    @Override
    public void fly() {
        System.out.println("Im a parrot and i can flyyy!");
    }
}
