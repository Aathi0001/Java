package test1;

public class t106 {
    public static void main(String[] args) {
        t105 p1 = new t105();                 // Default constructor
        t105 p2 = new t105("Aathi");          // One-argument constructor
        t105 p3 = new t105("Siva", 25);       // Two-argument constructor

        p1.show();
        p2.show();
        p3.show();
    }
}
