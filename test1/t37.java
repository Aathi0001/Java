package test1;

import java.util.Arrays;

public class t37 {
    public static int[] FindUnique(int[] a) {
        int[] temp = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = a[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 8, 3, 8, 4, 35, 66, 35, 77, 8 };
        int[] result = FindUnique(a);
        System.out.println(Arrays.toString(result));     }
}

