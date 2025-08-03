package test1;

import java.util.Arrays;

public class t38 {
	public static int[] FillMissingValue(int []a) {
		int max=a[0], min=a[0];
		for(int i=1; i<a.length; i++) {
			
				if(a[i]>max) {
					max=a[i];
				}
				if(a[i]<min){
					min=a[i];
				}
			
		}
		boolean[] present = new boolean[max + 1];
        for (int num : a) {
            present[num] = true;
        }
		int index=0;
		int []temp= new int[max];
		for(int j=min; j<=max; j++) {
			
			
			temp[index++]=j;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int []a= {1,5,9,20};
		int []result=FillMissingValue(a);
		System.out.println(Arrays.toString(result));
	}

}
