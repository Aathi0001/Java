package test1;

import java.util.Arrays;

public class t34 {
	
	public static void arrange(int []a) {
		int l=0, r=a.length-1;
		while(l<r) {
			if(a[l]==1 && a[r]==0) {
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				l++;
				r--;
			}
			else {
			if(a[l]==0) {
				l++;
			}
			if(a[r]==1) {
				r--;
			}}
		}
	}
	
	public static void main(String[] args) {
		int []a = {1,1,0,1,0,1,1};
		System.out.println(Arrays.toString(a));
		arrange(a);
		System.out.println(Arrays.toString(a));
	}

}



//Method to rearrange binary array so that all 0s are on the left and all 1s on the right
//Initialize two pointers: one at the start (l) and one at the end (r)
//While l is less than r, check values at both pointers
//If left is 1 and right is 0, swap them and move both pointers inward
//If left is 0, it's already in correct place, so move left pointer forward
//If right is 1, it's already in correct place, so move right pointer backward
//Repeat the process until all 0s are on the left and 1s on the right
