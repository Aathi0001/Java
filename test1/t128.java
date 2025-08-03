
package test1;

interface Creator {
    creatort128 get(String name);
}

// Corrected class name to match exactly
class creatort128 {
    creatort128(String name) {
        System.out.println("Created user: " + name);
    }
}

public class t128 {
    public static void main(String[] args) {
        Creator ref = creatort128::new; // ✅ constructor reference
        creatort128 obj = ref.get("Aathi"); // ✅ assign to correct type
    }
}


//ClassName::new