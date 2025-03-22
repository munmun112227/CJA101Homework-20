package hw5a;

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class HomeWork5_2 {

	public static void main(String[] args) {
		HomeWork5_2 p = new HomeWork5_2();
		p.randAvg();
	}
	
	public void randAvg() {
		int[] randomNum = new int[10];
		int sum = 0;
		
		System.out.print("10個亂數：");
		
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int)(Math.random()*101);
			sum += randomNum[i];
			System.out.print(randomNum[i] + " ");
		}
		
		System.out.println();
		System.out.println("平均數：" + (sum / randomNum.length));
	}
}
