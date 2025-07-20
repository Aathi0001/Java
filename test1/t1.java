package test1;

public class t1 {
	static int a = 3;

	public static void main(String[] args) {
		int a = 12;
		long b = 80L;
		long c = 2l;
		long d = 23432;
		//float e = 20.5;     ----->     it will cause CTE
		float e = 2.1f;
		float f = 0.0f;
		float g = 0.0F;
		double h = 20.0;
		double i = 20.3d;
		double j = 20.1D;
		System.out.println(a);
		System.out.println(t1.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}
}
