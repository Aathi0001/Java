package test1;

// Parent class
class Animal91 {
	static String King = "LION";
	String name;
	Animal91(String name){
		this.name = name;
	}
    public void sound() {
        System.out.println(name+" makes sound");
    }
}

// Child class
class sound91 extends Animal91 {
	String sound;
	sound91(String sound, String name){
		super(name);
		this.sound = sound;
	}
    public void echo() {
        System.out.println(sound);
    }
}
