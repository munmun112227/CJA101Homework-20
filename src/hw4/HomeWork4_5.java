package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
public class HomeWork4_5 {
	public static void main(String[] args) {
//		用陣列放非閏年和閏年的每月天數
		int[][] monthDays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		Scanner sc = new Scanner(System.in);
		int year;
		int month;
		int day;
		System.out.println("請輸入日期，以空格分隔年月日");
		while(true){
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
//			判斷輸入年月的值是否合理
			if(month > 12 || month < 1 || year < 0) {
				System.out.println("異常，再輸入一次");
				System.out.println("請輸入日期，以空格分隔年月日");
				continue;
			}
//			判斷輸入日的值是否合理
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				if(day <= monthDays[1][month-1]) {
					break;
				}
				else {
					System.out.println("異常，再輸入一次");
					System.out.println("請輸入日期，以空格分隔年月日");
					continue;
				}
			}
			else {
				if(day <= monthDays[0][month-1]) {
					break;
				}
				else {
					System.out.println("異常，再輸入一次");
					System.out.println("請輸入日期，以空格分隔年月日");
					continue;
				}
			}
		}


		
		int days = 0;
		for(int i = 0; i < (month - 1); i++) {
//		利用年份除4, 400, 100取餘數判斷是不是閏年
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				days += monthDays[1][i];
			}
			else {
				days += monthDays[0][i];
			}
		}
		
		System.out.println("輸入的日期為該年第" + (days += day) + "天");
	}
}
