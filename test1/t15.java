package test1;

import java.util.Scanner;

public class t15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		System.out.println("Start:");
		int start = sc.nextInt();
		System.out.println("End:");
		int end = sc.nextInt();

		for (int j = start; j <= end; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(j + "*" + i + "=" + (i * j));
			}
			System.out.println();
		}

	}

}
