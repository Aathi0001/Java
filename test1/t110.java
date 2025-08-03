package test1;

class Child109 extends t109 {
    static void display() {
        System.out.println("Display from Child (Child109)");
    }
}

public class t110 {
    public static void main(String[] args) {
        t109 parentRef = new Child109(); // reference is of parent
        parentRef.display(); // calls parent's static method (not overridden)
        Child109 ref = (Child109) parentRef;
        ref.display();
        
        Child109 childRef = new Child109();
        childRef.display(); // calls child's static method
    }
}
