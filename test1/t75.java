// File: t75.java
package test1;

public class t75 {
    // 🔒 private variables (encapsulated)
    private String name;
    private int age;

    // ✅ public getter for name
    public String getName() {
        return name;
    }

    // ✅ public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // ✅ public getter for age
    public int getAge() {
        return age;
    }

    // ✅ public setter for age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}
