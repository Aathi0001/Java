package test1;

public class t102 {
    public static void main(String[] args) {

        // ---------------- Upcasting ----------------
        t101 v = new Car101(); // Car97 object assigned to t97 reference
        v.vehicleInfo();     // Allowed
        // v.carInfo();      // ❌ Not allowed (compiler error) without downcasting

        // ---------------- Downcasting ----------------
        Car101 c = (Car101) v; // Downcasting - explicit
        System.out.println(v instanceof Car101);
        System.out.println(c instanceof Car101);
        c.vehicleInfo();     // Allowed (inherited)
        c.carInfo();         // Now allowed

        // ---------------- Invalid Downcasting Example ----------------
        t101 v2 = new t101();   // Just a Vehicle object
        // Car97 c2 = (Car97) v2; // ❌ Runtime error: ClassCastException
        // c2.carInfo();
        
        t101 ref1 = new Ecar101();
        Ecar101 ref2 = new Ecar101();
        ref2.e_carInfo();
        System.out.println(ref1 instanceof Bike101);
        
        t101 ref3 = new Bike101();
        Bike101 ref4 = new Bike101();
        ref4.bikeInfo();
        
        
        
        
    }
}
