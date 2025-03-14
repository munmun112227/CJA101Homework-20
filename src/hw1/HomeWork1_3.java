package hw1;

public class HomeWork1_3 {
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main (String[] args) {
		int question = 256559;
		int	days = question/(60*60*24), modDays = question%(60*60*24);
		int hours = modDays/(60*60), modHours = modDays%(60*60);
		int minutes = modHours/60, modMinutes = modHours%60;
		int seconds = modMinutes;
		
//		
		System.out.println("256559秒為"+days+"天"+hours+"時"+minutes+"分"+seconds+"秒");
		
	}
}
