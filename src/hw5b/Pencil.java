package hw5b;

public class Pencil extends Pen{
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public double getprice() {
		return super.getprice() * 0.8;
	}
}
