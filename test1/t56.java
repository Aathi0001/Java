package test1;

public class t56 {
    
    public static int[][] AddMatrix(int [][]a, int [][]b){
        int [][] res = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+" ");
            }System.out.println();
        }
        return res; 
    }

    public static void main(String[] args) {
        int [][]a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][]b = {
                {99, 88, 77},
                {66, 55, 44},
                {33, 22, 11}
        };
        
        AddMatrix(a, b); 
       
    }
}


/*
package test1;

import java.util.Arrays;

public class t56 {
    
    public static int[][] AddMatrix(int [][]a, int [][]b){
        int [][] res = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res; // ✅ return the result
    }

    public static void main(String[] args) {
        int [][]a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][]b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        
        int[][] result = AddMatrix(a, b); // ✅ call the function and store result
        
        System.out.println("Sum of matrices:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
*/