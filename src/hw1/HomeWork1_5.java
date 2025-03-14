package hw1;

public class HomeWork1_5 {
//	某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢(以複利計算)
	public static void main (String[] args) {
		int cash = 1500000, years = 10;
		double rate = 0.02;
		double total = cash*(Math.pow((1+rate),years));
		System.out.printf("10年後本金加利息總共是%.0f",total);
	}
}
