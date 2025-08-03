package test1;

public class t55 {
	public static void SumDigit(int [][]a) {
		 System.out.println("Sum Of Digits in 2D array:");
		 	int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for(int i=0; i<a.length; i++) {
	            for(int j=0; j<a[i].length; j++) {
	                a[i][j]=isSum(a[i][j]);
	                System.out.print(a[i][j] + " ");
	                
	                if (a[i][j] < min) min = a[i][j];
	                if (a[i][j] > max) max = a[i][j];
	                
	                
                }System.out.println(); // for line break
	        }
	        System.out.println("\nMinimum value in digit sums: " + min);
	        System.out.println("Maximum value in digit sums: " + max);
		
	}
	
	public static int isSum(int num) {
		int temp = num;
		int sum = 0;
		while(temp>0) {
			sum = sum + (temp%10);
			temp /=10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int [][]a = {
				{174,214,117},
				{213,741,475},
				{711,174,247}
		};
		SumDigit(a);
	}
}
