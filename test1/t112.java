package test1;

public class t112 extends t111 {
    @Override
    public void display() {
        System.out.println("Display from Child class");
    }
    public void childdis() {
    	System.out.println("childdis form child class");
    }
    public static void main(String[] args) {
        t111 ref = new t112();  // Upcasting
        
        ref.display();          // Output: Display from Child class
        ref.dis();
        t112 ref1 = (t112) ref;
        ref1.childdis();
        t111 ref2 = new t111();
        ref2.display();
    }
}
