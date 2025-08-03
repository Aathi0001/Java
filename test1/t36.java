package test1;

import java.util.Arrays;

public class t36 {

    public static int[] removeDuplicates(int[] a) {
        int count = 0;

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Integer.MIN_VALUE) continue;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = Integer.MIN_VALUE; 
                    count++;
                }
            }
        }

        int[] result = new int[a.length - count];
        int index = 0;

        for (int value : a) {
            if (value != Integer.MIN_VALUE) {
                result[index++] = value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {8, 3, 4, 8, 4, 1, 84};
        System.out.println(Arrays.toString(a));
        int[] result = removeDuplicates(a);
        System.out.println(Arrays.toString(result));
    }
}








/*
 * This program removes duplicate values from an integer array using only arrays and loops.
 * 
 * Approach:
 * 1. Loop through each element using two loops (i and j).
 * 2. Compare every element a[i] with the rest of the elements a[j] (where j > i).
 * 3. If a duplicate is found (a[i] == a[j]), mark the duplicate (a[j]) as Integer.MIN_VALUE.
 * 4. After marking all duplicates, count how many valid (non-marked) elements remain.
 * 5. Create a new array of that count size.
 * 6. Copy all non-marked values to the new array.
 * 7. Print the result.
 * 
 * Example:
 * Input  : {8, 3, 4, 8, 4, 1, 84}
 * Step 1 : 8 is duplicate → second 8 marked as MIN_VALUE
 * Step 2 : 4 is duplicate → second 4 marked as MIN_VALUE
 * After marking: {8, 3, 4, -2147483648, -2147483648, 1, 84}
 * Final Output : [8, 3, 4, 1, 84]
 * 
 * Note:
 * Integer.MIN_VALUE is used as a marker to identify duplicates
 * and is ignored during the copy to the final result array.
 */

