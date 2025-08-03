package test1;

import java.util.Scanner;

public class t60 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String s1 = new String("JAVA");
		String s2 = "JavaScript";
		char res1 = s2.charAt(2);
		System.out.println("s1:"+s1.length());  //s1:4
		System.out.println("s2:"+s2.length());  //s2:10
		System.out.println("res1:"+res1); //res1:v
		
		System.out.print("\nEnter Name:");
		String s3 = sc.nextLine();
		System.out.print("\nEnter Name:");
		String s4 = sc.nextLine();
		System.out.print("\nEnter Name:");
		String s5 = sc.nextLine();
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		char[]a = s3.toCharArray();  //Convert String to char
		System.out.println(a);
		
		char[]b = {'S','t','r'};
		String s = new String(b); //Convert Array to String
		System.out.println(b);
		System.out.println(s);
		
		String s6 = "aathi";
		String s7 = "AATHI";
		String s8 = "AATHI";
		System.out.println(s6);      // → aathi
		System.out.println(s7);      // → AATHI
		System.out.println(s8);      // → AATHI

		System.out.println(s7 == s8);           // → true (same string literal → same memory)
		System.out.println(s7.equals(s8));      // → true (same content)
		System.out.println(s6.equals(s7));      // → false (different case)
		System.out.println(s6.equalsIgnoreCase(s7));  // → true (ignores case)

		String s9 = new String("AATHI");
		String s10 = new String("AATHI");
		
		System.out.println(s9 == s10); // ❌ false (different memory)
		System.out.println(s9.equals(s10)); // ✅ true (same content)
		
		
		
	}
}
