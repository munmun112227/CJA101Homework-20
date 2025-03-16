package hw3;

import java.util.Scanner;

public class HomeWork3_2_1 {
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*10);
		System.out.println("現在來跟我玩猜數字");
		System.out.println("在0~9中選一個數字");
		while (true){
			int guess = sc.nextInt(); 
			if(guess == num) {
				System.out.println("答對啦，我的數字就是" + num);
				break;
			} 
			else if (guess != num && guess >= 0 && guess <= 9) {
				System.out.println("哈哈 太嫩了，再猜~");
			}
			else {
				System.out.println("亂猜，是選0~9的數字，再猜~");
			}
		}
	}
}
