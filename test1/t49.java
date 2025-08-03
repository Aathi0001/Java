package test1;

import java.util.Arrays;

public class t49 {
	public static void InsertionSort(int[] a) {
		for(int i =1; i<a.length; i++) {
			int cur=a[i];
			int prev=i-1;
			while(prev>=0 && a[prev]>cur) {
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=cur;
		}
	}
	public static void main(String[] args) {
		int []a = {4,5,3,2,1};
		System.out.println(Arrays.toString(a));	
		InsertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}


/*
Example: Insertion Sort Workflow
Original Array: [4, 5, 3, 2, 1]

Step 1: i = 1, key = 5
Compare with [4]
5 > 4 → No shift needed
Array: [4, 5, 3, 2, 1]

Step 2: i = 2, key = 3
Compare with [4, 5]
3 < 5 → Shift 5 to right
3 < 4 → Shift 4 to right
Insert 3 at position 0
Array: [3, 4, 5, 2, 1]

Step 3: i = 3, key = 2
Compare with [3, 4, 5]
2 < 5 → Shift 5
2 < 4 → Shift 4
2 < 3 → Shift 3
Insert 2 at position 0
Array: [2, 3, 4, 5, 1]

Step 4: i = 4, key = 1
Compare with [2, 3, 4, 5]
1 < 5 → Shift 5
1 < 4 → Shift 4
1 < 3 → Shift 3
1 < 2 → Shift 2
Insert 1 at position 0
Array: [1, 2, 3, 4, 5]

Final Sorted Array: [1, 2, 3, 4, 5]
*/
