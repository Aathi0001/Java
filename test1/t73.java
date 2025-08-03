package test1;

public class t73 {
    public String name;
    public int mark;

    public t73(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public boolean isFailed() {
        return mark < 35;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Mark: " + mark);
    }
}
