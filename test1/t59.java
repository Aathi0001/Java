package test1;

public class t59 {
    public static void spiral(int[][] a) {
        int top = 0, bottom = a.length - 1;
        int left = 0, right = a[0].length - 1;

        System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {
            // Traverse Top Row
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // Traverse Right Column
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Traverse Bottom Row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse Left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println(); // For newline
    }

    public static void main(String[] args) {
        int[][] a = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiral(a);
    }
}
