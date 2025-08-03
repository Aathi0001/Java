package test1;

import java.io.Serializable;

// 🔹 Java Bean Class with Serializable
public class t83 implements Serializable {

    // Recommended: define serialVersionUID
    private static final long serialVersionUID = 1L;

    // 🔐 Private fields
    private int id;
    private String name;
    private double salary;

    // ✅ Public no-arg constructor
    public t83() {}

    // ✅ Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // ✅ Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
