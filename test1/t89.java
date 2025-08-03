package test1;

public class t89 {
	private String operator, bandwidth;
	private double price;
	
	public t89(String operator, String bandwidth, double price){
		this.operator=operator;
		this.bandwidth = bandwidth;
		this.price = price;
	}
	
	public String getOperator() {
		return operator;
	}
	public String getBandwidth() {
		return bandwidth;
	}
	public double getPrice() {
		return price;
	}
	public void details() {
		System.out.println("Operator:"+getOperator());
		System.out.println("BandWidth:"+getBandwidth());
		System.out.println("Price:"+getPrice());
	}
}
