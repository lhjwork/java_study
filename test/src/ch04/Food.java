package ch04;

public class Food {
	
	String name;
	int price;
	
	public Food(String n, int p) {
		this.name = n;
		this.price = p;
		
	}
	
	void myPrint() {
		System.out.println(name + " 가격은 " + price + "원 입니다.");
	}
}
