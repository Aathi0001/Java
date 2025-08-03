package test1;

interface Printer {
    void print(String message);
}

public class t126 {
    public void show(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        t126 obj = new t126();
        Printer ref = obj::show;
        ref.print("Hello Aathi!");
    }
}

//object::instanceMethod