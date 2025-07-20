package test1;

import java.util.*;

public class t29 {
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
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
            a[i] = reverse(a[i]);
        }
		
		for(int i=0; i<a.length/2; i++) {
			int temp = a[i];
			a[i]=a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(a));

	}
}

/*
package test1;

import java.util.*;

public class t29 {
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
		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		for(int i=a.length-1; i>=0; i--) {
			b[i]=reverse(a[a.length - 1 - i]);
		}
		System.out.println(Arrays.toString(b));

	}
}
*/