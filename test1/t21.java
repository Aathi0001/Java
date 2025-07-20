package test1;

public class t21 {
	public static void neon(int num) {
		int sum=0;
		if(num>0) {
			int pdt=num*num;
			while (pdt > 0) {
			sum+=pdt%10;
			pdt/=10;
			}
			if(sum==num) {
			System.out.println("It is a Neon Number");
			}
			else {
				System.out.println("It is Not a Neon Number");
			}
		}else {
            System.out.println("Enter a positive number.");
        }
		
	}
	public static void main(String[] args) {
		neon(9);
		neon(21);
		neon(-1);
	}

}



//Number = 9
//Square = 81
//Sum of digits = 8 + 1 = 9 → ✅ Neon Number
