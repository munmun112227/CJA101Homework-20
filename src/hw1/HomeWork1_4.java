package hw1;

public class HomeWork1_4 {
//	請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	public static void main (String[] args) {
		final double pi = 3.1415;
		int radius = 5;
		System.out.println("半徑"+radius+"的圓，其面積為: "+Math.pow(radius, 2)*pi);
		System.out.println("半徑"+radius+"的圓，其周長為: "+radius*2*pi);
	}

}
