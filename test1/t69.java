package test1;

import java.util.Arrays;

public class t69 {

    public static boolean isanagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.trim().toLowerCase();
        s2 = s2.trim().toLowerCase();

        // Convert to character arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // If lengths differ, cannot be anagram
        if (a.length != b.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare sorted arrays using Arrays.equals for better performance
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s1 = "eaRTH", s2 = "HeaRT";

        System.out.println("Is Anagram: " + isanagram(s1, s2));  // ✅ Output: true
    }
}


/*
----------------------------------------
🧠 ANAGRAM EXAMPLES (For Reference)
----------------------------------------

🔤 Anagram: 
Two words are anagrams if they contain the same characters, 
just arranged differently (ignoring case and order).

✅ Examples:
1. "earth" & "heart"   → true
2. "listen" & "silent" → true
3. "triangle" & "integral" → true
4. "aabbcc" & "abcabc" → true
5. "School Master" & "The Classroom" → false (because of spaces/case)

❌ Not Anagrams:
1. "hello" & "world"   → false
2. "test" & "taste"    → false (extra character)
3. "abc" & "abcc"      → false (length mismatch)

🧾 Notes:
- Anagrams must have the **same length**
- All characters must match in **count and frequency**
- Convert to lowercase and remove spaces for better matching

🎯 Use Cases:
- Word games
- Spell checkers
- Plagiarism detectors
- Natural language processing

*/
