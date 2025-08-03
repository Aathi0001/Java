package test1;

public class t100 {
    public static void main(String[] args) {
        Battery99 battery = new ElectricModule99();  // object for interface
        HybridCar99 hybrid = new HybridCar99(battery);

        hybrid.showDetails();
    }
}
