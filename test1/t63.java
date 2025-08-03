package test1;

import java.util.Arrays;

public class t63 {
	public static void main(String[] args) {
		String s = new String("Hi How Are You?");
		String[] sp = s.split(" ");
		System.out.println(Arrays.toString(sp));
		String ans = "";
		for(int i=0; i<sp.length; i++) {
			ans+=reverse(sp[i])+" ";
		}
		System.out.println(s);
		System.out.println(ans);
	}
	public static String reverse(String s) {
		char[]a = s.toCharArray();
		int l=0, r=a.length-1;
		while(l<r) {
			char temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}return new String(a);
	}

}
