package test1;

public class t82 {
    public static void main(String[] args) {

        // Get the Singleton instance
        t81 obj1 = t81.getInstance();
        obj1.setName("Aathi");

        // Get the Singleton instance again
        t81 obj2 = t81.getInstance();
        obj2.setName("Siva");

        // Should print the same name since both refer to same object
        System.out.println("Name from obj1: " + obj1.getName());
        System.out.println("Name from obj2: " + obj2.getName());
        
        System.out.println(obj1);
        System.out.println(obj2);
        
        // Check if both objects are same
        System.out.println("Same object? " + (obj1 == obj2));  // true
    }
}
