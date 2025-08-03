package test1;

import java.util.Arrays;

public class t68 {

    // Recursive Merge Sort function
    public static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Step 1: Sort left half
            mergeSort(a, left, mid);

            // Step 2: Sort right half
            mergeSort(a, mid + 1, right);

            // Step 3: Merge both halves
            merge(a, left, mid, right);
        }
    }

    // Merge two sorted parts
    public static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = a[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = a[mid + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray
        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray
        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] a = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Before Sorting: " + Arrays.toString(a));

        mergeSort(a, 0, a.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}



/*
------------------------------
🧠 MERGE SORT EXAMPLE (Step-by-step)
------------------------------
Initial Array:
[38, 27, 43, 3, 9, 82, 10]

🔁 Step 1: Divide
[38, 27, 43]      |      [3, 9, 82, 10]

🔁 Step 2: Divide again
[38, 27] [43]     |      [3, 9] [82, 10]

[38] [27] [43]    |      [3] [9] [82] [10]

✅ Step 3: Start Merging
[38] + [27] => [27, 38]
[3] + [9]   => [3, 9]
[82] + [10] => [10, 82]

✅ Step 4: Merge next level
[27, 38] + [43]   => [27, 38, 43]
[3, 9] + [10, 82] => [3, 9, 10, 82]

✅ Step 5: Final Merge
[27, 38, 43] + [3, 9, 10, 82] => [3, 9, 10, 27, 38, 43, 82]

🎉 Final Sorted Array:
[3, 9, 10, 27, 38, 43, 82]

🧾 Time Complexity:
Best/Average/Worst: O(n log n)
Space Complexity: O(n)

🛠 Use Cases:
- Efficient for large datasets
- Used in external sorting (e.g., sorting on disk)
*/
