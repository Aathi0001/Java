package test1;

class Student135 implements Cloneable {
    int id;
    String name;

    Student135(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override clone()
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + "}";
    }
}

public class t135 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student135 s1 = new Student135(101, "Aathi");

        Student135 s2 = (Student135) s1.clone(); // cloning

        System.out.println("Original: " + s1);
        System.out.println("Cloned  : " + s2);

        System.out.println("Same object? " + (s1 == s2)); // false
    }
}

