package test1;

public class t104 {
    public static void main(String[] args) {
        t103 obj = new t103();
        obj.add();
        obj.add(10, 20);             // calls int, int
        obj.add(5.5, 4.5);           // calls double, double
        obj.add(10, 20.0f);			 // calls int , float
        obj.add(10);				 // calls int
        obj.add(1, 2, 3);            // calls int, int, int
    }
}
