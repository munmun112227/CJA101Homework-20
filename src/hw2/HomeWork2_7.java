package hw2;

public class HomeWork2_7 {
//	請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
	public static void main (String[] args) {
		int k = 65; //A的萬國碼
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print((char)k);
			}
			k++;
			System.out.println();
		}
	}
}
