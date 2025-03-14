package hw2;

public class HomeWork2_0_3 {
//	輸出九九乘法表(使用while迴圈+ do while迴圈)
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
