package test1;

@FunctionalInterface
interface Calculator122 {
    int operate(int a, int b);  // only one abstract method
}

public class t122 {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator122 add = (a, b) -> a + b;

        // Lambda expression for multiplication
        Calculator122 multiply = (a, b) -> a * b;

        System.out.println("Add: " + add.operate(5, 3));         // Output: 8
        System.out.println("Multiply: " + multiply.operate(5, 3)); // Output: 15
    }
}


//Interface with exactly one abstract method.
//Used with Lambda Expressions.