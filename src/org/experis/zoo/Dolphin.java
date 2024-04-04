package org.experis.zoo;

public class Dolphin extends Animal implements Nuotante {
    public Dolphin(String race) {
        super(race);
    }

    @Override
    public void makeNoise() {
        System.out.println("Eie-eeee-eeeeeeeeeeeheee");
    }

    @Override
    public void eat() {
        System.out.println("Nom Nom eat: fish");
    }

    @Override
    public void swim() {
        System.out.println("Im a dolphin i can swimm!");
    }
}
