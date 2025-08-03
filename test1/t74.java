package test1;

import java.util.Scanner;

public class t74 {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        t73[] students = new t73[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and mark of student " + (i + 1) + ":");
            // 🟨 Consume leftover newline before reading name
            sc.nextLine();  
            String name = sc.nextLine();
            int mark = sc.nextInt();
            students[i] = new t73(name, mark);
        }

        System.out.println("\nStudents who failed (mark < 35):");
        for (t73 s : students) {
            if (s.isFailed()) {
                s.printDetails();
            }
            else {
            	System.out.println("null");
            }
        }
    }
}
