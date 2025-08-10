package test1;

import java.util.*;

public class t148 {
    public static void main(String[] args) {
        // List (ArrayList) - Strings only
        List<String> list = new ArrayList<>();
        list.add("Apple");
        // list.add(100); // ❌ Compile-time error
        System.out.println("Generic List: " + list);

        // Set (HashSet) - Integers only
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        System.out.println("Generic Set: " + set);

        // Queue (LinkedList) - Strings only
        Queue<String> queue = new LinkedList<>();
        queue.add("Car");
        queue.add("Bus");
        System.out.println("Generic Queue: " + queue);

        // Map (HashMap) - Integer keys, String values
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Dog");
        map.put(2, "Cat");
        System.out.println("Generic Map: " + map);
    }
}

