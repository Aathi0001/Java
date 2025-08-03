package test1;

public class t45 {
	public static void SubArray(int []a) {
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(a[k]+" ");
				}System.out.print("     ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int []a= {2,-1,4,-3,3};
		SubArray(a);
	}
}
