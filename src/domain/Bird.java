package domain;

public class Bird extends Animal {
    
    public Bird(String name, int age) {
        super(name, age);
    }
    
    public void fly() {
        System.out.println(name + " is flying.");
    }
}
