package test1;

public class t86 {
    private String brand;
    static String owner ="Aathi";
    private t85 engine;  // Composition: Car HAS-A Engine

    public t86(String brand, t85 engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void drive() {
    	System.out.println("---Details of Car---");
        System.out.println(brand + " car is ready to drive.");
        engine.start();  // Using composed object
    }

    public String getBrand() {
        return brand;
    }

    public t85 getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        t85 engine = new t85("V8","6Stroke","4000hp");
        t86 car = new t86("BMW", engine);
        t86 car1 = new t86("AAA", new t85("v9", "7stroke", "6000hp"));
        t86 car2 = new t86("AAA", new t85("v9", "7stroke", "6000hp"));
        
        t86[] cars = {car1, car2};
        for(int i=0; i<cars.length; i++) {
        	cars[i].drive();
        }
        car.drive();
    }
}