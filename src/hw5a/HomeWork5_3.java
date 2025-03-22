package hw5a;

import java.util.Arrays;

//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳

public class HomeWork5_3 {

	public static void main(String[] args) {
		HomeWork5_3 h = new HomeWork5_3();
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
		
	}

	public int maxElement(int x[][]) {
		int[] maxNum = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			maxNum[i] = x[i][x[i].length - 1];
		}

		Arrays.sort(maxNum);
		return maxNum[maxNum.length - 1];

	}

	public double maxElement(double x[][]) {
		double[] maxNum = new double[x.length];
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			maxNum[i] = x[i][x[i].length - 1];
		}

		Arrays.sort(maxNum);
		return maxNum[maxNum.length - 1];
	}
}
