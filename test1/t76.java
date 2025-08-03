// File: t76.java
package test1;

public class t76 {
    public static void main(String[] args) {
        t75 student = new t75();     // Create object

        student.setName("Aathi Siva Ganesh");
        student.setAge(21);          // Valid

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        student.setAge(-5);          // Invalid age, handled safely
    }
}
