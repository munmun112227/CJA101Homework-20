package hw9;

//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情形。

public class HomeWork9_2 {

	public static void main(String[] args) {
		Account acc = new Account();
		TransactionsAdd ta = new TransactionsAdd(2000, "媽媽", acc);
		TransactionsSub tb = new TransactionsSub(1000, "熊大", acc);
		
		ta.start();
		tb.start();
		
	}
}

class Account {
	private int balance = 0;

	synchronized public void deposit(int amount, String name) {
		while(balance < 3000) {
			balance += amount;
			System.out.println(name + "存了" + amount + "元，帳戶共有：" + balance + "元");
			notify();
 		}
		try {
			System.out.println(name + "看到餘額在3000元以上，暫停存款");
			System.out.println(name + "告知帳戶有錢了!");
			wait(10000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	synchronized public void payment(int amount, String name) {
		while(balance > 2000){
			balance -= amount;
			System.out.println(name + "領了" + amount + "元，帳戶共有：" + balance + "元");
		}
		try {
			System.out.println(name + "看到帳戶沒錢，暫停提款");
			System.out.println(name + "告知要匯錢了!");
			notify();
			wait(10000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class TransactionsAdd extends Thread {

	Account acc;
	int amount;
	String name;
	
	public TransactionsAdd (int amount, String name, Account acc) {
		this.amount = amount;
		this.name = name;
		this.acc = acc;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			acc.deposit(amount, name);
		}
	}
		
}

class TransactionsSub extends Thread {

	Account acc;
	int amount;
	String name; 
	
	public TransactionsSub(int amount, String name, Account acc) {
		this.amount = amount;
		this.name = name;
		this.acc = acc;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			acc.payment(amount, name);
		}
	}
}
