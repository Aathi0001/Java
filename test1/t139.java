package test1;

//Custom Checked Exception
class MyCheckedException extends Exception {
 public MyCheckedException(String msg) {
     super(msg);
 }
}

public class t139 {
 public static void main(String[] args) {
	 System.out.println("Start Main");
     try {
         method1();
     } catch (MyCheckedException e) {
         System.out.println("❌ Caught in main: " + e.getMessage());
     }
     System.out.println("End Main");
 }
  
 static void method1() throws MyCheckedException {
	 System.out.println("Start M1");
	 try {
         method2();
     } catch (MyCheckedException e) {
         System.out.println("❌ Caught in main: " + e.getMessage());
     }
     System.out.println("End M1");
 }

 static void method2() throws MyCheckedException {
	 System.out.println("Start M2");
     method3();
     System.out.println("End M2");
 }

 static void method3() throws MyCheckedException {
	 System.out.println("Start M3");
     throw new MyCheckedException("Something went wrong in method3");
 }
}


//main() → method1() → method2() → method3()

//method3() throws MyCheckedException → Must declare throws in all methods until caught.

//[method3()]  throws MyCheckedException
//↓  declared with throws
//[method2()]  throws MyCheckedException
//↓
//[method1()]  throws MyCheckedException
//↓
//[main()]  ✅ Catch block found → Handle it
