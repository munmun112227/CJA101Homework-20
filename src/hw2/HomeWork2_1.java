package hw2;

public class HomeWork2_1 {
//	請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和：" + sum);
	}
}
