package test1;

import java.util.*;

public class t28 {
	public static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			rev = (rev * 10) + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int[] a = { 86, 43, 24, 92 };
		for(int i=a.length-1; i>=0; i--) {
			a[i]=reverse(a[i]);
		}
		System.out.println(Arrays.toString(a));

	}
}
