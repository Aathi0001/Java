package test1;

public class t71 {

    // 🔹 Static variable
    static String college = "ABC College";

    // 🔸 Non-static (instance) variables
    String name;
    int age;

    // 🔹 Static method
    static void printCollege() {
        System.out.println("College: " + college);
    }

    // 🔸 Non-static method
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
    
    
    
    
    
    static {		// ✅ Static block
    	String college = "PQR College";
    	System.out.println("College: " + college);
    	//static college = "GHI College";      It is not allowed because inside static block we cannot prefied with staic inside local area 
        System.out.println("Static Block – runs once when class loads");
        
    }

    {		 // ✅ Instance block
        System.out.println("Instance Block – runs every time object is created");
        System.out.println("College: " + college);
    }

    t71() {		// ✅ Constructor
        System.out.println("Constructor – after instance block");
        System.out.println("College: " + college);
    }
    
    
    
    public static void main(String[] args) {
        t71 s1 = new t71();
        s1.name = "Aathi";
        s1.age = 20;

        t71 s2 = new t71();
        s2.name = "Siva";
        s2.age = 22;

        // Accessing static method
        t71.printCollege();     // ✅ Correct
        s1.printCollege();          // ✅ Allowed, but not recommended

        // Accessing non-static method
        s1.printDetails();          // ✅ Works
        s2.printDetails();          // ✅ Works

        // Static variable shared by all
        t71.college = "XYZ College";  // Changes for all students
        s1.printDetails();
        s2.printDetails();
        
        t71 obj1 = new t71();
        t71 obj2 = new t71();
        
    }
}



/*
---------------------------------------
🔁 STATIC vs NON-STATIC in Java
---------------------------------------

🔹 STATIC:
- Belongs to the class (not to object)
- Shared by all objects
- Can be accessed using class name
- Example: static int count; static void show();

🔸 NON-STATIC (Instance Members):
- Belongs to individual object
- Unique for each object
- Requires object to access
- Example: String name; int age; void print();

✅ Rules:
- Static methods can access only static members directly
- Non-static methods can access both static and non-static members

🎯 Use Cases:
- Static: Constants, counters, utility methods
- Non-static: Personal data, behavior per object

*/





/*
-------------------------------------------------------
🧠 JAVA MEMBERS REFERENCE – VARIABLES, METHODS, BLOCKS
-------------------------------------------------------

🔸 VARIABLES:
1. Instance Variable   → Belongs to object (non-static)
2. Static Variable     → Belongs to class (shared)
3. Local Variable      → Declared in methods/blocks
4. Final Variable      → Cannot be reassigned after set

🔸 METHODS:
1. Instance Method     → Needs object to call
2. Static Method       → Call using class name
3. Constructor         → Same name as class, runs on object creation
4. Main Method         → Entry point: public static void main(String[] args)

🔸 INITIALIZERS:
1. Static Block        → Runs once when class loads
2. Instance Block      → Runs before constructor, every object creation

✅ ORDER OF EXECUTION:
→ Static Block → Instance Block → Constructor → Methods

🎯 Example Use:
- Static block: DB connection, constants
- Instance block: Common logic for all constructors
- Final variable: PI = 3.14

*/
