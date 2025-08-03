package test1;

public class t79 {
	private String name;
	private double price;
	private boolean available;

	// ✅ Private constructor
	private t79(String name, double price, boolean avaiable) {
		this.name = name;
		this.price = price;
		this.available=avaiable;
	}

	// ✅ Static factory method
	public static t79 getProduct(String name, double price, boolean avaiable) {
		return new t79(name, price, avaiable);
	}

	// ✅ Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	// ✅ Getter for boolean uses 'is'
    public boolean isAvailable() {
        return available;
    }
    // Setter for boolean
    public void setAvailable(boolean available) {
        this.available = available;
    }

}
