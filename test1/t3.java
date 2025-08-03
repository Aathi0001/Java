package test1;

public class t3 {

	public static void main(String[] args) {
		byte a=10;
		int widening = a;
		System.out.println("a="+a);
		System.out.println("widening:"+widening);
		double b=20.4;
		byte narrowing = (byte)b;  //(type)variable_name;
		System.out.println("b="+b);
		System.out.println("Narrowing:"+narrowing);

	}

}
