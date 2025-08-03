package test1;

public class t14 {
	public static void main(String[] args) {
		int num = 13;
		String ans="";
		while(num>0)
		{
			int rem = num%2;
			ans = rem + ans;
			num /=2;
		}
		System.out.println(ans);
	}
}
