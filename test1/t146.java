package test1;

public class t146 {
    public static void main(String[] args) {
        // Byte
        byte b = Byte.parseByte("10");
        Byte bObj = Byte.valueOf("10");

        // Short
        short s = Short.parseShort("20");
        Short sObj = Short.valueOf("20");

        // Integer
        int i = Integer.parseInt("30");
        Integer iObj = Integer.valueOf("30");

        // Long
        long l = Long.parseLong("40");
        Long lObj = Long.valueOf("40");

        // Float
        float f = Float.parseFloat("5.5");
        Float fObj = Float.valueOf("5.5");

        // Double
        double d = Double.parseDouble("6.6");
        Double dObj = Double.valueOf("6.6");

        // Boolean
        boolean bool = Boolean.parseBoolean("true");
        Boolean boolObj = Boolean.valueOf("true");

        // Character (No parseChar, use charAt)
        char ch = "A".charAt(0);
        Character chObj = Character.valueOf("A".charAt(0));

        System.out.println(b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d + ", " + bool + ", " + ch);
        System.out.println(bObj + ", " + sObj + ", " + iObj + ", " + lObj + ", " + fObj + ", " + dObj + ", " + boolObj + ", " + chObj);
    }
}
