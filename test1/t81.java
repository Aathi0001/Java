package test1;

public class t81 {

    // 🔒 Step 1: Static instance (only one)
    private static t81 instance;

    // 🔒 Step 2: Private constructor
    private t81() {
        System.out.println("Singleton object created!");
    }

    // 🧠 Variable
    private String name;

    // ✅ Step 3: Public static method to access the single instance
    public static t81 getInstance() {
        if (instance == null) {
            instance = new t81();
        }
        return instance;
    }

    // ✅ Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
