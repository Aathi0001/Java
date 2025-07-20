package test1;

public class t5 {
	
	public static void main(String[] args) {
		byte a = 10,b = 20;
		int c = a+b;
		System.out.println(c);
		
		String d = "Hello" + "How Are You";
		String e = 2.3 + " Hello";
		String f = 10+20+" Hello "+30+40;
		String g = 10+20+" Hello "+(30+40);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}
/*
Arithmetic Operations in Java for All Primitive Data Types + String Concatenation:

1. byte (8-bit signed integer)
   - Operators: +, -, *, /, %
   - Example: byte b = (byte)(10 + 20); // auto promoted to int

2. short (16-bit signed integer)
   - Operators: +, -, *, /, %
   - Example: short s = (short)(100 * 2);

3. int (32-bit signed integer)
   - Operators: +, -, *, /, %
   - Example: int result = 10 + 5;

4. long (64-bit signed integer)
   - Operators: +, -, *, /, %
   - Example: long sum = 100000L + 200000L;

5. float (32-bit floating point)
   - Operators: +, -, *, /, %
   - Example: float avg = 10.5f / 2.0f;

6. double (64-bit floating point)
   - Operators: +, -, *, /, %
   - Example: double div = 15.0 / 4.0;

7. char (16-bit Unicode character)
   - Arithmetic allowed with +, -, *, /, %
   - Based on ASCII values
   - Example: char c = (char)('A' + 1); // result: 'B'

8. boolean
   - No arithmetic operations allowed
   - Only logical: && (AND), || (OR), ! (NOT)

9. String (non-primitive, but commonly used)
   - Supports only `+` for **concatenation**
   - Example 1: String s = "Age: " + 25;     // "Age: 25"
   - Example 2: String s = 25 + " years old"; // "25 years old"
   - Works with any value type (int, float, char, boolean, etc.)

   Important:
   - If a String appears first: everything after is treated as a string.
     Example: "Hello " + 5 + 10 → "Hello 510"
   - If values come first: they are calculated first.
     Example: 5 + 10 + " Hello" → "15 Hello"
*/
