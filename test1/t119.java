package test1;

// Interface: defines common behavior
interface Flyable {
    void fly();  // abstract method
}

// Abstract class: partial abstraction with shared logic
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();  // abstract method

    void eat() {  // concrete method
        System.out.println(name + " is eating");
    }
}

// Concrete class: extends abstract class and implements interface
class Bird extends Animal implements Flyable {
    
    Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    void sound() {
        System.out.println(name + " says chirp chirp");
    }
}

public class t119 {
    public static void main(String[] args) {
        Bird parrot = new Bird("Parrot");
        parrot.eat();       // from abstract class
        parrot.sound();     // overridden abstract method
        parrot.fly();       // from interface
    }
}
