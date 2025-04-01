package hw7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)
public class HomeWork7_5 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\CJA101_Workspace\\Homework-20\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			

			((Cat)ois.readObject()).speak();
			((Dog)ois.readObject()).speak();
			
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
