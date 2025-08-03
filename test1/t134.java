package test1;
public class t134 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before object is destroyed");
    }

    public static void main(String[] args) {
        t134 obj = new t134();
        obj = null;  // Eligible for garbage collection

        System.gc(); // Suggest JVM to run Garbage Collector (not guaranteed)

        System.out.println("Main method ends");
    }
}


//Called by Garbage Collector (GC) before destroying the object.
//Used to cleanup resources (e.g., closing files or DB connections).