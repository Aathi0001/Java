package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class t1 {
    static int a = 3; // Static (global) int

    public static void main(String[] args) {
        // Integer types
        byte by = 100;                 // 1 byte
        short sh = 30000;              // 2 bytes
        int a = 12;                    // 4 bytes
        long b = 80L;                  // 8 bytes
        long c = 2l;
        long d = 23432;
        //float e = 20.5;     ----->     it will cause CTE
        // Floating-point types
        float e = 2.1f;                // 4 bytes
        float f = 0.0f;
        float g = 0.0F;
        double h = 20.0;               // 8 bytes
        double i = 20.3d;
        double j = 20.1D;

        // Character and boolean
        char ch = 'A';                 // 2 bytes
        boolean bool = true;           // 1 bit (handled internally)
        
        // 1. String
        String name = "Aathi";
        String greeting = new String("Hello how are you!");
        String slash = new String("\"Aathi Siva Ganesh\"");
        // 2. Array
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = new String[]{"Apple", "Banana", "Mango"};

        // 3. ArrayList (dynamic size)
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Bangalore");

        // Printing all using printf for formatting
        System.out.printf("byte       : %d\n", by);
        System.out.printf("short      : %d\n", sh);
        System.out.printf("int (local): %d\n", a);
        System.out.printf("int (static class var): %d\n", t1.a);
        System.out.printf("long b     : %d\n", b);
        System.out.printf("long c     : %d\n", c);
        System.out.printf("long d     : %d\n", d);
        
        System.out.printf("float e    : %.2f\n", e);
        System.out.printf("float f    : %.2f\n", f);
        System.out.printf("float g    : %.2f\n", g);

        System.out.printf("double h   : %.2f\n", h);
        System.out.printf("double i   : %.2f\n", i);
        System.out.printf("double j   : %.2f\n", j);

        System.out.printf("char       : %c\n", ch);
        System.out.printf("boolean    : %b\n", bool);
        
        System.out.printf("String    : %s\n", name);
        System.out.println("Greeting : " + greeting);
        System.out.println("slash :" +slash);

        System.out.println("Array (int[]): " + Arrays.toString(numbers));
        System.out.println("Array (String[]): " + Arrays.toString(fruits));

        System.out.println("ArrayList (cities): " + cities);
        
        System.out.printf("Mix Print : %d %c %.2f %s\n", a, ch, e, name);
        
        String[][] data = {{"Aathi", "Siva"}, {"Ganesh", "Raj"}};
        System.out.println("Multi dimensional array " + Arrays.deepToString(data));
        
        
        String[] wordArray = greeting.split(" ");
        System.out.println("Word Array:"+Arrays.toString(wordArray));
        
        char[] charArray = greeting.toCharArray();
        System.out.println("Character Array:"+Arrays.toString(charArray));
        
        String[] letters = greeting.split("");
        System.out.println("Letter Array:"+Arrays.toString(letters));
        
        System.out.print("Hello This Is Print");
        System.out.println(" Hello This is Println");
    }
}
