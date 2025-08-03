package test1;

//     Using Recursion Method

public class t17 {
	
		static int t1=0, t2=1, t3;
		public static void fibonaci(int count){
			if((count-2)>0) {
			t3=t1+t2;
			System.out.print(t3+" ");
			t1=t2;
			t2=t3;
			fibonaci(count-1);
			}
		}
		public static void main(String[] args) {
			int n=2;
			if (n <= 0) {
	            System.out.println("No terms to display.");
	        } 
			else if (n == 1) {
	            System.out.println(t1);
	        } 
	        else {
	        	System.out.print(t1+" "+t2+" ");
	        	fibonaci(n);
			}
		
	}	
}




	
/*
 
//     Using Constructor

package test1;

public class t17 {
	static int t1=0, t2=1, t3;
	public t17(int count){
		if ((count-2) > 0) {
		t3=t1+t2;
		System.out.print(t3+" ");
		t1=t2;
		t2=t3;
		new t17(count-1);
		}
	}
	public static void main(String[] args) {
		int n = 10;
		if (n <= 0) {
	            System.out.println("No terms to display.");
	        } 
			else if (n == 1) {
	            System.out.println(t1);
	        } 
	        else {
		System.out.print(t1+" "+t2+" ");
		new t17(n);
		}
		}
	
}	
*/	
	


/*package test1;

public class t17 {
	public static void main(String[] args) {
		int t1=0, t2=1, t3;
		int n=10;
		
		System.out.print(t1 + " " + t2+" "); 
//		Using While Loop
		
		while(n>2) {
			t3 = t1+t2;
			System.out.print(t3 +" ");
			t1 = t2;
			t2 = t3;
			n--;
		}
	}
}*/



/*
package test1;

public class t17 {
	public static void main(String[] args) {
		int t1=0, t2=1, t3;
		int n=10;
		
		System.out.print(t1 + " " + t2+" "); 

		
//		Using For Loop
		
		for(int i=3; i<=n; i++) {
			t3 = t1+t2;
			System.out.print(t3 +" ");

			t1 = t2;
			t2 = t3;
			}
		}

}
*/