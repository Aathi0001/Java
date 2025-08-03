package test1;

import java.util.Arrays;

public class t58 {
	public static void main(String[] args) {
		int [][]a= {
				{10,20,30,4,3},
				{2,1,6,1},
				{4,3,2},
				{1,6,6,2,4}
		};
		for(int i=0; i<a.length; i++) {
			Arrays.sort(a[i]);
			System.out.println(solve(a[i]));
		}
	}
	public static boolean solve(int []a) {
		for(int j=0; j<a.length-1; j++) {
			if(a[j]==a[j+1]) {
				return true;
			}
		}return false;
	}
}
