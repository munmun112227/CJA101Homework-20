package hw1;

public class HomeWork1_6 {
//	請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
	public static void main (String[] args) {
//		下面輸出的內容為「2個整數的加法運算」，所以輸出10。
		System.out.println(5 + 5);
//		下面輸出的內容為「1個整數與1個字元的所對應的萬國碼轉換為10進位後進行加法運算」，所以輸出58。
		System.out.println(5 + '5');
//		下面輸出的內容為「1個整數與1個字串的結合」，所以輸出55。
		System.out.println(5 + "5");
	}
}
