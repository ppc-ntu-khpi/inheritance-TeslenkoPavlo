package test;

import domain.Parrot;

public class TestAnimal {
    public static void main(String[] args) {

        Parrot parrot = new Parrot("Polly", 3, 50);
        
        System.out.println(parrot.toString());
        System.out.println();
        
        System.out.println("Actions:");
        parrot.eat();
        parrot.sleep();
        parrot.fly();
        parrot.talk();
    }
}
