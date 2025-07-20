package test1;

public class t16 {
	public static void main(String[] args) {
		int n = 14;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i == 1 || j == 1 || j == n / 2 || i == n / 2 || i + j == n || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
		
//		**************
//		**    *    * *
//		* *   *   *  *
//		*  *  *  *   *
//		*   * * *    *
//		*    ***     *
//		**************
//		*    ***     *
//		*   * * *    *
//		*  *  *  *   *
//		* *   *   *  *
//		**    *    * *
//		*     *     **
//		**************

		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || j == 1 || i == 5 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

//		**********
//		*        *
//		*        *
//		*        *
//		**********
		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****

		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		


//		*****
//		****
//		***
//		**
//		*

		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

//		    *
//		   **
//		  ***
//		 ****
//		*****

		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

//		*****
//		 ****
//		  ***
//		   **
//		    *


		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

//		    *
//		   ***
//		  *****
//		 *******
//		*********

		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *

		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 


		System.out.println("\n------------------------------------------------------------------------------------");

		for (int i = 5; i >= 1; i--) {
			if (i % 2 == 0) {
				char ch = 'A';
				for (int j = 1; j <= i; j++) {
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			} else {
				for (int k = 1; k <= i; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}
		

//		1 2 3 4 5 
//		A B C D 
//		1 2 3 
//		A B 
//		1 
		
		
		System.out.println("\n------------------------------------------------------------------------------------");
		
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				if((i+k)%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}System.out.println();
		}
		
//		        1 
//		      0 1 
//		    1 0 1 
//		  0 1 0 1 
//		1 0 1 0 1 

		
		System.out.println("\n------------------------------------------------------------------------------------");

	}
}

