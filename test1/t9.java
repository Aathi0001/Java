package test1;

import java.util.Scanner;

public class t9 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = true;
		do {
		System.out.println("Enter the number (0 to Exit):");
		int num = sc.nextInt();
		if (num == 0) {
            flag = false;
            break;
        }
	    int rev = 0;
	    int temp = num;
	    while(num > 0)
	    {
	    	rev=(rev*10)+(num%10);
	    	num/=10;
	    }
	    if(rev==temp) {
	    	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not a Palindrome");
	    }}while(flag);{
	    	System.out.println("Exit");
	    }
	}

}
/*
🔁 Palindrome Number in Java

Definition:
------------
A **palindrome number** is a number that remains the same 
when its digits are reversed.

📌 In other words:
   If original number == reversed number → It's a palindrome

Examples:
----------
1. 121 → reversed = 121 ✅ Palindrome
2. 12321 → reversed = 12321 ✅ Palindrome
3. 123 → reversed = 321 ❌ Not a palindrome
4. 1001 → reversed = 1001 ✅ Palindrome
5. 1230 → reversed = 0321 ❌ Not a palindrome

Approach:
----------
1. Store the original number.
2. Reverse the number using a loop.
3. Compare the reversed number with the original.

Note:
-----
- Works only with integers (no decimals or negative signs).
- You can also check string-based palindromes (like "madam", "racecar").
*/
