package test1;

public class t147 {
	    static void test(Object o) {
	        System.out.println("Object method");
	    }
	    static void test(Number n) {
	        System.out.println("Number method");
	    }
	    static void test(Integer i) {
	        System.out.println("Integer method");
	    }
	    static void test(Float i) {
	        System.out.println("Float method");
	    }

    public static void main(String[] args) {
        Number n = Integer.valueOf(100);  // Number reference, Integer object
        Number n1 = 2.3;
//        Number n2 = 'A';   CTE
        

        // Using Number methods
        System.out.println(n.intValue());   // 100
        System.out.println(n.doubleValue()); // 100.0		
        System.out.println(n1);
        // Assigning to Object
        Object obj = Integer.valueOf(200); // Object reference
        Object obj1 = 2.4;
        Object obj2 = 'A';
        
        System.out.println(obj); // Calls toString() -> 200        
        System.out.println(obj1);		// obj1 --> double --> object
        System.out.println(obj2);		//obj2 --> char --> object
        
        test(10.2); // Which one?
        test('A'); // Which one?
        test(10.10f); // Which one?
        test(10); // Which one?
        
        
    }
}
