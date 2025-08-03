package test1;

public class t131 {
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum());             // 0
        System.out.println(sum(10, 20));       // 30
        System.out.println(sum(1, 2, 3, 4, 5)); // 15
    }
}
