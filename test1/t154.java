package test1;

import java.util.*;

public class t154 {
    public static void main(String[] args) {

        // ---------------- HashMap ----------------
        System.out.println("---- HashMap Example ----");
        HashMap<Integer, String> hm = new HashMap<>();

        // put()
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(null, "NullKey"); // HashMap allows one null key
        hm.put(4, null); // multiple null values allowed
        System.out.println("HashMap: " + hm);

        // get()
        System.out.println("Get key 2: " + hm.get(2));

        // containsKey() & containsValue()
        System.out.println("Contains key 3? " + hm.containsKey(3));
        System.out.println("Contains value 'Two'? " + hm.containsValue("Two"));

        // remove()
        hm.remove(2);
        System.out.println("After remove(2): " + hm);

        // replace()
        hm.replace(3, "ThreeUpdated");
        System.out.println("After replace: " + hm);

        // putIfAbsent()
        hm.putIfAbsent(5, "Five");
        System.out.println("After putIfAbsent: " + hm);

        // keySet(), values(), entrySet()
        System.out.println("KeySet: " + hm.keySet());
        System.out.println("Values: " + hm.values());
        System.out.println("EntrySet: " + hm.entrySet());

        // iteration
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println();


        // ---------------- LinkedHashMap ----------------
        System.out.println("---- LinkedHashMap Example ----");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "One");
        lhm.put(2, "Two");
        lhm.put(3, "Three");
        System.out.println("LinkedHashMap: " + lhm); // preserves insertion order

        lhm.remove(2);
        System.out.println("After remove(2): " + lhm);

        lhm.replace(3, "UpdatedThree");
        System.out.println("After replace: " + lhm);

        System.out.println("ContainsKey(1)? " + lhm.containsKey(1));
        System.out.println("ContainsValue('Two')? " + lhm.containsValue("Two"));
        System.out.println("KeySet: " + lhm.keySet());
        System.out.println("Values: " + lhm.values());
        System.out.println("EntrySet: " + lhm.entrySet());
        System.out.println();


        // ---------------- TreeMap ----------------
        System.out.println("---- TreeMap Example ----");
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "Three");
        tm.put(1, "One");
        tm.put(2, "Two");
        tm.put(4, "Four");
        System.out.println("TreeMap (sorted): " + tm);

        // firstKey(), lastKey()
        System.out.println("FirstKey: " + tm.firstKey());
        System.out.println("LastKey: " + tm.lastKey());

        // higherKey(), lowerKey()
        System.out.println("HigherKey(2): " + tm.higherKey(2));
        System.out.println("LowerKey(2): " + tm.lowerKey(2));

        // subMap()
        System.out.println("SubMap(1,4): " + tm.subMap(1, 4));

        // pollFirstEntry(), pollLastEntry()
        System.out.println("PollFirstEntry: " + tm.pollFirstEntry());
        System.out.println("PollLastEntry: " + tm.pollLastEntry());
        System.out.println("TreeMap after polls: " + tm);
        System.out.println();


        // ---------------- Hashtable ----------------
        System.out.println("---- Hashtable Example ----");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");
        // ht.put(null, "NullKey"); // ❌ Not allowed, will throw NullPointerException
        // ht.put(4, null);         // ❌ Not allowed

        System.out.println("Hashtable: " + ht);

        ht.remove(2);
        System.out.println("After remove(2): " + ht);

        System.out.println("ContainsKey(1)? " + ht.containsKey(1));
        System.out.println("ContainsValue('Three')? " + ht.containsValue("Three"));

        System.out.println("KeySet: " + ht.keySet());
        System.out.println("Values: " + ht.values());
        System.out.println("EntrySet: " + ht.entrySet());

        // Iteration
        for (Map.Entry<Integer, String> e : ht.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

/*	OUTPUT
---- HashMap Example ----
HashMap: {null=NullKey, 1=One, 2=Two, 3=Three, 4=null}
Get key 2: Two
Contains key 3? true
Contains value 'Two'? true
After remove(2): {null=NullKey, 1=One, 3=Three, 4=null}
After replace: {null=NullKey, 1=One, 3=ThreeUpdated, 4=null}
After putIfAbsent: {null=NullKey, 1=One, 3=ThreeUpdated, 4=null, 5=Five}
KeySet: [null, 1, 3, 4, 5]
Values: [NullKey, One, ThreeUpdated, null, Five]
EntrySet: [null=NullKey, 1=One, 3=ThreeUpdated, 4=null, 5=Five]
null -> NullKey
1 -> One
3 -> ThreeUpdated
4 -> null
5 -> Five

---- LinkedHashMap Example ----
LinkedHashMap: {1=One, 2=Two, 3=Three}
After remove(2): {1=One, 3=Three}
After replace: {1=One, 3=UpdatedThree}
ContainsKey(1)? true
ContainsValue('Two')? false
KeySet: [1, 3]
Values: [One, UpdatedThree]
EntrySet: [1=One, 3=UpdatedThree]

---- TreeMap Example ----
TreeMap (sorted): {1=One, 2=Two, 3=Three, 4=Four}
FirstKey: 1
LastKey: 4
HigherKey(2): 3
LowerKey(2): 1
SubMap(1,4): {1=One, 2=Two, 3=Three}
PollFirstEntry: 1=One
PollLastEntry: 4=Four
TreeMap after polls: {2=Two, 3=Three}

---- Hashtable Example ----
Hashtable: {3=Three, 2=Two, 1=One}
After remove(2): {3=Three, 1=One}
ContainsKey(1)? true
ContainsValue('Three')? true
KeySet: [3, 1]
Values: [Three, One]
EntrySet: [3=Three, 1=One]
3 -> Three
1 -> One
*/