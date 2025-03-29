package hw6;

public class Calculator {

	private int x;
	private int y;
	
	public Calculator(int x, int y) throws CalException{
		setNum(x, y);
	}
	
	public void setNum(int x, int y) throws CalException {
		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		else if(y < 0) {
			throw new CalException("次方為負值，所以回傳不為整數!");
		}
		this.x = x;
		this.y = y;
	}
	
	public int cal() {
		return (int)Math.pow(x, y);
	}
	
}
