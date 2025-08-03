package test1;

public class t13 {
	public static void main(String[] args) {
		int a = 1101;
		int x=1, sum=0;
		while(a>0) {
			sum += (a%10)*x;
			x*=2;
			a/=10;
		}
		System.out.println(sum);
	}

}
