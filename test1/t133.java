package test1;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 🔹 Override toString() to print readable info
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    // 🔹 Override equals() to compare by id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // same reference
        if (o == null || getClass() != o.getClass()) return false;
        Student other = (Student) o;
        return this.id == other.id && this.name.equals(other.name);
    }

    // 🔹 Override hashCode() to ensure consistent hashing
    @Override
    public int hashCode() {
        return id * 31 + name.hashCode();
    }
}

public class t133 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aathi");
        Student s2 = new Student(101, "Aathi");
        Student s3 = new Student(102, "Bala");
        
        System.out.println(s1.getClass());

        // 🔸 toString()
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // ❌ Without overriding toString():
        // Output would be like: Student@15db9742 (not readable)

        // 🔸 equals()
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false

        // ❌ Without overriding equals():
        // Output would be: false (because different memory locations)

        // 🔸 hashCode()
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());

        // ❌ Without overriding hashCode():
        // s1 and s2 would have different hash codes even if they are equal
    }
}
