package hw9;

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。Sleep時間由亂數產生500~3000之間的毫秒數

public class HomeWork9_1{

	public static void main(String[] args) {
		
		Eat p1 = new Eat("饅頭人");
		Eat p2 = new Eat("詹姆士");
		
		System.out.println("-----大胃王快食比賽開始!-----");
		
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("-----大胃王快食比賽結束!-----");
	}
	
	
}

class Eat extends Thread{
	String name;
	
	public Eat(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				System.out.println(name + "吃第" + i + "碗飯");
				Thread.sleep((int)(Math.random()*2500)+500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "吃完了!");
	}
}
