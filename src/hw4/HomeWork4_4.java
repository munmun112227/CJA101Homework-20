package hw4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個
//請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
public class HomeWork4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] coworker = {
				{25, 2500},
				{32, 800},
				{8, 800},
				{19, 1000},
				{27, 1200}
		};
		System.out.println("輸入金額");
		int money = sc.nextInt(), count = 0;
		System.out.print("有錢可借的員工編號：");
		for(int i = 0; i < coworker.length; i++) {
			if(coworker[i][1] >= money) {
				System.out.print(coworker[i][0] + " ");
				count++;
			}
		}
		System.out.println("共" + count + "人！");				   
	}
}
