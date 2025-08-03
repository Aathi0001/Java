package test1;

import java.util.Scanner;

public class t46 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			System.out.println("Enter the char:");
			char ch1 = sc.next().charAt(0);
			int res = ascii(ch1);
			System.out.println(res);
			
	}
	public static int ascii(int a) {
		return a;
	}
}
