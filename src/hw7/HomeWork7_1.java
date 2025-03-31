package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//讀取這個Sample.txt檔案,並輸出以下訊息:Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
public class HomeWork7_1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("Sample.txt");
		FileReader r = new FileReader("Sample.txt");
		BufferedReader bsr = new BufferedReader(r);

		int i, y = 0;
		while ((i = bsr.read()) != -1) {
			y++;
		}
		
		
//		上面的迴圈已經把檔案閱讀完畢，指標已經在檔案的結尾，需要重新把指標復歸到檔案開頭
//		建立一個新的reader來覆蓋舊的
		r = new FileReader("Sample.txt");
		bsr =  new BufferedReader(r);
		
		int z = 0;
		String s;
		while ((s = bsr.readLine()) != null) {
			z++;
		}
		
		bsr.close();
		r.close();
		System.out.print(f.getName() + "檔案共有" + f.length() + "個位元組," + y + "個字元," + z + "列資料");

	}
}
