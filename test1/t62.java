package test1;

public class t62 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to rotate number and check all rotations
    public static boolean isCyclicPrime(int num) {
        String s = String.valueOf(num);    //"1193"
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int rotated = Integer.parseInt(s);
            if (!isPrime(rotated)) return false;

            // Rotate the number (e.g. 197 → 971 → 719)
            s = s.substring(1) + s.charAt(0);
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1193;

        if (isCyclicPrime(num)) {
            System.out.println(num + " is a Cyclic Prime.");
        } else {
            System.out.println(num + " is NOT a Cyclic Prime.");
        }
    }
}
