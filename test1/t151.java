package test1;

import java.util.*;

public class t151 {
    public static void main(String[] args) {
        
        // ------------------- ARRAYLIST -------------------
        System.out.println("=== ArrayList Demo ===");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add(1, "Orange"); // Insert at index
        System.out.println("ArrayList: " + arrayList);

        arrayList.remove("Banana");
        arrayList.set(1, "Grapes");
        System.out.println("After modifications: " + arrayList);
        System.out.println("Get index 0: " + arrayList.get(0));
        System.out.println("Contains Mango? " + arrayList.contains("Mango"));
        System.out.println("Size: " + arrayList.size());

        // Iteration
        for (String fruit : arrayList) {
            System.out.println("Fruit: " + fruit);
        }

        // ------------------- LINKEDLIST -------------------
        System.out.println("\n=== LinkedList Demo ===");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);   // Add at beginning
        linkedList.addLast(40);   // Add at end
        System.out.println("LinkedList: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removals: " + linkedList);

        System.out.println("Peek First: " + linkedList.peekFirst());
        System.out.println("Peek Last: " + linkedList.peekLast());

        // ------------------- VECTOR -------------------
        System.out.println("\n=== Vector Demo ===");
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        vector.addElement("Yellow"); // Legacy method
        System.out.println("Vector: " + vector);

        vector.remove("Green");
        System.out.println("After removal: " + vector);
        System.out.println("Element at index 1: " + vector.get(1));
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Size: " + vector.size());

        // ------------------- STACK -------------------
        System.out.println("\n=== Stack Demo ===");
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());   // Top element
        System.out.println("Pop: " + stack.pop());     // Removes top
        System.out.println("After pop: " + stack);

        System.out.println("Search 'A': " + stack.search("A")); // Position from top
        System.out.println("Is Empty? " + stack.isEmpty());
    }
}


/*  OUTPUT
=== ArrayList Demo ===
ArrayList: [Apple, Orange, Banana, Mango]
After modifications: [Apple, Grapes, Mango]
Get index 0: Apple
Contains Mango? true
Size: 3
Fruit: Apple
Fruit: Grapes
Fruit: Mango

=== LinkedList Demo ===
LinkedList: [5, 10, 20, 30, 40]
After removals: [10, 20, 30]
Peek First: 10
Peek Last: 30

=== Vector Demo ===
Vector: [Red, Green, Blue, Yellow]
After removal: [Red, Blue, Yellow]
Element at index 1: Blue
Capacity: 10
Size: 3

=== Stack Demo ===
Stack: [A, B, C]
Peek: C
Pop: C
After pop: [A, B]
Search 'A': 2
Is Empty? false

*/