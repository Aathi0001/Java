package test1;

interface MessagePrinter {
    void print();
}

public class t125 {
    public static void displayMessage() {
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        MessagePrinter ref = t125::displayMessage;  // Method reference
        ref.print();  // Calls displayMessage()
    }
}

//ClassName::staticMethod