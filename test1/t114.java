package test1;

// ✅ Final Class: Cannot be inherited
final class FinalClass {
    // ✅ Final Global Variable (Static Final): Constant shared by all
    static final String COMPANY_NAME = "TechCorp";

    // ✅ Final Instance Variable: Must be initialized in constructor
    final int id;

    // Constructor to initialize final instance variable
    FinalClass(int id) {
        this.id = id;
    }

    // ✅ Final Method: Cannot be overridden
    public final void displayDetails() {
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Employee ID: " + id);
    }
}

public class t114 {
    public static void main(String[] args) {
        // ✅ Final Local Variable: Cannot be reassigned
        final int bonus = 1000;
        System.out.println("Bonus: " + bonus);

        // bonus = 2000; // ❌ Error: cannot assign a value to final variable 'bonus'

        // Create object of FinalClass
        FinalClass emp = new FinalClass(101);
        emp.displayDetails();

        // emp.id = 202; // ❌ Error: cannot assign a value to final variable 'id'
        // FinalClass.COMPANY_NAME = "NewCorp"; // ❌ Error: final static variable cannot be changed
    }
}
