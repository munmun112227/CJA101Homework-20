package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//
//(以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
public class HomeWork8_2_2 {

	public static void main(String[] args) {
		List<Train> list = new ArrayList<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(list);
		
		for(int a = 0; a < list.size(); a++) {
			System.out.println("車次：" + list.get(a).getNumber() + 
					"、車種：" + list.get(a).getType() + 
					"、出發站：" + list.get(a).getStart() + 
					"、目的地：" + list.get(a).getDest() + 
					"、票價：" + list.get(a).getPrice());
		}
		
		System.out.println("-------------------");
		
		for(Train t : list) {
			System.out.println("車次：" + t.getNumber() + 
					"、車種：" + t.getType() + 
					"、出發站：" + t.getStart() + 
					"、目的地：" + t.getDest() + 
					"、票價：" + t.getPrice());
		}
		
		System.out.println("-------------------");
		
		Iterator i = list.iterator();
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
