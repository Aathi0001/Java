package test1;

class Vehicles95 {
	String name;
	Vehicles95(String name){
		this.name = name;
	}
    public void start() {
        System.out.println(name+" Vehicle started");
    }
}

class Cars95 extends Vehicles95 {
	String carowner;
	Cars95(String carowner, String name){
		super(name);
		this.carowner = carowner;
	}
    public void carFeature() {
        System.out.println(carowner+" Car has AC");
    }
}

class Bike95 extends Vehicles95 {
	String bikeowner;
	Bike95(String bikeowner, String name){
		super(name);
		this.bikeowner = bikeowner;
	}
    public void bikeFeature() {
        System.out.println(bikeowner+" Bike has helmet storage");
    }
}
