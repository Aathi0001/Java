package test1;

public class t78 {
	public static void main(String[] args) throws Exception {
		t77 p1 = new t77("A",21);
		t77 p2 = new t77("B",21);
		
		p2.setName("C");
		p2.setAge(21);
		
		System.out.println("Getter info");
		Thread.sleep(1000);
		System.out.println("Name:"+p1.getName());
		System.out.println("Age:"+p1.getAge());
		Thread.sleep(1000);
		System.out.println("Name:"+p2.getName());
		System.out.println("Age:"+p2.getAge());
		Thread.sleep(1000);
		System.out.println("Setter info");
		Thread.sleep(1000);
		p1.setName("D");
		p1.setAge(21);
		
		System.out.println("Name:"+p1.getName());
		System.out.println("Age:"+p1.getAge());
	}
}
