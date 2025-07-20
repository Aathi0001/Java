package test1;

import java.util.Scanner;

public class t7 {// Sum of Digit
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Digit:");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println("Digit Sum:"+sum);
		
		
	}

}
