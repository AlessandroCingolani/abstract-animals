package org.experis.zoo;

public abstract class Animal {

    private String race;

    public Animal(String race) {
        this.race = race;
    }


    public String getRace() {
        return race;
    }

    public abstract void makeNoise();
    public abstract void eat();

    public void sleep(){
        System.out.println("Zzz\n");
    }
}
