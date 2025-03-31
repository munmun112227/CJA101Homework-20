package hw7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
//(使用append功能讓每次執行結果都能被保存起來)
public class HomeWork7_2 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileOutputStream data = new FileOutputStream("Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(data);
		PrintStream ps = new PrintStream(bos);
		
			for(int i = 1; i <= 10; i++) {
				ps.print((int)(Math.random()*1000) + 1 + " ");
			}
			
			System.out.print("建立檔案完成");
			ps.close();
			bos.close();
			data.close();
		}		
	}
