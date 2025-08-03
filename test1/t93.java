package test1;

// Parent class
class Vehicle93 {
	String name;
	Vehicle93(String name){
		this.name = name;
	}
    public void run() {
        System.out.println(name+" Vehicle is running");
    }
}

// Child class
class Car93 extends Vehicle93 {
	String owner;
	Car93(String name, String owner){
		super(name);
		this.owner = owner;
	}
    public void start() {
        System.out.println(owner + "Car has started");
    }
}

// Grandchild class
class ElectricCar93 extends Car93 {
	ElectricCar93(String name, String brand){
		super(name,brand);   //any name can be give to super call that instead of owner i have given brand but it refer to owner
		
	}
    public void charge() {
        System.out.println("Electric car is charging");
    }
}
