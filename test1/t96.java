package test1;

public class t96 {
    public static void main(String[] args) {
        Cars95 c = new Cars95("Shinchan", "Tesla");
        c.start();           // from Vehicle
        c.carFeature();      // specific to Car

        Bike95 b = new Bike95("Doremon", "Tata");
        b.start();           // from Vehicle
        b.bikeFeature();     // specific to Bike
    }
}
