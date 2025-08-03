package test1;

import java.util.Arrays;
import java.util.Scanner;

public class t33 {
	static Scanner sc = new Scanner(System.in);
	public static void LeftShift(int []a, int n) {
		
		for(int i=0; i<n; i++) {
			int last = a[a.length-1];
			for(int j=a.length-1; j>=1; j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
	}
	
	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter rotate time:");
		int n = sc.nextInt();
		LeftShift(a, n);
		System.out.println(Arrays.toString(a));
	}

}
