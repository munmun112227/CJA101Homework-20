package hw2;

public class HomeWork2_0_2 {
//	輸出九九乘法表(使用for迴圈+ do while迴圈)
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}
}
