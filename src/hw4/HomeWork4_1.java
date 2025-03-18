package hw4;
//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
public class HomeWork4_1 {
	public static void main (String[] args) {
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int avg;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println("平均數：" + avg );
		System.out.println("大於平均數" + avg + "的數字有：");
		for(int k = 0; k < array.length; k++) {
			if(array[k] > avg) {
				System.out.print(array[k] + " ");
			}
			else {
				continue;
			}
		}
	}
}
