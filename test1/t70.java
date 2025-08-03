package test1;

public class t70 {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();

        // Boolean array to mark presence of each letter
        boolean[] mark = new boolean[26];

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                mark[ch - 'a'] = true;
            }
        }

        // Check if all 26 letters are marked
        for (boolean b : mark) {
            if (!b) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is Pangram: " + isPangram(sentence));
    }
}



/*
----------------------------------------
📚 PANGRAM EXAMPLES (For Reference)
----------------------------------------

🧠 Definition:
A Pangram is a sentence that contains every letter of the alphabet (a-z) at least once.

✅ Examples:
1. "The quick brown fox jumps over the lazy dog" → true
2. "Pack my box with five dozen liquor jugs"     → true
3. "Sphinx of black quartz, judge my vow"        → true

❌ Not a Pangram:
1. "Hello world"              → false
2. "Java is awesome"          → false

🧾 Notes:
- Ignore case (use toLowerCase())
- Ignore digits and special characters
- Only check for letters a-z

🎯 Use Cases:
- Font testing
- Typing practice
- Language tests
*/
