package hw5b;

public class InkBrush extends Pen {
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public double getprice() {
		return super.getprice() * 0.9;
	}
}
