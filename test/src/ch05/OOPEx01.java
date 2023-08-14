package ch05;


class Player {
	String name; // 이름
	private int thirty; // 목마름 (0 ~ 100) // 외부 클래스에서 접근 불가능
	
	public Player(String name, int thirty) {
		this.name = name;
		this.thirty = thirty;
	}
	
	// 행위 = 매서드 = 값을 변경
	void 물마시기() {
		System.out.println("물마시기 행위");
		this.thirty = this.thirty - 50;
	}
	
	int 목마름상태확인() {
		return this.thirty;
	}

}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름은 : "+p1.name);
		System.out.println("갈증지수 : "+p1.목마름상태확인());
		
		
		// 1.첫번째 시나리오 = 마법(X)
		//p1.thirty = 50;//원인없이 갈증지수 변경 = 마법
		//System.out.println("갈증지수 : " + p1.thirty);
		
		//2.두번째 시나리오 = 상태가 행위를 변경함 (X)
		// 실수할 수 있는 시나리오의 코드를 짜면 안된다..
		//p1.물마시기();
		//p1.물마시기();
		//System.out.println("갈증지수 :" + p1.thirty);
		
		//3.번째 시나리오 
		// 접근제어자 = 디폴트 접근제어자, pubilc 접근제어자, private 접근제어자
		
		p1.물마시기();// 실수할 수가 없음.
		System.out.println("갈증지수 : " +p1.목마름상태확인());
	}

}
