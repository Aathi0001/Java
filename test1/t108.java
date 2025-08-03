package test1;

class Child107 extends t107 {
    String name = "Child"; // Shadows parent 'name' variable

    public void show() {
        System.out.println("Name in Child: " + name);          // Child's variable
        System.out.println("Name from Parent: " + super.name); // Accessing parent's variable
    }
}

public class t108 {
    public static void main(String[] args) {
        Child107 obj = new Child107();
        obj.show();
        System.out.println(obj.name);
        t107 obj2 = new t107();
        System.out.println(obj2.name);
    }
}
