package test1;

public class t94 {
    public static void main(String[] args) {
        ElectricCar93 e = new ElectricCar93("TATA", "ShinChan");
        
        e.start();  // From Car93
        e.run();    // From Vehicle93	
        e.charge(); // From ElectricCar93
    }
}
