package test1;

import java.util.Arrays;

public class t50 {
	public static void CountingSort(int []a) {
		// Step 1: Find the max value in the array
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		// Step 2: Create count array
		int[] count = new int[max + 1];
		
		// Step 3: Count each element
		for (int i = 0; i < a.length; i++) {
			count[a[i]]++;
		}
		
		// Step 4: Reconstruct sorted array
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				a[index++] = i;
				count[i]--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {6, 1, 2, 6, 4, 1, 6};
		System.out.println("Before Sort: " + Arrays.toString(a));
		CountingSort(a);
		System.out.println("After Sort : " + Arrays.toString(a));
	}
}

/*
Original Array: [6, 1, 2, 6, 4, 1, 6]

Step 1: Find max element
Max = 6

Step 2: Create count array of size (max+1)
Initial Count array: [0, 0, 0, 0, 0, 0, 0]

Step 3: Count frequencies
Final Count array: [0, 2, 1, 0, 1, 0, 3]

Step 4: Reconstruct sorted array from count[]
Final Sorted Array: [1, 1, 2, 4, 6, 6, 6]
*/



/*
Original Array: [6, 1, 2, 6, 4, 1, 6]

Step 1: Find max element
Max = 6

Step 2: Create count array of size (max+1)
Count array size = 7 (indexes 0 to 6)
Initial Count array: [0, 0, 0, 0, 0, 0, 0]

Step 3: Count frequencies
Read each element in input and increment count:
Element 6 → count[6]++
Element 1 → count[1]++
Element 2 → count[2]++
Element 6 → count[6]++
Element 4 → count[4]++
Element 1 → count[1]++
Element 6 → count[6]++

Final Count array: [0, 2, 1, 0, 1, 0, 3]

Step 4: Reconstruct sorted array from count[]
Start from i = 0 to i = 6
Write each number `i` to the original array `count[i]` times

i = 1 → write 1 two times → [1, 1, _, _, _, _, _]  
i = 2 → write 2 one time  → [1, 1, 2, _, _, _, _]  
i = 4 → write 4 one time  → [1, 1, 2, 4, _, _, _]  
i = 6 → write 6 three times → [1, 1, 2, 4, 6, 6, 6]  

Final Sorted Array: [1, 1, 2, 4, 6, 6, 6]
*/
