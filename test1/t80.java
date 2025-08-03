package test1;

public class t80 {
	public static void main(String[] args) {
		t79 product = t79.getProduct("Laptop", 49999.99, true);
		product.setAvailable(false);

		System.out.println("Product Name: " + product.getName());
		System.out.println("Product Price: " + product.getPrice());
		System.out.println("Product Avaiable: " + product.isAvailable());

		
	}
}
