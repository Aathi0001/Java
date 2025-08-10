package test1;

import java.io.*;

//Class must implement Serializable
class Employee implements Serializable {
 String name;
 int age;
 transient double salary; // This will not be serialized

 public Employee(String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
 }
}

public class t144 {
 public static void main(String[] args) {
     String filename = "D://employee.ser";

     // 1️⃣ Serialization
     try {
         Employee emp = new Employee("John", 30, 50000.75);

         FileOutputStream fos = new FileOutputStream(filename);
         ObjectOutputStream oos = new ObjectOutputStream(fos);

         oos.writeObject(emp);
         oos.close();
         fos.close();

         System.out.println("✅ Object serialized: " + emp.name + ", Age: " + emp.age + ", Salary: " + emp.salary);
     } catch (IOException e) {
         e.printStackTrace();
     }

     // 2️⃣ Deserialization
     try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);

         Employee emp = (Employee) ois.readObject();
         ois.close();
         fis.close();

         System.out.println("📦 Object deserialized:");
         System.out.println("Name: " + emp.name);
         System.out.println("Age: " + emp.age);
         System.out.println("Salary (transient): " + emp.salary); // Will be 0.0 because transient fields are not saved

     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
