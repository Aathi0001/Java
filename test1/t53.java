package test1;

import java.util.Arrays;

public class t53 {
    public static void MDACheckPrime(int [][]a) {
        System.out.println("Prime numbers in 2D array:");
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                if (isPrime(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                }
            }System.out.println(); // for line break
        }
        
    }

    // Helper method to check prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [][]a = {
                {2, 4, 5, 8},
                {1, 0, 2, 7},
                {5, 2, 7, 5}
        };
        
        System.out.println("2D Array: " + Arrays.deepToString(a));
        MDACheckPrime(a);
    }
}
