package test1;

public class t27 {
	public static void Arithmetic(int a, int b){
		
		System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
		
	}
	public static void Assignment(int x){
		
		    System.out.println("\nAssignment Operators:");
		    int a = 2;
		    int original = x;

		    String[] ops = {"+=", "-=", "*=", "/=", "%="};

		    for (String op : ops) {  //for each loop (variable : array)
		        x = original; 

		        switch (op) {
		            case "+=":				
		                x += a;
		                break;
		            case "-=":
		                x -= a;
		                break;
		            case "*=":
		                x *= a;
		                break;
		            case "/=":
		                x /= a;
		                break;
		            case "%=":
		                x %= a;
		                break;
		        }

		        System.out.println(op + " -> " + x);
		    }
		}

	public static void Relational(int a, int b) {
		System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
		
	}
	
	public static void Logical(int a, int b) {
		System.out.println("\nLogical Operators:");
        System.out.println("(a>b) && (a<b): " + ((a>b) && (a<b))); // true
        System.out.println("(a>b) || (a<b): " + ((a>b) || (a<b))); // true
        System.out.println("!(a>b): " + (!(a>b)));                  // false
	}
	
    public static void Unary(int x) {
    	System.out.println("\nUnary Operators");
    	int original = x;
    	String[] op = { "+x", "-x", "++x", "x++", "--x", "x--"};
    	for (String ops : op) {
    	    x=original;
    		
    		switch(ops) {
    		
    			case "+x":{
    				x=+x;
    				break;
    			}
    			case "-x":{
    				x=-x;
    				break;
    			}
    			case "++x":{
    				++x;
    				break;
    			}
    			case "x++":{
    				x++;
    				break;
    			}
    			case "--x":{
    				--x;
    				break;
    			}
    			case "x--":{
    				x--;
    				break;
    			}
    		}
    		System.out.println(ops + " -> " + x);
    			
    	}
    }
	
    public static void Ternary(int a) {
    	System.out.println("\nTernary Operator:");
    	System.out.println("Even Or Odd: "+ (a%2==0 ? "Even":"Odd"));
    }
    
    public static void Bitwise(int a, int b) {
    	System.out.println("\nBitwise Operators:");
    	int temp1 = a, temp2 = b;
    	String[] op = { "a&b", "a|b", "a^b", "~a", "a>>b", "a<<b"};
    	for (String ops : op) {
    	    a=temp1; 
    	    b=temp2;
    	    int c=0;
    		
    		switch(ops) {
    		
    			case "a&b":{				// Bitwise AND
    				c=a&b;
    				break;
    			}
    			case "a|b":{				// Bitwise OR
    				c=a|b;
    				break;
    			}
    			case "a^b":{				// Bitwise XOR
    				c=a ^ b;
    				break;
    			}
    			case "~a":{					// Bitwise NOT
    				c=~a;
    				break;
    			}
    			case "a>>b":{				// LEFT SHIHT
    				c=a>>b;
    				break;
    			}
    			case "a<<b":{				// RIGHT SHIFT
    				c=a<<b;
    				break;
    			}
    		}
    		System.out.println(ops + " -> " + c);
    		
    		
    		
    		/*
    		a = 5  -> 0101
    		b = 3  -> 0011

    		a & b  -> 0101 & 0011 = 0001 = 1        // Bitwise AND: Only bits that are 1 in both a and b
    		a | b  -> 0101 | 0011 = 0111 = 7        // Bitwise OR: Bits that are 1 in either a or b
    		a ^ b  -> 0101 ^ 0011 = 0110 = 6        // Bitwise XOR: Bits that are different in a and b
    		~a     -> ~0101 = 1010 = -6      -> -(5+1)=-6        // Bitwise NOT: Inverts all bits of a (2's complement result)
    		a >> b -> 0101 >> 3 = 0000 = 0          // Right shift: Shifts bits of a to the right by 3 positions
    		a << b -> 0101 << 3 = 0101 000 = 40     // Left shift: Shifts bits of a to the left by 3 positions (a * 2^3)
    		*/

    			
    	}
    	
    	
    }
	public static void main(String[] args) {
		Arithmetic(4,2);
		Assignment(10);
		Relational(20, 10);
		Logical(10,20);
		Unary(10);
		Ternary(20);
		Bitwise(5, 3);
		
	}

}
