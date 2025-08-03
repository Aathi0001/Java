package test1;

// Interface A
interface Engine99 {
    void engineType();
}

// Interface B
interface Battery99 {
    void batteryType();
}

// Base class
class Vehicle99 {
    void vehicleType() {
        System.out.println("General Vehicle");
    }
}

// Class that extends Vehicle and implements Engine
class Car99 extends Vehicle99 implements Engine99 {
    public void engineType() {
        System.out.println("Petrol Engine");
    }
}

// Another class that implements Battery
class ElectricModule99 implements Battery99 {
    public void batteryType() {
        System.out.println("Lithium-ion Battery");
    }
}

// Hybrid class
class HybridCar99 extends Car99 {
    Battery99 battery;

    HybridCar99(Battery99 battery) {
        this.battery = battery;
    }

    void showDetails() {
        vehicleType();     // from Vehicle95
        engineType();      // from Car95
        battery.batteryType();  // from ElectricModule95 via composition
    }
}
