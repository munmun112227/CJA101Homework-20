package hw2;

public class HomeWork2_4 {
//	請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
	public static void main (String[] args) {
		int i = 0;
		for (int j = 1; j <= 19; j = j + 2) {
			i += j;
			System.out.print(i + " ");
		}
	}
}
