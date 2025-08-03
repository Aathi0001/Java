package test1;

import java.util.Scanner;

public class t65 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter" + i +"element:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Printing:");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
