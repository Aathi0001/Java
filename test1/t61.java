package test1;

public class t61 {
	public static void main(String[] args) {
		String S1 = new String("AathiihtaA");
		String rev = "";
		for(int i=S1.length()-1; i>=0; i--) {
			rev =rev+ S1.charAt(i);
		}
		if(S1.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
