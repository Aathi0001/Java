package test1;

public class t19 {
	public static int Factors(int num) {
		for(int i=1; i<=num; i++) {
		if(num%i==0) {
			System.out.print(i+" ");	
		}
		
		}return num;
	}
	public static void main(String[] args) {
		Factors(10);
	}

}
