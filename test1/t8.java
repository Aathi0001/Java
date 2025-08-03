package test1;

import java.util.Scanner;

public class t8 {//Xylem or Phloem number
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = true;
		do {
		System.out.println("Enter the Number (0 to exit):");
		int num = sc.nextInt();
		if(num == 0) {
			flag = false;
			break;
		}
		int lastdigit = num%10;
		int firstdigit = 0;
		int middlevalue = 0;
		num/=10;
		while(num > 9) {
			int digit = num%10;
			middlevalue += digit;
			
			num/=10;
		}
		firstdigit = num;
		
		int sum = firstdigit + lastdigit;
		if(sum==middlevalue) {
		System.out.println("It is Xylem Number");
		}
		else {
		System.out.println("It is Phleom Number");
		}
		}while(flag);{
			System.out.println("Exit");
		}
	}

}
/*
📘 Xylem Number in Java (Math Concept)

Definition:
------------
A number is called a **Xylem Number** if the **sum of the first and last digits**
(extreme digits) is equal to the **sum of the remaining middle digits** (mean digits).

If not equal, the number is called a **Phloem Number**.

📌 Formula:
   - extremeSum = firstDigit + lastDigit
   - meanSum    = sum of all digits in between

Examples:
----------

1. Number: 121
   - First Digit: 1
   - Last Digit: 1
   - Middle Digit: 2
   - extremeSum = 1 + 1 = 2
   - meanSum    = 2
   → ✅ Xylem Number

2. Number: 1542
   - First Digit: 1
   - Last Digit: 2
   - Middle Digits: 5, 4 → meanSum = 9
   - extremeSum = 1 + 2 = 3
   → ❌ Phloem Number

3. Number: 12321
   - First: 1, Last: 1 → extremeSum = 2
   - Middle: 2 + 3 + 2 = 7
   → ❌ Phloem Number

Tips:
-----
✔ Works only for numbers with 3 or more digits.
✔ Often used in number pattern problems or coding exercises.

*/
