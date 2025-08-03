package test1;

interface Notification {
    void sendmessage(String message);  // interface method
}

// Implementing class
class Email implements Notification {
    public void sendmessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// Another implementing class
class SMS implements Notification {
    public void sendmessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class t120 {
    public static void main(String[] args) {
        Notification ref1 = new Email(); // upcasting
        ref1.sendmessage("Hi");          // Output: Sending Email: Hi

        Notification ref2 = new SMS();
        ref2.sendmessage("Hello");       // Output: Sending SMS: Hello
    }
}
