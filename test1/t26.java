package test1;

public class t26 {
	public static void EvenOdd(int num ) {
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args) {
		EvenOdd(2);
		EvenOdd(3321);
	}

}
