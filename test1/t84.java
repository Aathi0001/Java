package test1;

public class t84 {
    public static void main(String[] args) {
        t83 emp = new t83();
        emp.setId(101);
        emp.setName("Aathi");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
