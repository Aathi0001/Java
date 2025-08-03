package test1;

public class t72 {

    // 🔸 Instance variables
    String brand;
    String color;
    int speed;

    // 🔹 Static variable (shared across all cars)
    static int totalCars;

    // 🔸 Constructor
    t72(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        totalCars++; // increase count for every new car
    }

    // 🔸 Instance method
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    // 🔹 Static method
    static void showTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }

    public static void main(String[] args) {
        // 🔧 Creating car objects
        t72 car1 = new t72("Toyota", "Red", 120);
        t72 car2 = new t72("Honda", "Blue", 150);

        // 🔍 Show details
        car1.showDetails();
        System.out.println("--------------------");
        car2.showDetails();
        System.out.println("--------------------");
        // 📊 Show total number of cars
        t72.showTotalCars();
    }
}
