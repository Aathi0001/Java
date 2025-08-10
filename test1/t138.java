package test1;

public class t138 {
    public static void main(String[] args) {
    	System.out.println("Start Main");
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e);
        }
        System.out.println("End Main");
    }

    static void method1() {
    	System.out.println("Start M1");
        method2();
        System.out.println("End M1");
    }

    static void method2() {
    	System.out.println("Start M2");
        method3();
        System.out.println("End M2");
    }

    static void method3() {
    	System.out.println("Start M3");
//        int result = 10 / 0; // ArithmeticException (unchecked)
        throw new ArithmeticException();
//        System.out.println("End M3");
    }
}



//main() → method1() → method2() → method3()

//method3() throws ArithmeticException → No catch here → Goes back to method2() → No catch → Goes to method1() → No catch → Finally to main() → catch found.

//[method3()]  ❌ ArithmeticException
//↓  No catch here
//[method2()]  ❌ No catch
//↓
//[method1()]  ❌ No catch
//↓
//[main()]  ✅ Catch block found → Handle it
