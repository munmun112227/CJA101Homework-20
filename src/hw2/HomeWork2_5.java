package hw2;

public class HomeWork2_5 {
//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	public static void main (String[] args) {
		int i, j, k = 0;
		System.out.print("阿文可以選擇的數字有：");
		for (i = 0; i <= 30; i = i + 10) {
			for (j = 1; j <= 9; j++) {
				if (j == 4) {
					continue;
				}else {
					System.out.print(i+j + " ");
					k++;
				}
			}
		}
		System.out.print("，共" + k + "個");
	}
}
