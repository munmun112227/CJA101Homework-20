package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//代表的檔案會複製到第二個參數代表的檔案
public class HomeWork7_3 {

	public static void main(String[] args) {

		HomeWork7_3 file = new HomeWork7_3();
		try {
			file.copyFile("Data.txt", "DataCopy.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copyFile(String a, String b) throws IOException {
		int data;
		FileInputStream fis = new FileInputStream(a);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream(b, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
			while((data = bis.read()) != -1) {
				bos.write(data);
				bos.flush();
			}

		System.out.println("完成複製");
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}
}
