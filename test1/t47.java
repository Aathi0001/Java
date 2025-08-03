package test1;

import java.util.Arrays;

public class t47 {
	public static void BubbleSort(int []a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int []a = {25,24,17,16,21};
		BubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}


/*
Bubble Sort Step-by-Step:

Initial Array: [64, 25, 12, 22, 11]

Pass 1:

64 > 25 → swap → [25, 64, 12, 22, 11]

64 > 12 → swap → [25, 12, 64, 22, 11]

64 > 22 → swap → [25, 12, 22, 64, 11]

64 > 11 → swap → [25, 12, 22, 11, 64]

Pass 2:

25 > 12 → swap → [12, 25, 22, 11, 64]

25 > 22 → swap → [12, 22, 25, 11, 64]

25 > 11 → swap → [12, 22, 11, 25, 64]

Pass 3:

12 < 22 → no swap

22 > 11 → swap → [12, 11, 22, 25, 64]

22 < 25 → no swap

Pass 4:

12 > 11 → swap → [11, 12, 22, 25, 64]

Sorted Array: [11, 12, 22, 25, 64]
*/

