package test1;

public class t136 {
    public static void main(String[] args) {

        // 1️⃣ StringBuffer → String
        StringBuffer sb1 = new StringBuffer("Hello from StringBuffer");
        String st1 = new String(sb1);
        String str1 = sb1.toString();
        System.out.println("StringBuffer to String: " + st1);
        System.out.println("StringBuffer to String:(toString Method) " + str1);

        // 2️⃣ String → StringBuffer
        String str2 = "Hello from String";
        StringBuffer sb2 = new StringBuffer(str2);
        System.out.println("String to StringBuffer: " + sb2);

        // 3️⃣ String → StringBuilder
        String str3 = "Hello from String";
        StringBuilder sBuilder1 = new StringBuilder(str3);
        System.out.println("String to StringBuilder: " + sBuilder1);

        // 4️⃣ StringBuilder → String
        StringBuilder sBuilder2 = new StringBuilder("Hello from StringBuilder");
        String st2 = new String(sBuilder2);
        String str4 = sBuilder2.toString();
        System.out.println("StringBuilder to String: " + st2);
        System.out.println("StringBuilder to String:(toString Method) " + str4);

        // 5️⃣ StringBuilder → StringBuffer
        StringBuilder sBuilder3 = new StringBuilder("Builder to Buffer");
        StringBuffer sb3 = new StringBuffer(sBuilder3.toString());
        System.out.println("StringBuilder to StringBuffer: " + sb3);

        // 6️⃣ StringBuffer → StringBuilder
        StringBuffer sb4 = new StringBuffer("Buffer to Builder");
        StringBuilder sBuilder4 = new StringBuilder(sb4.toString());
        System.out.println("StringBuffer to StringBuilder: " + sBuilder4);
        
        
        //Convert a Character to String
        char ch = 'A';

        // Method 1: Using String.valueOf()
        String strs1 = String.valueOf(ch);

        // Method 2: Using Character.toString()
        String strs2 = Character.toString(ch);

        // Method 3: Concatenation
        String strs3 = ch + "";

        System.out.println("Using valueOf: " + strs1);
        System.out.println("Using toString: " + strs2);
        System.out.println("Using concatenation: " + strs3);
        
        
        //Convert a Character Array to String
        char[] arr = {'H', 'e', 'l', 'l', 'o'};

        // Method 1: Using String constructor
        String strss1 = new String(arr);

        // Method 2: Using String.valueOf()
        String strss2 = String.valueOf(arr);

        System.out.println("Using constructor: " + strss1);
        System.out.println("Using valueOf: " + strss2);
    }
}
