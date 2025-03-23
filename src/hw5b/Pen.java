package hw5b;

public abstract class Pen {
	private String brand;
	private double price;
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Pen() {
		this(null, 0);
	}
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public String getbrand() {
		return brand;
	}
	
	public double getprice() {
		return price;
	}
	
	public abstract void write(); 
}
