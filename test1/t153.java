package test1;

import java.util.*;

public class t153 {
    public static void main(String[] args) {

        // ---------------- PriorityQueue ----------------
        System.out.println("---- PriorityQueue Example ----");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add() / offer()
        pq.add(30);
        pq.add(10);
        pq.offer(20);
        pq.offer(40);
        System.out.println("PriorityQueue: " + pq); // not guaranteed order, but min at head

        // peek() -> retrieves head without removing
        System.out.println("Peek: " + pq.peek());

        // poll() -> retrieves and removes head
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);

        // remove() -> removes head
        pq.remove();
        System.out.println("After remove(): " + pq);

        // contains()
        System.out.println("Contains 20? " + pq.contains(20));

        // size()
        System.out.println("Size: " + pq.size());

        // iteration
        System.out.print("Iterating PriorityQueue: ");
        for (Integer i : pq) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        // ---------------- ArrayDeque ----------------
        System.out.println("---- ArrayDeque Example ----");
        ArrayDeque<String> ad = new ArrayDeque<>();

        // add(), addFirst(), addLast()
        ad.add("A");
        ad.add("B");
        ad.addFirst("Start");
        ad.addLast("End");
        System.out.println("ArrayDeque after adds: " + ad);

        // offer(), offerFirst(), offerLast()
        ad.offer("X");
        ad.offerFirst("First");
        ad.offerLast("Last");
        System.out.println("After offers: " + ad);

        // peek(), peekFirst(), peekLast()
        System.out.println("Peek: " + ad.peek());
        System.out.println("PeekFirst: " + ad.peekFirst());
        System.out.println("PeekLast: " + ad.peekLast());

        // poll(), pollFirst(), pollLast()
        System.out.println("Poll: " + ad.poll());
        System.out.println("PollFirst: " + ad.pollFirst());
        System.out.println("PollLast: " + ad.pollLast());
        System.out.println("After polls: " + ad);

        // removeFirst(), removeLast()
        ad.removeFirst();
        ad.removeLast();
        System.out.println("After removeFirst & removeLast: " + ad);

        // contains()
        System.out.println("Contains B? " + ad.contains("B"));

        // size()
        System.out.println("Size: " + ad.size());

        // iteration
        System.out.print("Iterating ArrayDeque: ");
        for (String s : ad) {
            System.out.print(s + " ");
        }
        System.out.println("\n");


        // ---------------- LinkedList (as Queue) ----------------
        System.out.println("---- LinkedList Queue Example ----");
        Queue<String> q = new LinkedList<>();

        // add() / offer()
        q.add("One");
        q.add("Two");
        q.offer("Three");
        q.offer("Four");
        System.out.println("LinkedList Queue: " + q);

        // peek()
        System.out.println("Peek: " + q.peek());

        // element() -> like peek() but throws exception if empty
        System.out.println("Element: " + q.element());

        // poll() -> removes head
        System.out.println("Poll: " + q.poll());
        System.out.println("After poll: " + q);

        // remove() -> removes head
        q.remove();
        System.out.println("After remove(): " + q);

        // contains()
        System.out.println("Contains Three? " + q.contains("Three"));

        // size()
        System.out.println("Size: " + q.size());

        // iteration
        System.out.print("Iterating LinkedList Queue: ");
        for (String s : q) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}


/*  OUTPUT
 ---- PriorityQueue Example ----
PriorityQueue: [10, 30, 20, 40]
Peek: 10
Poll: 10
After poll: [20, 30, 40]
After remove(): [30, 40]
Contains 20? false
Size: 2
Iterating PriorityQueue: 30 40 

---- ArrayDeque Example ----
ArrayDeque after adds: [Start, A, B, End]
After offers: [First, Start, A, B, End, X, Last]
Peek: First
PeekFirst: First
PeekLast: Last
Poll: First
PollFirst: Start
PollLast: Last
After polls: [A, B, End, X]
After removeFirst & removeLast: [B, End]
Contains B? true
Size: 2
Iterating ArrayDeque: B End 

---- LinkedList Queue Example ----
LinkedList Queue: [One, Two, Three, Four]
Peek: One
Element: One
Poll: One
After poll: [Two, Three, Four]
After remove(): [Three, Four]
Contains Three? true
Size: 2
Iterating LinkedList Queue: Three Four 
*/
