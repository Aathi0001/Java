package test1;

public class t129 {
	t129(){
		this(14);
		System.out.println("java");
	}
	t129(int x){
		this(3.14, "HTML");
		System.out.println("Sql");
	}
	t129(double x, String y){
		this(false);
		System.out.println(x+":"+y);
	}
	t129(boolean z){
		System.out.println(z);
	}
	public static void main(String[] args) {
		t129 ref = new t129();
	}
}
