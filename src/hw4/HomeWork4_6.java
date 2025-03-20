package hw4;

//請算出每位同學考最高分的次數
public class HomeWork4_6 {
	public static void main(String[] args) {
		int[][] score = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75},
		};
//		放同學們考試最高分的次數
		int[] highestTime = new int[8];
		
//		從第一次的考試開始比較
		for(int i = 0; i < score.length; i++) {
//			從第一位同學開始與該次考試所有的成績比較
			a:
			for(int j = 0; j < score[i].length; j++) {
				for(int k = 0; k < score[i].length; k++) {
//					判斷同學的分數有沒有大於該次考試的其他分數，如果不是就換下一個同學，全部比較都是比較大次數就加1
					if(score[i][j] < score[i][k]) {
						continue a;
					}
					else {
						if(k == 7) {
							highestTime[j]++;
						}
					}
				}
			}
		}
//		印出同學們的次數
		for(int p = 0; p < highestTime.length; p++) {
			System.out.print((p + 1) + "號最高分次數：" + highestTime[p] + "\n");
		}
	}
}
