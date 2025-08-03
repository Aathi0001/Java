package test1;

import java.util.Scanner;

public class t52 {
	static Scanner sc = new Scanner(System.in);
    public static void Multidimensional(int [][]a) {
        System.out.println("Row Traversal:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nColumn Traversal:");
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nReverse Row Traversal (bottom→top, right→left):");
        for (int r = a.length - 1; r >= 0; r--) {
            for (int c = a[r].length - 1; c >= 0; c--) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("\nReverse Column Traversal (right→left, top→bottom):");
        for (int j = a[0].length - 1; j >= 0; j--) {   // columns from right to left
            for (int i = 0; i < a.length; i++) {       // rows from top to bottom
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Multidimensional(a);
        
        System.out.println("Enter row size:");
        int row = sc.nextInt();
        
        System.out.println("Enter column size");
        int col = sc.nextInt();
        
        int [][]b= new int[row][col];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print( "Enter Element: ");
                b[i][j]=sc.nextInt();
            }
            System.out.println();   
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
