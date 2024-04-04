package org.experis.zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Golden Retreiver"),new Sparrow("Parus major"),new Eagle("Aquila chrysaetos"),new Dolphin("Orcaella brevirostris")};
        for(Animal animal : animals){
            System.out.println(animal.getRace());
            animal.makeNoise();
            animal.eat();
            animal.sleep();
        }

        goFly(new Sparrow("Fred"));
        goSwim(new Dolphin("Bill"));
    }

    public static void  goFly(CanFly animal){
        animal.fly();
    }

    public static void  goSwim(CanSwim animal){
        animal.swim();
    }
}
