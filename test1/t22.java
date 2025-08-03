package test1;

public class t22 {
	public static void armstrong(int num) {
		int count=0, sum=0, temp=num;
		while(num>0) {
			num/=10;
			count++;
		}
		for(int i=temp; i>0; i=i/10) {
			int x=i%10, ans=1;
			for (int j=1; j<=count; j++) {
				ans = ans * x;
			}
			sum += ans;
		}
		System.out.println(sum==temp ?"Armstrong":"Not");
	}
	public static void main(String[] args) {
		armstrong(153);
		armstrong(9474);
		armstrong(123);
	}

}


//153 → 3 digits  
//1³ + 5³ + 3³ = 1 + 125 + 27 = 153 → ✅ Armstrong
//
//370, 371, 407 → Also Armstrong Numbers
//
//9474 → 4-digit  
//9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 → ✅
