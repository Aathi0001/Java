package test1;

public class t24 {
	public static void spy(int num) {
		int digits, sum=0, pdt=1;
		while(num>0) {
			digits=num%10;
			sum = sum + digits;
			pdt = pdt * digits;
			num/=10;
		}
		System.out.println(sum==pdt ?"Spy":"Not");
	}
	public static void main(String[] args) {
		spy(10);
		spy(123);
	}

}


//Number = 112
//Digits: 1, 1, 2
//Sum = 1 + 1 + 2 = 4  
//Product = 1 × 1 × 2 = 2 → ❌ Not Spy
//
//Number = 123  
//Sum = 1 + 2 + 3 = 6  
//Product = 1 × 2 × 3 = 6 → ✅ Spy Number
