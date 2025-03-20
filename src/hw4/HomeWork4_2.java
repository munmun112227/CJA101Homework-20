package hw4;

import java.util.Scanner;

//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
public class HomeWork4_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入一段內容");
		String s = sc.nextLine();
		for(int i = s.length() -1 ; i > -1; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
