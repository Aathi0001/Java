package test1;

public class t105 {
    String name;
    int age;

    // Default constructor
    public t105() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one argument
    public t105(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two arguments
    public t105(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
