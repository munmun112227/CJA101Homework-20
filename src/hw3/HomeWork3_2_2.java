package hw3;

import java.util.Scanner;

public class HomeWork3_2_2 {
//	請設計一隻程式,會亂數產生一個0~100的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息並提示是大於還是小於答案,猜
//	對則顯示正確訊息
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*101);
		System.out.println("現在來跟我玩猜數字");
		System.out.println("在0~100中選一個數字");
		while (true){
			int guess = sc.nextInt(); 
			if(guess == num) {
				System.out.println("答對啦，我的數字就是" + num);
				break;
			} 
			else if (guess != num && guess >= 0 && guess <= 100) {
				if (guess > num) {
					System.out.println("哈哈 我的數字比你的小，再猜~");
				}
				else {
					System.out.println("哈哈 我的數字比你的大，再猜~");
				}
			}
			else {
				System.out.println("亂猜，是選0~100的數字，再猜~");
			}
		}
	}
}
