package test1;

@FunctionalInterface
interface vehicle123 {
    void start();
}

public class t123 {
    public static void main(String[] args) {
        vehicle123 ref = () -> {
            System.out.println("Check Brake, Gear, Accelerator, Clutch");
        };
        ref.start();
    }
}
