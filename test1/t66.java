package test1;

import java.util.Arrays;
import java.util.Scanner;

public class t66 {
	static Scanner sc = new Scanner(System.in);
	public static boolean linear(int []a, int key ) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int []a= {8,4,3,2,6,47,43,37};
		System.out.println("Enter the Element to Search:");
		int key = sc.nextInt();
		System.out.println(Arrays.toString(a));
		System.out.println((linear(a,key)?"Present":"Not present"));
	}

}
