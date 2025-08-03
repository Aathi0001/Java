package test1;

import java.util.Arrays;
import java.util.Scanner;

public class t67 {
    static Scanner sc = new Scanner(System.in);

    public static boolean binary(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (key == a[m]) {
                return true;
            } else if (key < a[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {8, 9, 10, 12, 32, 42, 112, 232, 312};
        System.out.println("Enter the Element to Search:");
        int key = sc.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println((binary(a, key)) ? "Present" : "Not present");
    }
}
