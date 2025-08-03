package test1;

public class t92 {
    public static void main(String[] args) {
        sound91 d = new sound91("bark", "dog");
        sound91 d1 = new sound91("meow", "cat");
        d.sound(); // From Animal91
        d.echo();  // From sound91
        d1.sound();
        d1.echo();
        System.out.println("Jungle King:"+Animal91.King);
        System.out.println("Jungle King:"+d.King);
        System.out.println("Jungle King:"+d1.King);
    }
}
