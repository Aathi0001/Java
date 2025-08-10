package test1;

import java.util.*;

//1️⃣ Generic Class (Single Type Parameter)
class Box<T> {
 private T value;

 public void set(T value) {
     this.value = value;
 }

 public T get() {
     return value;
 }
}

//2️⃣ Generic Class (Multiple Type Parameters)
class Pair<K, V> {
 private K key;
 private V value;

 public Pair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 public K getKey() { return key; }
 public V getValue() { return value; }
}

//3️⃣ Generic Method
class GenericMethod {
 public <T> void printArray(T[] array) {
     for (T item : array) {
         System.out.print(item + " ");
     }
     System.out.println();
 }
}

//4️⃣ Upper Bound Example (`extends`)
class Calculator {
 public <T extends Number> double sum(T a, T b) {
     return a.doubleValue() + b.doubleValue();
 }
}

//5️⃣ Lower Bound Example (`super`)
class Printers {
 public void printList(List<? super Integer> list) {
     for (Object obj : list) {
         System.out.print(obj + " ");
     }
     System.out.println();
 }
}

//6️⃣ Wildcards Example
class WildcardExample {
 // Upper Bounded Wildcard
 public void showNumbers(List<? extends Number> list) {
     for (Number n : list) {
         System.out.print(n + " ");
     }
     System.out.println();
 }

 // Unbounded Wildcard
 public void showAnyList(List<?> list) {
     for (Object o : list) {
         System.out.print(o + " ");
     }
     System.out.println();
 }
}

public class t149 {
 public static void main(String[] args) {
     
     // ✅ Generic Class Example
     Box<String> stringBox = new Box<>();
     stringBox.set("Hello Generics");
     System.out.println("Box contains: " + stringBox.get());

     Box<Integer> intBox = new Box<>();
     intBox.set(100);
     System.out.println("Box contains: " + intBox.get());

     // ✅ Multiple Type Parameter Example
     Pair<Integer, String> pair = new Pair<>(1, "One");
     System.out.println(pair.getKey() + " => " + pair.getValue());

     // ✅ Generic Method Example
     GenericMethod gm = new GenericMethod();
     Integer[] nums = {1, 2, 3};
     String[] words = {"A", "B", "C"};
     gm.printArray(nums);
     gm.printArray(words);

     // ✅ Upper Bound Example
     Calculator calc = new Calculator();
     System.out.println("Sum: " + calc.sum(5, 10));      // int
     System.out.println("Sum: " + calc.sum(5.5, 2.3));  // double

     // ✅ Lower Bound Example
     Printers printer = new Printers();
     List<Number> numbers = Arrays.asList(1, 2.5, 3);
     printer.printList(numbers); // Accepts Integer, Number, Object

     // ✅ Wildcards Example
     WildcardExample wc = new WildcardExample();
     List<Integer> intList = Arrays.asList(1, 2, 3);
     List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
     List<String> stringList = Arrays.asList("X", "Y", "Z");

     wc.showNumbers(intList);
     wc.showNumbers(doubleList);
     wc.showAnyList(stringList);
 }
}
