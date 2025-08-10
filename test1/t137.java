package test1;

//Custom Checked Exception
class InvalidTransactionException extends Exception {
 public InvalidTransactionException(String message) {
     super(message);
 }
}

public class t137 {
 public static void main(String[] args) {
     try {
         // 1️⃣ Unchecked Exception: Division by Zero
         int balance = 5000;
         int withdrawAmount = 0;
         System.out.println("Average balance: " + (balance / withdrawAmount)); // ArithmeticException

         // 2️⃣ Throwing Custom Checked Exception
         processWithdrawal(7000); // Withdrawal greater than balance

         // 3️⃣ Unchecked Exception: Null Pointer
         String accountHolder = null;
         System.out.println("Account holder: " + accountHolder.toUpperCase()); // NullPointerException

     } catch (ArithmeticException e) {
         System.out.println("❌ Cannot divide by zero!");
     } catch (InvalidTransactionException e) {
         System.out.println("❌ Transaction failed: " + e.getMessage());
     } catch (NullPointerException e) {
         System.out.println("❌ Account holder name is missing!");
     } catch (Exception e) { // General catch
         System.out.println("❌ Some other error occurred: " + e);
     } finally {
         System.out.println("✅ Transaction process ended (Finally block always runs).");
     }

     System.out.println("Program continues after try-catch-finally...");
 }

 // Method with Checked Exception
 public static void processWithdrawal(int amount) throws InvalidTransactionException {
     int balance = 5000;
     if (amount > balance) {
         throw new InvalidTransactionException("Withdrawal exceeds balance!");  //custom Unchecked Exception
     }
     System.out.println("Withdrawal successful!");
 }
}
