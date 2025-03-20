package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
public class HomeWork4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期，以空格分隔年月日");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
//		用陣列放非閏年和閏年的每月天數
		int[][] monthDays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		
		int days = 0;
		for(int i = 0; i < (month - 1); i++) {
//		利用年份除4取餘數判斷是不是閏年
			if(year % 4 == 0) {
				days += monthDays[1][i];
			}
			else {
				days += monthDays[0][i];
			}
		}
		
		System.out.println("輸入的日期為該年第" + (days += day) + "天");
	}
}
