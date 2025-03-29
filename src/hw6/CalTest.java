package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("請輸入x的值");
				int x1 = sc.nextInt();
				System.out.println("請輸入y的值");
				int y1 = sc.nextInt();
				Calculator c = new Calculator(x1, y1);
				System.out.println(x1 + "的" + y1 + "次方是" + c.cal());
				break;
			}catch (CalException e) {
				System.out.println(e.getMessage());
				continue;
			}

		}
		
	}
}
