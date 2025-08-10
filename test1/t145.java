package test1;

public class t145 {
    public static void main(String[] args) {
        
        // 1. byte
        byte b = 10;                        // primitive
        Byte b1 = 10;
        Byte byteObj = new Byte(b);         // Boxing
        byte b2 = byteObj.byteValue();      // Unboxing
        Byte byteObj2 = b;                  // AutoBoxing
        byte b3 = byteObj2;                 // AutoUnboxing
        
        // 2. short
        short s = 20;
        Short s1 = 20;
        Short shortObj = new Short(s);      
        short s2 = shortObj.shortValue();
        Short shortObj2 = s;                
        short s3 = shortObj2;               
        
        // 3. int
        int i = 30;
        int i1 = 30;
        Integer intObj = new Integer(i);
        int i2 = intObj.intValue();
        Integer intObj2 = i;
        int i3 = intObj2;
        
        // 4. long
        long l = 40L;
        Long l1 = 40L;
        Long longObj = new Long(l);
        long l2 = longObj.longValue();
        Long longObj2 = l;
        long l3 = longObj2;
        
        // 5. float
        float f = 50.5f;
        Float f1 = 50.5f;
        Float floatObj = new Float(f);
        float f2 = floatObj.floatValue();
        Float floatObj2 = f;
        float f3 = floatObj2;
        
        // 6. double
        double d = 60.6;
        Double d1 = 60.6;
        Double doubleObj = new Double(d);
        double d2 = doubleObj.doubleValue();
        Double doubleObj2 = d;
        double d3 = doubleObj2;
        
        // 7. char
        char c = 'A';
        Character c1 = 'A';
        Character charObj = new Character(c);
        char c2 = charObj.charValue();
        Character charObj2 = c;
        char c3 = charObj2;
        
        // 8. boolean
        boolean bool = true;
        Boolean bool1 = true;
        Boolean boolObj = new Boolean(bool);
        boolean bool2 = boolObj.booleanValue();
        Boolean boolObj2 = bool;
        boolean bool3 = boolObj2;
        
        // Display sample values
        System.out.println("byte: " + b + " | " + b1 + " | " + b2 + " | " + b3);
        System.out.println("short: " + s + " | " + s1 + " | " + s2 + " | " + s3);
        System.out.println("int: " + i + " | " + i1 + " | " + i2 + " | " + i3);
        System.out.println("long: " + l + " | " + l1 + " | " + l2 + " | " + l3);
        System.out.println("float: " + f + " | " + f1 + " | " + f2 + " | " + f3);
        System.out.println("double: " + d + " | " + d1 + " | " + d2 + " | " + d3);
        System.out.println("char: " + c + " | " + c1 + " | " + c2 + " | " + c3);
        System.out.println("boolean: " + bool + " | " + bool1 + " | " + bool2 + " | " + bool3);
    }
}

