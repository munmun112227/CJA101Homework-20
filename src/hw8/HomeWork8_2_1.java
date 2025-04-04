package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


//請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//- 目的地 dest,型別為String - 票價 price,型別為double
//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)

//請寫一隻程式,能印出不重複的Train物件
//
//(以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
public class HomeWork8_2_1 {
	
	public static void main(String[] args) {
		Set<Train> set = new HashSet<Train>();
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
		
		System.out.println("-------------------------");
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

class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getDest() {
		return dest;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int compareTo(Train t) {
		if(this.number > t.number) {
			return -1;
		}else if(this.number == t.number){
			return 0;
		}
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	
}
