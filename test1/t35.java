package test1;

import java.util.Arrays;

public class t35 {
	public static void CharSwap(char []a){
		int l=0, r=a.length-1;
		while(l<r) {
			char temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
            r--;
		}
		
		for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] += 32; 
            } else if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] -= 32; 
            }
        }
		
		
	}
	
	public static void main(String[] args) {
		char []a = {'#', 'A', '$', 'a', 'c', 'd'};
		System.out.println(Arrays.toString(a));
		CharSwap(a);
		System.out.println(Arrays.toString(a));
	}

}
