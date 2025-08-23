package test1;

import java.util.*;

public class t152 {
    public static void main(String[] args) {
        
        // ---------------- HashSet ----------------
        System.out.println("---- HashSet Example ----");
        HashSet<Integer> hashSet = new HashSet<>();
        
        // add()
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // duplicate, will not be added
        System.out.println("HashSet after add: " + hashSet);

        // contains()
        System.out.println("HashSet contains 20? " + hashSet.contains(20));

        // remove()
        hashSet.remove(30);
        System.out.println("HashSet after remove(30): " + hashSet);

        // size()
        System.out.println("HashSet size: " + hashSet.size());

        // isEmpty()
        System.out.println("HashSet empty? " + hashSet.isEmpty());

        // iteration
        System.out.print("Iterating HashSet: ");
        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        // ---------------- LinkedHashSet ----------------
        System.out.println("---- LinkedHashSet Example ----");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // add()
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple"); // duplicate ignored
        System.out.println("LinkedHashSet after add: " + linkedHashSet);

        // contains()
        System.out.println("Contains Banana? " + linkedHashSet.contains("Banana"));

        // remove()
        linkedHashSet.remove("Mango");
        System.out.println("After remove(Mango): " + linkedHashSet);

        // size()
        System.out.println("Size: " + linkedHashSet.size());

        // clear()
        LinkedHashSet<String> copySet = new LinkedHashSet<>(linkedHashSet);
        linkedHashSet.clear();
        System.out.println("After clear(): " + linkedHashSet);
        System.out.println("Copy of old LinkedHashSet: " + copySet);

        // Iteration
        System.out.print("Iterating LinkedHashSet: ");
        for (String fruit : copySet) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");


        // ---------------- TreeSet ----------------
        System.out.println("---- TreeSet Example ----");
        TreeSet<Integer> treeSet = new TreeSet<>();

        // add()
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);
        System.out.println("TreeSet (Sorted): " + treeSet);

        // first() and last()
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // higher() and lower()
        System.out.println("Higher than 20: " + treeSet.higher(20));
        System.out.println("Lower than 20: " + treeSet.lower(20));

        // headSet(), tailSet(), subSet()
        System.out.println("HeadSet(<30): " + treeSet.headSet(30));
        System.out.println("TailSet(>=30): " + treeSet.tailSet(30));
        System.out.println("SubSet(20 to 40): " + treeSet.subSet(20, 40));

        // remove()
        treeSet.remove(30);
        System.out.println("After remove(30): " + treeSet);

        // descendingSet()
        System.out.println("Descending order: " + treeSet.descendingSet());

        // Iteration
        System.out.print("Iterating TreeSet: ");
        for (Integer i : treeSet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*OUTPUT
 ---- HashSet Example ----
HashSet after add: [20, 10, 30]
HashSet contains 20? true
HashSet after remove(30): [20, 10]
HashSet size: 2
HashSet empty? false
Iterating HashSet: 20 10 

---- LinkedHashSet Example ----
LinkedHashSet after add: [Apple, Banana, Mango]
Contains Banana? true
After remove(Mango): [Apple, Banana]
Size: 2
After clear(): []
Copy of old LinkedHashSet: [Apple, Banana]
Iterating LinkedHashSet: Apple Banana 

---- TreeSet Example ----
TreeSet (Sorted): [10, 20, 30, 40, 50]
First element: 10
Last element: 50
Higher than 20: 30
Lower than 20: 10
HeadSet(<30): [10, 20]
TailSet(>=30): [30, 40, 50]
SubSet(20 to 40): [20, 30]
After remove(30): [10, 20, 40, 50]
Descending order: [50, 40, 20, 10]
Iterating TreeSet: 10 20 40 50 
 */