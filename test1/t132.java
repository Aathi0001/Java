package test1;

import java.util.*;

//✅ Interface
interface Greeting132 {
 void sayHello();
}

//✅ Abstract class
abstract class Animal132 {
 abstract void sound();

 void sleep() {
     System.out.println("Animal is sleeping...");
 }
}

public class t132 {

 public static void main(String[] args) {

     // ✅ Anonymous class implementing interface
     Greeting132 g = new Greeting132() {
         public void sayHello() {
             System.out.println("Hello from anonymous interface implementation!");
         }
     };
     g.sayHello();

     // ✅ Anonymous class extending abstract class
     Animal132 cat = new Animal132() {
         void sound() {
             System.out.println("Meow Meow from anonymous abstract class!");
         }
     };
     cat.sound();
     cat.sleep();

     // ✅ Thread using anonymous class extending Thread
     Thread thread1 = new Thread() {
         public void run() {
             System.out.println("Thread running using anonymous Thread class!");
         }
     };
     thread1.start();

     // ✅ Thread using anonymous class implementing Runnable
     Runnable r = new Runnable() {
         public void run() {
             System.out.println("Runnable running using anonymous class!");
         }
     };
     Thread thread2 = new Thread(r);
     thread2.start();

     // ✅ Comparator using anonymous class
     List<String> names = Arrays.asList("Ram", "Aathi", "Bala");
     Collections.sort(names, new Comparator<String>() {
         public int compare(String a, String b) {
             return b.compareTo(a); // descending
         }
     });
     System.out.println("Sorted using Comparator (anonymous class): " + names);

     // ✅ Comparator using Lambda expression (short form)
     Collections.sort(names, (a, b) -> a.compareTo(b)); // ascending
     System.out.println("Sorted using Comparator (lambda): " + names);
 }
}
