package hw5a;

import java.util.Scanner; 

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

public class HomeWork5_1 {

	public static void main(String[] args) {
		HomeWork5_1 square = new HomeWork5_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入兩個正整數，以空格區分");
		int w, h;
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w < -1 || h < -1) {
				System.out.println("異常，重新輸入");
				System.out.println("輸入兩個正整數，以空格區分");
				continue;
			}
			else {
				break;
			}
		}
		
		square.starSquare(w, h);
		
	}
	
	public void starSquare(int width, int height) {
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
