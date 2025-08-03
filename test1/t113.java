package test1;

class t113 {
    final static double PI = 3.14159;   // ✅ Final static global variable initialized immediately
    final static float num1;            // ✅ Final static global variable initialized in static block
    final float num2;                   // ✅ Final instance variable initialized in instance block

    // ✅ Static block for static final variable
    static {
        num1 = 3.14f;
    }

    // ✅ Instance initializer block for final instance variable
    {
        num2 = 3f;
    }

    public static void main(String[] args) {
        t113 obj = new t113(); // Instance needed to access num2 (non-static)

        System.out.println("PI =%.s " + PI);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + obj.num2);
        System.out.println(String.format("num1 = %.2f, num2 = %.2f", num1, obj.num2));

    }
}
