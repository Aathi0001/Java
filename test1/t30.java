package test1;

import java.util.Arrays;

public class t30 {
	public static int FindSunRise(int []a) {
		int count = 1, max=a[0];
		for(int i =1; i<a.length; i++) {
			if(a[i]>max) {
				count++;
				max=a[i];
			}
			
		}return count;
	}
	public static void main(String[] args) {
		int []a= {4,5,2,4,7,9,6,2};
		int res = FindSunRise(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Buildings with sunrise view: " + res);
		
	}

}

/*

package test1;

import java.util.Arrays;

public class t30 {
	public static int FindSunRise(int []a) {
		int count = 0, max=Integer.MIN_VALUE;
		for(int i =0; i<a.length; i++) {
			if(a[i]>max) {
				count++;
				max=a[i];
			}
			
		}return count;
	}
	public static void main(String[] args) {
		int []a= {4,5,2,4,7,9,6,2};
		int res = FindSunRise(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Buildings with sunrise view: " + res);
		
	}

}*/