package test1;

import java.util.*;

class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Sort by length first, then alphabetically if lengths are equal
        if (s1.length() != s2.length()) {
            return s1.length() - s2.length();
        }
        return s1.compareTo(s2);
    }
}

public class t150 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Apple", "Banana", "Kiwi", "Orange", "Papaya"));

        System.out.println("Original List: " + fruits);

        // 1. Natural sorting (alphabetical order)
        Collections.sort(fruits);
        System.out.println("Sorted (Natural Order): " + fruits);

        // 2. Sorting using custom comparator class
        Collections.sort(fruits, new CustomComparator());
        System.out.println("Sorted (Custom Comparator - Length then Alphabet): " + fruits);

        // 3. Sorting using Lambda expression (Reverse alphabetical order)
        Collections.sort(fruits, (a, b) -> b.compareTo(a));
        System.out.println("Sorted (Lambda - Reverse Alphabetical): " + fruits);
        
        // 4. Sorting using Lambda by length directly
        fruits.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Sorted (Lambda - By Length): " + fruits);
    }
}
