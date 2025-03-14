package hw1;

public class HomeWork1_2 {
//	請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	public static void main (String[] args) {
		int eggs = 200;
		System.out.println(eggs + "顆雞蛋總共" + (eggs/12) +"打" + (eggs % 12) + "顆。");
	}
}
