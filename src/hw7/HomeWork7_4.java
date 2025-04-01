package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
public class HomeWork7_4 {

	public static void main(String[] args) {
		HomeWork7_4 hw7 = new HomeWork7_4();
		Cat cat = new Cat("小花");
		Dog dog = new Dog("黑黑");
		
		try {
			File dir = new File("C:\\CJA101_Workspace\\Homework-20\\data");
			if(!dir.exists()) {
				dir.mkdir();
				System.out.println(dir.getName() + "資料夾已新增");
			}
			File file = new File("C:\\CJA101_Workspace\\Homework-20\\data\\Object.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cat);
			oos.writeObject(dog);
			
			oos.close();
			fos.close();
			
			System.out.println("輸出完成");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
