package test1;
//
public class t23 {
    public static void HappyNumber(int num) {
        int slow = num;
        int fast = num;

        // Floyd’s Cycle detection algorithm
        do {
            slow = digitSquareSum(slow);              // 1 step
            fast = digitSquareSum(digitSquareSum(fast)); // 2 steps
        } while (slow != fast);

        if (slow == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Helper to calculate the sum of squares of digits
    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber(19); // Yes
        HappyNumber(2);  // No
        HappyNumber(4);  // No
    }
}


//Number = 19  
//1² + 9² = 1 + 81 = 82  
//8² + 2² = 64 + 4 = 68  
//6² + 8² = 36 + 64 = 100  
//1² + 0² + 0² = 1 → ✅ Happy Number

//If it enters a loop without reaching 1 → ❌ Not a Happy Number.
