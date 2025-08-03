package test1;

import java.util.Arrays;

public class t48 {
	public static void SelectionSort(int []a) {
		for(int i=0; i<a.length; i++) {
			int sm = i;
			for(int j=i; j<a.length; j++) {
				if(a[j]<a[sm]) {
					sm=j;
				}
				int temp = a[i];
				a[i] = a[sm];
				a[sm] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int []a = {5,4,1,7,3,6,-8};
		SelectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}



/*
Selection Sort Step-by-Step:

Initial Array: [64, 25, 12, 22, 11]

Pass 1:

Find min from index 0 to 4 → 11

Swap 64 and 11

Result: [11, 25, 12, 22, 64]

Pass 2:

Find min from index 1 to 4 → 12

Swap 25 and 12

Result: [11, 12, 25, 22, 64]

Pass 3:

Find min from index 2 to 4 → 22

Swap 25 and 22

Result: [11, 12, 22, 25, 64]

Pass 4:

Find min from index 3 to 4 → 25

No swap needed

Result: [11, 12, 22, 25, 64]

Sorted Array: [11, 12, 22, 25, 64]
*/

