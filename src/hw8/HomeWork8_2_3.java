package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//
//(以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
public class HomeWork8_2_3 {

	public static void main(String[] args) {
		Set<Train> set = new TreeSet<Train>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		for(Train t : set) {
			System.out.println("車次：" + t.getNumber() + 
								"、車種：" + t.getType() + 
								"、出發站：" + t.getStart() + 
								"、目的地：" + t.getDest() + 
								"、票價：" + t.getPrice());
		}
		
		System.out.println("-------------------");
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Train t = (Train)i.next();
			System.out.println("車次：" + t.getNumber() + 
					"、車種：" + t.getType() + 
					"、出發站：" + t.getStart() + 
					"、目的地：" + t.getDest() + 
					"、票價：" + t.getPrice());
		}
		
	}
}
