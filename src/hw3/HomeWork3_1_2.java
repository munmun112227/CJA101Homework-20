package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1_2 {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、直角三角形、其它三角形或不是三角形

	public static void main (String[] args) {
		
		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int n = 0; n < 3; n++) {
		System.out.println("請輸入第" + (n + 1) + "個正整數");
		a[n] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		if(a[0] == a[1] && a[1] == a[2]) {
			System.out.println("這是正三角形");
		} 
		else if(a[0] == a[1] || a[1] == a[2] || a[2] == a[0]){
			System.out.println("這等腰三角形");
		}
		else if(a[0] * a[0] + a[1] * a[1] == a[2] * a[2]) {
			System.out.println("這直角三角形");
		}
		else if(a[0] + a[1] > a[2]) {
			System.out.println("這其他的三角形");
		}
		else {
			System.out.println("這無法組成三角形");
		}
	}
}
