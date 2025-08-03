package test1;

abstract class Animal115 {
	String name;
	String sound;
	Animal115(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
    abstract void sound(); // abstract method

    void sleep() { // non-abstract method
        System.out.println(name + " Sleeping...");
    }
}

class sound115 extends Animal115 {
	sound115(String name, String sound){
		super(name,sound);
	}
    void sound() {
        System.out.println(sound + " Sound");
    }
}
