package hw4;
//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
public class HomeWork4_3 {
	public static void main(String[] args) {
		String[] s = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			for(int k = 0; k < s[i].length(); k++) {
				switch (s[i].charAt(k)){
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				}
			}
		}
		System.out.println("母音總共：" + count + "個");
	}
}
