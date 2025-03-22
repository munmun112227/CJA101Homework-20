package hw5a;

//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合

public class HomeWork5_5 {

	public static void main(String[] args) {
		HomeWork5_5 h = new HomeWork5_5();
		char[] codes = h.genAuthCode();
		
		System.out.println("本次隨機產生驗證碼：");
		for(int i = 0; i < codes.length; i++) {
			System.out.print(codes[i]);
		}
		
	}
	
	char[] genAuthCode() {
		char[] code = new char[8];
		
		for(int i = 0; i < code.length; i++) {
//			亂數挑選該位數的字元是大小寫還是數字；0數字(48~57)、1小寫(97~122)、2大寫(65~90)
			int x = (int)(Math.random()*3);
//			根據上面亂碼跑出來的數字再進去相對應的case亂數跑出萬國碼放進陣列
			switch(x) {
			case 1:
				code[i] = (char)((Math.random()*26) + 97);
				break;
			case 2:
				code[i] = (char)((Math.random()*26) + 65);
				break;
			case 0:
				code[i] = (char)((Math.random()*10) + 48);
				break;
			}
		}
		return code;
	}
}
