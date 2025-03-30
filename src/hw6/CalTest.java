package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);
		int x1, y1;
		while(true) {
			try {
				System.out.println("請輸入x的值");
//				當收到鍵盤打入的資料時，會送入buffer(緩衝區)給nextInt找下一個是整數的資料，並拿出buffer使用
				x1 = sc.nextInt();
				System.out.println("請輸入y的值");
				y1 = sc.nextInt();
				Calculator c = new Calculator(x1, y1);
				System.out.println(x1 + "的" + y1 + "次方是" + c.cal());
				break;
			} catch (InputMismatchException e) {
//				當沒有找到整數資料時就會丟出上面的例外，錯誤的資料還是留在buffer裡面，而且指標還是指向這個錯誤的資料
				System.out.println("格式錯誤!");
//				搜尋buffer裡面的下一個token，並且拿出buffer(目前指標指向是那個錯誤的資料(是一個token)，所以會取出)
				sc.next();
				continue;
			}catch (CalException e) {
				System.out.println(e.getMessage());
				continue;
			}

		}
		
	}
}
