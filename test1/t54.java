package test1;

public class t54 {
    public static void MDAPalindrome(int [][]a){
        System.out.println("Updated 2D array (palindromes as -1):");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = isPalindrome(a[i][j]);  // replace value
                System.out.print(a[i][j] + "\t");  // print with tab spacing
            }
            System.out.println(); // new line for each row
        }
    }

    // returns -1 if palindrome, else original number
    public static int isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if(original == reverse) {
            return -1;
        } else {
            return original;
        }
    }

    public static void main(String[] args) {
        int [][]a = {
                {11, 34, 42},
                {23, 74, 44},
                {43, 88, 27}
        };
        MDAPalindrome(a);
    }
}
