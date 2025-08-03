package test1;

import java.util.Arrays;

public class t31 {
    public static int PalindromeArray(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int temp = num;
            int rev = 0;
            
            while (temp > 0) {
                rev = (rev * 10) + temp % 10;
                temp /= 10;
            }
            

            if (rev == num) {
                count++; 
            } else {
                a[i] = -1; 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {12, 121, 11, 4, 141, 45};
        int res = PalindromeArray(a);
        System.out.println("Modified array: " + Arrays.toString(a));
        System.out.println("Palindrome count: " + res);
    }
}
