package test1;

public class t40 {
    public static void WaterFilled(int[] a) {
        int n = a.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int water = 0;

        leftMax[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], a[i]);
        }

        rightMax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);
        }

        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            water += (minHeight - a[i]);
        }

        System.out.println("Total Water Filled: " + water);
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 0, 3, 2, 5, 0, 9};
        WaterFilled(a);  
    }
}
