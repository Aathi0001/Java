package test1;

public class t44 {
	public static void PairArray(int []a) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				System.out.print("("+a[i]+","+a[j]+")");
			}System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int []a = {2,6,4,2,1};
		PairArray(a);
	}
}
