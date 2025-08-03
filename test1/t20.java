package test1;

public class t20 {
	public static int PrimeOrNot(int start, int end) {
		for(int i=start; i<=end; i++) {
		if(i==0||i==1) {
			System.out.println(i+" Neither Composite nor Prime");
		}
		else {
			boolean flag = true;
			for(int j=2; j<=i/ 2; j++) {
				
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i +" is a Prime number");
			}
			else {
				System.out.println(i +" is Not a Prime Number");
			}
				
		}}return 0;
	}
	public static void main(String[] args) {
		PrimeOrNot(0, 999);
	}
	
}


/*
package test1;

public class t20 {
	public static int PrimeOrNot(int num) {
		if(num==0||num==1) {
			System.out.println("Neither Composite nor Prime");
		}
		else {
			boolean flag = true;
			for(int i=2; i<=num/ 2; i++) {
				
				if(num%i==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(num +" is a Prime number");
			}
			else {
				System.out.println(num +" is Not a Prime Number");
			}
				
		}return num;
	}
	public static void main(String[] args) {
		PrimeOrNot(234);
	}

}
*/