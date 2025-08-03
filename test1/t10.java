package test1;

import java.util.Scanner;

public class t10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;
		do {

			System.out.println("1.A \n2.B \n3.Exit");
			System.out.println("Enter YOur Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("A");
				break;
			}
			case 2: {
				System.out.println("B");
				break;
			}
			case 3: {
				flag = false;
				break;
			}

			}
		} while (flag);

		System.out.println("Thank You!");

	}
}


/*
🔁 do-while Loop in Java

Definition:
-------------
The `do-while` loop is a control flow statement that 
executes a block of code **at least once**, and then 
repeats the loop **as long as the condition is true**.

🧠 Key Feature:
- The condition is checked **after** the loop body runs.
- So, the loop body **always executes at least once**, 
  even if the condition is false initially.

Syntax:
---------
do {
    // Code block to execute
} while (condition);

Example:
----------
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 5);

Output:
--------
i = 1
i = 2
i = 3
i = 4
i = 5

Use Cases:
-----------
✔️ When you want user input or code to run at least once  
✔️ Menu-driven programs  
✔️ Repeated prompting or validation  

Comparison with while loop:
-----------------------------
- `while` checks condition **before** first run
- `do-while` checks condition **after** first run

*/






/*
🔄 switch Statement in Java

Definition:
------------
The `switch` statement is used to select one of many code blocks to be executed,
based on the value of a variable or expression.

Syntax:
--------
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    ...
    default:
        // default code block (optional)
}

Rules:
-------
- The `expression` must result in: `byte`, `short`, `int`, `char`, `String`, or `enum` (Java 7+)
- Each `case` value must be **unique and constant**
- `break` stops execution after a case block
- If `break` is **omitted**, the next case will execute too (**fall-through** behavior)
- `default` runs if no case matches (like `else` in `if-else`)

Example:
---------
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

Output:
--------
Wednesday

Use Cases:
-----------
- Menu-driven programs
- Simple decision trees
- Replacing long `if-else-if` ladders for better readability

*/
