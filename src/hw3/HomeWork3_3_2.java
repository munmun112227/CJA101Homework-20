package hw3;

import java.util.Scanner;

public class HomeWork3_3_2 {
//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數，以及在其中隨機挑選6個數字供阿文參考
	public int[][] delNum(int c) {
//		int[0]是十位數，int[1]是十位數
		int[][] a = new int[2][];
//		判斷十位數的數量
		if (c > 4) {
			a[0] = new int[5];
		} else {
			a[0] = new int[4];
		}
//		個位數直接設定長度
		a[1] = new int[9];
//		利用迴圈將十位數個位數指派數值
		x:
//		第一層十位數與個位數的陣列
		for (int i = 0; i <= 1; i++) {
//			設定準備指派進陣列的數字
			int n = 0;
//			各位數陣列的元素
			for (int j = 0; j < 9; j++) {
//				判斷是否是十位數
				if (i == 0 && j < a[0].length) {
//					判斷準備指派給十位數的數字是不是與輸入的數字相同，是就指派後加1，不是就加1再指派
					if (n != c) {
						a[i][j] = n;
					} else {
						a[i][j] = ++n;
					}
					n++;
				}
//				當十位數已經指派完畢後，離開小迴圈
				else if (i == 0 && j >= a[0].length) {
					continue x;
				} 
//				開始指派數值給個位數
				else {
					if (n != c) {
						a[i][j] = n;
					} 
					else {
						a[i][j] = ++n;
					}
					n++;
				}
			}
		}
		return a;
	}

	public void printNum(int arr[][]) {
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
//				排除0
				if(arr[0][i] * 10 + arr[1][j] == 0) {
					continue;
				}
				System.out.print(arr[0][i] * 10 + arr[1][j] + " ");
			}
			System.out.println();
		}
		System.out.println("總共" + ((arr[0].length * arr[1].length)-1) + "個數字可以選");
	}
	
	public void randomNum(int c) {
		int[] randomArr = new int[6];
		System.out.println("建議給你的明牌：");
		for(int i = 0; i < 6; i++) {
			int a, b;
//			隨機挑篩選後的數字
			p:
			while(true) {
				a = (int)(Math.random()*5);
				b = (int)(Math.random()*10);
//				判斷數字是否和已挑選出來的重複並且排除0
				for(int j = 0; j < 6; j++) {
					int d = a * 10 + b;
					if(d == randomArr[j] || d == 0) {
						continue p;
					}
				}
//				判斷數字是否和輸入的數字相符
				if(a != c && b != c) {
					randomArr[i] = a * 10 + b;
					break;
				}
			}
		}
		for(int k = 0; k < 6; k++) {
			System.out.print(randomArr[k] + " ");
		}
	}

	public static void main(String[] args) {
		HomeWork3_3_2 lo = new HomeWork3_3_2();
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你不喜歡的數字(１～９)");
		int num;
		while(true) {
			num = sc.nextInt();
			if(num > 9 || num < 1) {
				System.out.println("叫你選數字1到數字9之間的數字，看不懂逆，重選 (┛`д´)┛");
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("====================");
		System.out.println("以下是逢" + num + "就挑掉的數字");
		int[][] wishNum = lo.delNum(num);
		lo.printNum(wishNum);
		lo.randomNum(num);
	}
}
