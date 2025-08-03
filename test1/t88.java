package test1;

public class t88 {
    private String deptName;
    private t87[] students; // Aggregation: Department HAS-A array of Students

    public t88(String deptName, t87[] students) {
        this.deptName = deptName;
        this.students = students;
    }

    public void showDetails() {
        System.out.println("Department: " + deptName);
        System.out.println("-- Students --");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName() + ", Roll No: " + students[i].getRollNo());
        }
    }

    public static void main(String[] args) {
        t87 s1 = new t87("Aathi", 101);
        t87 s2 = new t87("Siva", 102);
        t87 s3 = new t87("Ganesh", 103);

        // These students are created independently
        t87[] students = {s1, s2, s3};

        // Passed to department (Aggregation)
        t88 dept = new t88("Computer Science", students);
        dept.showDetails();
    }
}
