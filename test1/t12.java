package test1;

import java.util.Scanner;

public class t12 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = true;
		do {
		System.out.println("Enter the number (or 0 to exit):");
		int x = sc.nextInt();
		System.out.println("Enter the Power (or 0 to exit):");
		int y = sc.nextInt();
		if(x==0 && y==0) {
			flag = false;
			break;
		}
		int power=1;
		for(int i=1;i<=y;i++) {
		     power *= x;
		}
		System.out.println(power);
	}while(flag);{
		System.out.println("Exit");
	}
}
}
/*
🔁 for Loop in Java

Definition:
-------------
The `for` loop is a control structure used to repeat a block of code
a specific number of times.

🧠 It has three parts:
   1. Initialization     → Runs once at the start
   2. Condition           → Checked before every iteration
   3. Update/Increment    → Runs after each iteration

Syntax:
---------
for (initialization; condition; update) {
    // Code block to execute repeatedly
}

Example:
----------
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}

Output:
---------
i = 1  
i = 2  
i = 3  
i = 4  
i = 5

Flow:
------
1. `int i = 1` → start with i = 1
2. Check `i <= 5` → true, run the loop body
3. After loop body, do `i++` → i becomes 2
4. Repeat steps 2–3 until condition becomes false

Use Cases:
-----------
✔ Looping from a known start to end  
✔ Running a fixed number of times  
✔ Iterating over arrays or collections (via enhanced for loop)

Variants:
-----------
- `for (int i = n; i >= 1; i--)` → reverse loop
- `for (int i = 0; i < array.length; i++)` → loop through array
*/
