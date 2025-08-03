package test1;

class Persont130 {
	String name;
	int age;
	Persont130(String name, int age){
		this.name= name;
		this.age= age;
	}
	public void walk() {
		System.out.println("Walking");
	}

}

class Studentt130 extends Persont130{
	int id;
	long phone;
	Studentt130(int id, long phone){
		super("aathi", 21);
		this.id = id;
		this.phone = phone;
	}
	Studentt130(String name, int age, int id, long phone){
		super(name, age);
		this.id=id;
		this.phone=phone;
	}
	public void details() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Id: "+id);
		System.out.println("Phone: "+phone);
	}
}

class t130{
	public static void main(String []args) {
		Studentt130 ref1 = new Studentt130(101, 12347890);
		ref1.details();
		Studentt130 ref2 = new Studentt130("Aathi",22,1001, 123478900);
		ref2.details();
		
	}
}