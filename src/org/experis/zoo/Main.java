package org.experis.zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Golden Retreiver"),new Sparrow("Parus major"),new Eagle("Aquila chrysaetos"),new Dolphin("Orcaella brevirostris")};
        for(Animal animal : animals){
            System.out.println(animal.getRace());
            animal.makeNoise();
            animal.eat();
            // casting can fly and check instaceof
            if (animal instanceof CanFly) {
                goFly((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                goSwim((CanSwim) animal);
            }
            animal.sleep();
        }


    }

    public static void  goFly(CanFly animal){
        animal.fly();
    }

    public static void  goSwim(CanSwim animal){
        animal.swim();
    }
}
