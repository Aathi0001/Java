package test1;

public class t103 {
	public void add() {
		System.out.println("Addition");
	}
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
    public void add(int a, float b) {
    	System.out.println("Sum of integer and float: "+ (a+b));
    }
    public void add(int a) {
    	System.out.println("Integer a: " + a);
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
}
