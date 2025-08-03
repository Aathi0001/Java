package test1;

public class t101 {
    public void vehicleInfo() {
        System.out.println("This is a vehicle.");
    }
}

class Car101 extends t101 {
    public void carInfo() {
        System.out.println("This is a car.");
    }
}

class Ecar101 extends Car101 {
    public void e_carInfo() {
        System.out.println("This is a E-car.");
    }
}

class Bike101 extends t101 {
    public void bikeInfo() {
        System.out.println("This is a Bike.");
    }
}