package test1;

public class t18 {
	public static void main(String[] args) {
		int num=10;
		for(int i=1; i<=num; i++) {
			int fact = 1;

            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println("Factorial of " + i + " is: " + fact);
		}
	}
}




/*package test1;

public class t18 {
	static int fact=1;
	public static int factorial(int num) {
		if(num>1) {
			fact=fact*num--;
			factorial(num);
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("Factorial : "+factorial(10));
		
	}
}
*/



/*
package test1;

public class t18 {
	static int fact = 1, num = 10;
	public static void main(String[] args) {
	     factorialnumber();
	     System.out.println("Factorial of " + num + " is: " + fact);
	}
	public static void factorialnumber() {
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
	}

}
*/