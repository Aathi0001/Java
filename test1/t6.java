package test1;

import java.util.Scanner;

public class t6 { // Count The Digits

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Digits:");
		Long num = sc.nextLong();
		int count = 0;
		if (num == 0) {
			System.out.println("It is 1 Digit");
		} else {

			while (num > 0) {
				num /= 10;
				count++;
			}
			System.out.println("It is " + count + " Digits.");

		}

	}
}